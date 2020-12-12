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
package org.openhab.core.internal.events.system;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.events.AbstractEventFactory;
import org.openhab.core.events.Event;
import org.openhab.core.events.EventFactory;
import org.openhab.core.events.system.StartLevelEventFactory;
import org.openhab.core.events.system.StartlevelEvent;
import org.osgi.service.component.annotations.Component;

/**
 * Factory that creates system events.
 *
 * @author Kai Kreuzer - Initial contribution
 * @author Łukasz Dywicki - Separated interface and implementation.
 */
@Component(immediate = true, service = {StartLevelEventFactory.class, EventFactory.class})
public class CoreSystemEventFactory extends AbstractEventFactory implements StartLevelEventFactory {

    static final String SYSTEM_STARTLEVEL_TOPIC = "openhab/system/startlevel";

    public CoreSystemEventFactory() {
        super(Stream.of(StartlevelEvent.TYPE).collect(Collectors.toSet()));
    }

    /**
     * Creates a trigger event from a {@link Type}.
     *
     * @param startlevel Startlevel of system
     * @return Created start level event.
     */
    public StartlevelEvent createStartlevelEvent(Integer startlevel) {
        SystemEventPayloadBean bean = new SystemEventPayloadBean(startlevel);
        String payload = AbstractEventFactory.serializePayload(bean);
        return new StartlevelEvent(CoreSystemEventFactory.SYSTEM_STARTLEVEL_TOPIC, payload, null, startlevel);
    }

    @Override
    protected Event createEventByType(String eventType, String topic, String payload, String source) throws Exception {
        return createStartlevelEvent(topic, payload, source);
    }

    @Override
    public StartlevelEvent createStartlevelEvent(String topic, String payload, String source) {
        SystemEventPayloadBean bean = deserializePayload(payload, SystemEventPayloadBean.class);
        return new StartlevelEvent(topic, payload, source, bean.getStartlevel());
    }

}
