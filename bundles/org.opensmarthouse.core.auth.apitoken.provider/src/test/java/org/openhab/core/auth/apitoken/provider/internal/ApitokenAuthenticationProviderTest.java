/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.auth.apitoken.provider.internal;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openhab.core.auth.AuthenticationException;
import org.openhab.core.auth.local.ManagedUser;
import org.openhab.core.auth.local.UserApiToken;
import org.openhab.core.auth.local.UserRegistry;
import org.openhab.core.auth.apitoken.UserApiTokenCredentials;

@ExtendWith(MockitoExtension.class)
class ApitokenAuthenticationProviderTest {

  public static final String TOKEN_X = "X";
  public static final String TOKEN_Y = "Y";
  public static final String TOKEN_Z = "Z";
  private static final String TOKEN_SALT = "asdf";


  @Mock
  private UserRegistry registry;

  private ApitokenAuthenticationProvider provider;

  @BeforeEach
  public void setup() throws Exception {
    provider = new ApitokenAuthenticationProvider(registry);

    List<ManagedUser> users = Arrays.asList(
      createUser("foo", "x", TOKEN_SALT, TOKEN_X),
      createUser("bar", "y", TOKEN_SALT, TOKEN_Y),
      createUser("baz", "z", TOKEN_SALT, TOKEN_Z)
    );
    when(registry.getAll()).thenAnswer((inv) -> users);
  }

  @Test
  public void testApiTokens() throws Exception {
    String token1 = UserRegistry.APITOKEN_PREFIX + ".x." + TOKEN_X;
    String token2 = UserRegistry.APITOKEN_PREFIX + ".y." + TOKEN_Y;
    String token3 = UserRegistry.APITOKEN_PREFIX + ".z." + TOKEN_Z;

    provider.authenticate(new UserApiTokenCredentials(token1));
    provider.authenticate(new UserApiTokenCredentials(token2));
    provider.authenticate(new UserApiTokenCredentials(token3));
  }

  @Test
  public void testInvalidTokens() throws Exception {
    String token1 = UserRegistry.APITOKEN_PREFIX + ".x.x";
    String token2 = UserRegistry.APITOKEN_PREFIX + ".Y.y";

    Assertions.assertThrows(AuthenticationException.class, () -> provider.authenticate(new UserApiTokenCredentials(token1)));
    Assertions.assertThrows(AuthenticationException.class, () -> provider.authenticate(new UserApiTokenCredentials(token2)));
  }

  private ManagedUser createUser(String name, String tokenId, String tokenSalt, String tokenValue) {
    ManagedUser user = mock(ManagedUser.class, name);

    String token = UserRegistry.APITOKEN_PREFIX + "." + tokenId + "." + tokenValue;
    String tokenHash = UserRegistry.hash(token, tokenSalt, UserRegistry.APITOKEN_ITERATIONS).get();
    System.out.println(token);

    UserApiToken userApiToken = new UserApiToken(tokenId, tokenHash + ":" + tokenSalt, "");
    when(user.getApiTokens()).thenReturn(Collections.singletonList(userApiToken));
    return user;
  }

}