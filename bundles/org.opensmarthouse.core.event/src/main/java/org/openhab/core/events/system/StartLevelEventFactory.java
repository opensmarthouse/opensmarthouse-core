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
package org.openhab.core.events.system;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.events.EventFactory;

/**
 * Factory that creates system events.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Łukasz Dywicki - Made {@link #createStartlevelEvent(Integer)} non static/public interface.
 */
@NonNullByDefault
public interface StartLevelEventFactory extends EventFactory {

  /**
   * Creates a trigger event from a {@link Type}.
   *
   * @param startlevel Startlevel of system
   * @return Created start level event.
   */
  StartlevelEvent createStartlevelEvent(Integer startlevel);

  /**
   * Creates a startlevel event from a payload.
   *
   * @param topic Event topic
   * @param source Event source
   * @param payload Payload
   * @return created startlevel event
   */
  StartlevelEvent createStartlevelEvent(String topic, String payload, @Nullable String source);

  /**
   * This is a java bean that is used to serialize/deserialize system event payload.
   */
  public static class SystemEventPayloadBean {
    private @NonNullByDefault({}) Integer startlevel;

    /**
     * Default constructor for deserialization e.g. by Gson.
     */
    protected SystemEventPayloadBean() {
    }

    public SystemEventPayloadBean(Integer startlevel) {
      this.startlevel = startlevel;
    }

    public Integer getStartlevel() {
      return startlevel;
    }
  }

}
