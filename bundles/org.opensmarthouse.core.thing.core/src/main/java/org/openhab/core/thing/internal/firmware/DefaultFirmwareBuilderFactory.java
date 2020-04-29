package org.openhab.core.thing.internal.firmware;

import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.firmware.FirmwareBuilder;
import org.openhab.core.thing.binding.firmware.FirmwareBuilderFactory;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of {@link FirmwareBuilderFactory}.
 *
 * This type is extracted from incarnations of {@link FirmwareBuilderImpl} which offered a static create method.
 *
 * @author Łukasz Dywicki - Initial contribution.
 */
@Component(service = FirmwareBuilderFactory.class)
public class DefaultFirmwareBuilderFactory implements FirmwareBuilderFactory {

    @Override
    public FirmwareBuilder create(ThingTypeUID thingTypeUID, String firmwareVersion) {
        return new FirmwareBuilderImpl(thingTypeUID, firmwareVersion);
    }
}
