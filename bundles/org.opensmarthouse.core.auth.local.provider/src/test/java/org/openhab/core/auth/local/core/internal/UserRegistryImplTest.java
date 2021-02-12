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
package org.openhab.core.auth.local.core.internal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openhab.core.auth.local.ManagedUser;
import org.openhab.core.auth.local.User;
import org.openhab.core.auth.password.UsernamePasswordCredentials;
import org.openhab.core.auth.local.UserSession;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

/**
 * @author Yannick Schaus - Initial contribution
 */
@ExtendWith(MockitoExtension.class)
public class UserRegistryImplTest {

    @SuppressWarnings("rawtypes")
    private @Mock ServiceReference managedProviderRef;
    private @Mock BundleContext bundleContext;
    private @Mock ManagedUserProvider managedProvider;

    private UserRegistryImpl registry;
    private ServiceListener providerTracker;

    @BeforeEach
    @SuppressWarnings("unchecked")
    public void setup() throws Exception {
        when(bundleContext.getService(same(managedProviderRef))).thenReturn(managedProvider);

        registry = new UserRegistryImpl(bundleContext, Map.of());
        registry.setManagedProvider(managedProvider);
        registry.waitForCompletedAsyncActivationTasks();

        ArgumentCaptor<ServiceListener> captor = ArgumentCaptor.forClass(ServiceListener.class);
        verify(bundleContext).addServiceListener(captor.capture(), any());
        providerTracker = captor.getValue();
        providerTracker.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, managedProviderRef));
    }

    @Test
    public void testGetEmpty() throws Exception {
        User res = registry.get("none");
        assertNull(res);
    }

    @Test
    public void testUserManagement() throws Exception {
        User user = registry.register("username", "password", Set.of("administrator"));
        registry.added(managedProvider, user);
        assertNotNull(user);
        registry.authenticate(new UsernamePasswordCredentials("username", "password"));
        registry.changePassword(user, "password2");
        registry.authenticate(new UsernamePasswordCredentials("username", "password2"));
        registry.remove(user.getName());
        registry.removed(managedProvider, user);
        user = registry.get("username");
        assertNull(user);
    }

    @Test
    public void testSessions() throws Exception {
        ManagedUser user = (ManagedUser) registry.register("username", "password", Set.of("administrator"));
        registry.added(managedProvider, user);
        assertNotNull(user);
        UserSession session1 = new UserSession(UUID.randomUUID().toString(), "s1", "urn:test", "urn:test", "scope");
        UserSession session2 = new UserSession(UUID.randomUUID().toString(), "s2", "urn:test", "urn:test", "scope2");
        UserSession session3 = new UserSession(UUID.randomUUID().toString(), "s3", "urn:test", "urn:test", "scope3");
        registry.addUserSession(user, session1);
        registry.addUserSession(user, session2);
        registry.addUserSession(user, session3);
        assertEquals(user.getSessions().size(), 3);
        registry.removeUserSession(user, session3);
        assertEquals(user.getSessions().size(), 2);
        registry.clearSessions(user);
        assertEquals(user.getSessions().size(), 0);
    }

}
