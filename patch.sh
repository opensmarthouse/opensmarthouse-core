#!/bin/bash

refactor() {
   sed -i'.original.diff' "s,$2,$3,g" $1
}

check=0

for arg in "$@"
do
    case "$arg" in
    -check)    check=1
            ;;
    esac
done

# Extract the commit title
title=$(sed '4q;d' $1)
title=${title##*]}

# Extract the openHAB commit reference
commit=$(sed '1q;d' $1)
commit=${commit:5}
commit=${commit:0:40}

# Create a new branch
if [ $check == 0 ]
then
   echo 
   echo
   echo This script will import a patch file from openHAB and migrate it to OpenSmartHouse.
   echo Since this will refactor some bundles, and other changes may have been made to OpenSmartHouse, there may be errors or merge rejections.
   echo You are therfore encouraged to use the "-check" option before performing the patch. This will show any errors or warnings before
   echo actually performing the patch.
   echo

   read -p "Do you wish to continue with the patch? [y/n] " -n 1 -r
   echo    # (optional) move to a new line
   if [[ ! $REPLY =~ ^[Yy]$ ]]
   then
      exit 1
   fi

#   git checkout -b $commit
fi

# Preserve the original file
cp $1 $1.tmp

# Patch specific classes that have moved package
refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/service/BundleResolverImpl.java"                                 "bundles/org.opensmarthouse.core.common/src/main/java/org/openhab/core/internal/common/osgi/BundleResolverImpl.java"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/types/util/UnitUtils.java"                                                "bundles/org.opensmarthouse.core.library.unit/src/main/java/org/openhab/core/types/util/UnitUtils.java"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/CoreItemFactory.java"                                             "bundles/org.opensmarthouse.core.item.core/src/main/java/org/openhab/core/internal/items/CoreItemFactory.java" 
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/CoreItemFactoryTest.java"                                         "bundles/org.opensmarthouse.core.item.core/src/test/java/org/openhab/core/internal/items/CoreItemFactoryTest.java"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/types/ArithmeticGroupFunction.java"                               "bundles/org.opensmarthouse.core.item/src/main/java/org/openhab/core/items/ArithmeticGroupFunction.java"
refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/types/DateTimeGroupFunction.java"                                 "bundles/org.opensmarthouse.core.item/src/main/java/org/openhab/core/items/DateTimeGroupFunction.java"
refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/types/QuantityTypeArithmeticGroupFunction.java"                   "bundles/org.opensmarthouse.core.item/src/main/java/org/openhab/core/items/QuantityTypeArithmeticGroupFunction.java"

refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/types/ArithmeticGroupFunctionTest.java"                           "bundles/org.opensmarthouse.core.item.core/src/test/java/org/openhab/core/internal/items/function/ArithmeticGroupFunctionTest.java"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/types/DateTimeGroupFunctionTest.java"                             "bundles/org.opensmarthouse.core.item.core/src/test/java/org/openhab/core/internal/items/function/DateTimeGroupFunctionTest.java"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/types/QuantityTypeArithmeticGroupFunctionTest.java"               "bundles/org.opensmarthouse.core.item.core/src/test/java/org/openhab/core/internal/items/function/QuantityTypeArithmeticGroupFunctionTest.java"

refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/dimension/VolumetricFlowRateTest.java"                            "bundles/org.opensmarthouse.core.library.unit/src/test/java/org/openhab/core/library/unit/VolumetricFlowRateTest.java"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/events/system/SystemEventFactory.java"                                    "bundles/org.opensmarthouse.core.event.core/src/main/java/org/openhab/core/events/system/SystemEventFactory.java"

#refactor $1 "bundles/org.openhab.core.thing/src/main/java/org/openhab/core/thing/link/events/LinkEventFactory.java"                            "bundles/org.opensmarthouse.core.thing.core/src/main/java/org/openhab/core/thing/internal/link/events/LinkEventFactory.java"

#refactor $1 "bundles/org.openhab.core.thing/src/test/java/org/openhab/core/thing/binding/builder/ChannelBuilderTest.java"                      "bundles/org.opensmarthouse.core.thing.core/src/test/java/org/openhab/core/thing/internal/builder/ChannelBuilderTest.java"
#refactor $1 "bundles/org.openhab.core.thing/src/test/java/org/openhab/core/thing/binding/builder/ThingBuilderTest.java"                        "bundles/org.opensmarthouse.core.thing.core/src/test/java/org/openhab/core/thing/internal/builder/ThingBuilderTest.java"

refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/types/CommandDescriptionBuilderTest.java"                                 "bundles/org.opensmarthouse.core.type.core/src/test/java/org/openhab/core/types/CommandDescriptionBuilderTest.java"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/types/StateDescriptionFragmentBuilderTest.java"                           "bundles/org.opensmarthouse.core.type.core/src/test/java/org/openhab/core/types/StateDescriptionFragmentBuilderTest.java"

#refactor $1 "bundles/org.openhab.core.config.core/src/main/java/org/openhab/core/config/core/internal/ConfigMapper.java"                        "bundles/org.opensmarthouse.core.config/src/main/java/org/openhab/core/config/core/ConfigMapper.java"
refactor $1 "bundles/org.openhab.core.config.core/src/main/java/org/openhab/core/config/core/internal/net/NetworkConfigOptionProvider.java"     "bundles/org.opensmarthouse.core.config.net/src/main/java/org/openhab/core/config/core/internal/net/NetworkConfigOptionProvider.java"

refactor $1 "bundles/org.openhab.core.id/src/main/java/org/openhab/core/id/internal/UUIDResource.java"                                          "bundles/org.opensmarthouse.core.io.rest.id/src/main/java/org/openhab/core/id/internal/UUIDResource.java"

refactor $1 "bundles/org.openhab.core.io.transport.serial/src/main/java/org/openhab/core/io/transport/serial/internal/SerialPortRegistry.java"  "bundles/org.opensmarthouse.core.io.transport.serial/src/main/java/org/openhab/core/io/transport/serial/internalSerialPortRegistryImpl.java"
refactor $1 "bundles/org.openhab.core.io.transport.serial/src/main/java/org/openhab/core/io/transport/serial/internal/SerialPortProvider.java"  "bundles/org.opensmarthouse.core.io.transport.serial/src/main/java/org/openhab/core/io/transport/serial/SerialPortProvider.java"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/addon/AddonEventFactory.java"                                              "bundles/org.opensmarthouse.core.extension/src/main/java/org/openhab/core/extension/ExtensionEventFactory.java"

refactor $1 "bundles/org.openhab.core.ui/src/main/java/org/openhab/core/ui/internal/items/ItemUIRegistryImpl.java"                              "bundles/org.opensmarthouse.core.ui.sitemap/src/main/java/org/openhab/core/ui/internal/items/ItemUIRegistryImpl.java"
refactor $1 "bundles/org.openhab.core.ui/src/test/java/org/openhab/core/ui/internal/items/ItemUIRegistryImplTest.java"                          "bundles/org.opensmarthouse.core.ui.sitemap/src/test/java/org/openhab/core/ui/internal/items/ItemUIRegistryImplTest.java"


# Patch and refactored bundles - migrating packages to new bundles
refactor $1 "bundles/org.openhab.core.audio/src/main/java/org/openhab/core/audio/internal/"                               "bundles/org.opensmarthouse.core.audio.core/src/main/java/org/openhab/core/audio/internal/"
refactor $1 "bundles/org.openhab.core.audio/src/test/java/org/openhab/core/audio/internal/"                               "bundles/org.opensmarthouse.core.audio.core/src/test/java/org/openhab/core/audio/internal/"
refactor $1 "bundles/org.openhab.core.audio/src/main/resources"                                                           "bundles/org.opensmarthouse.core.audio.core/src/main/resources"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/items"                                               "bundles/org.opensmarthouse.core.item/src/main/java/org/openhab/core/items"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/items"                                               "bundles/org.opensmarthouse.core.item/src/test/java/org/openhab/core/items"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/items"                                      "bundles/org.opensmarthouse.core.item.core/src/main/java/org/openhab/core/internal/items"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/items"                                      "bundles/org.opensmarthouse.core.item.core/src/test/java/org/openhab/core/internal/items"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/types"                                               "bundles/org.opensmarthouse.core.type/src/main/java/org/openhab/core/types"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/types"                                               "bundles/org.opensmarthouse.core.type/src/test/java/org/openhab/core/types"

refactor $1 "bundles/org.openhab.core.auth.oauth2client/src/main/java/org/openhab/core/auth/oauth2client/internal/"       "bundles/org.opensmarthouse.core.auth.oauth2client.core/src/main/java/org/openhab/core/auth/oauth2client/internal/"
refactor $1 "bundles/org.openhab.core.auth.oauth2client/src/test/java/org/openhab/core/auth/oauth2client/internal/"       "bundles/org.opensmarthouse.core.auth.oauth2client.core/src/test/java/org/openhab/core/auth/oauth2client/internal/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/auth/client/oauth2/"                                 "bundles/org.opensmarthouse.core.auth.oauth2client/src/main/java/org/openhab/core/auth/client/oauth2/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/auth/client/oauth2/"                                 "bundles/org.opensmarthouse.core.auth.oauth2client/src/test/java/org/openhab/core/auth/client/oauth2/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/auth/"                                      "bundles/org.opensmarthouse.core.auth.core/src/main/java/org/openhab/core/internal/auth/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/auth/"                                      "bundles/org.opensmarthouse.core.auth.core/src/test/java/org/openhab/core/internal/auth/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/auth/"                                               "bundles/org.opensmarthouse.core.auth/src/main/java/org/openhab/core/auth/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/auth/"                                               "bundles/org.opensmarthouse.core.auth/src/test/java/org/openhab/core/auth/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/storage/"                                            "bundles/org.opensmarthouse.core.storage/src/main/java/org/openhab/core/storage/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/storage/"                                            "bundles/org.opensmarthouse.core.storage/src/test/java/org/openhab/core/storage/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/common/registry/"                                    "bundles/org.opensmarthouse.core.registry/src/main/java/org/openhab/core/common/registry/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/common/registry/"                                    "bundles/org.opensmarthouse.core.registry/src/test/java/org/openhab/core/common/registry/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/common/"                                             "bundles/org.opensmarthouse.core.common/src/main/java/org/openhab/core/common/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/common/"                                             "bundles/org.opensmarthouse.core.common/src/test/java/org/openhab/core/common/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/common/"                                    "bundles/org.opensmarthouse.core.common/src/main/java/org/openhab/core/internal/common/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/common/"                                    "bundles/org.opensmarthouse.core.common/src/test/java/org/openhab/core/internal/common/"

# Config relocation
#refactor $1 "bundles/org.openhab.core.config.core/src/main/java/org/openhab/core/config/core/internal/"                   "bundles/org.opensmarthouse.core.config.core/src/main/java/org/openhab/core/config/core/internal/"
#refactor $1 "bundles/org.openhab.core.config.core/src/test/java/org/openhab/core/config/core/internal/"                   "bundles/org.opensmarthouse.core.config.core/src/test/java/org/openhab/core/config/core/internal/"

refactor $1 "bundles/org.openhab.core.config.core/src/main/java/org/openhab/core/config/core/"                            "bundles/org.opensmarthouse.core.config/src/main/java/org/openhab/core/config/core/"
refactor $1 "bundles/org.openhab.core.config.core/src/test/java/org/openhab/core/config/core/"                            "bundles/org.opensmarthouse.core.config/src/test/java/org/openhab/core/config/core/"

refactor $1 "bundles/org.openhab.core.config.core/src/main/java/org/openhab/core/config/internal/net/"                     "bundles/org.opensmarthouse.core.config.net/src/main/java/org/openhab/core/config/internal/net/"

# Discovery
refactor $1 "bundles/org.openhab.core.config.discovery/src/main/java/org/openhab/core/config/discovery/internal/console/" "bundles/org.opensmarthouse.core.config.discovery.console/src/main/java/org/openhab/core/config/discovery/internal/console/"

#refactor $1 "bundles/org.openhab.core.config.discovery/src/main/java/org/openhab/core/config/discovery/internal/"         "bundles/org.opensmarthouse.core.config.discovery.core/src/main/java/org/openhab/core/config/discovery/internal/"
#refactor $1 "bundles/org.openhab.core.config.discovery/src/test/java/org/openhab/core/config/discovery/internal/"         "bundles/org.opensmarthouse.core.config.discovery.core/src/test/java/org/openhab/core/config/discovery/internal/"
#refactor $1 "bundles/org.openhab.core.config.discovery/src/main/resources/"                                               "bundles/org.opensmarthouse.core.config.discovery.core/src/main/resources/"

# REST reolocations
refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/binding/"         "bundles/org.opensmarthouse.core.io.rest.binding/src/main/java/org/openhab/core/io/rest/core/internal/binding/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/binding/"         "bundles/org.opensmarthouse.core.io.rest.binding/src/test/java/org/openhab/core/io/rest/core/internal/binding/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/channel/"         "bundles/org.opensmarthouse.core.io.rest.channel/src/main/java/org/openhab/core/io/rest/core/internal/channel/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/channel/"         "bundles/org.opensmarthouse.core.io.rest.channel/src/test/java/org/openhab/core/io/rest/core/internal/channel/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/config/"                   "bundles/org.opensmarthouse.core.io.rest.config/src/main/java/org/openhab/core/io/rest/core/config/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/config/"                   "bundles/org.opensmarthouse.core.io.rest.config/src/test/java/org/openhab/core/io/rest/core/config/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/config/"          "bundles/org.opensmarthouse.core.io.rest.config/src/main/java/org/openhab/core/io/rest/core/internal/config/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/config/"          "bundles/org.opensmarthouse.core.io.rest.config/src/test/java/org/openhab/core/io/rest/core/internal/config/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/discovery/"       "bundles/org.opensmarthouse.core.io.rest.discovery/src/main/java/org/openhab/core/io/rest/core/internal/discovery/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/discovery/"       "bundles/org.opensmarthouse.core.io.rest.discovery/src/test/java/org/openhab/core/io/rest/core/internal/discovery/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/extensions/"      "bundles/org.opensmarthouse.core.io.rest.extension/src/main/java/org/openhab/core/io/rest/core/internal/extensions/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/extensions/"      "bundles/org.opensmarthouse.core.io.rest.extension/src/test/java/org/openhab/core/io/rest/core/internal/extensions/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/link/"            "bundles/org.opensmarthouse.core.io.rest.item/src/main/java/org/openhab/core/io/rest/core/internal/link/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/link/"            "bundles/org.opensmarthouse.core.io.rest.item/src/test/java/org/openhab/core/io/rest/core/internal/link/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/item/"                     "bundles/org.opensmarthouse.core.io.rest.item/src/main/java/org/openhab/core/io/rest/core/item/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/item/"                     "bundles/org.opensmarthouse.core.io.rest.item/src/test/java/org/openhab/core/io/rest/core/item/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/item/"            "bundles/org.opensmarthouse.core.io.rest.item/src/main/java/org/openhab/core/io/rest/core/internal/item/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/item/"            "bundles/org.opensmarthouse.core.io.rest.item/src/test/java/org/openhab/core/io/rest/core/internal/item/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/service/"                  "bundles/org.opensmarthouse.core.io.rest.service/src/main/java/org/openhab/core/io/rest/core/service/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/service/"                  "bundles/org.opensmarthouse.core.io.rest.service/src/test/java/org/openhab/core/io/rest/core/service/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/service/"         "bundles/org.opensmarthouse.core.io.rest.service/src/main/java/org/openhab/core/io/rest/core/internal/service/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/service/"         "bundles/org.opensmarthouse.core.io.rest.service/src/test/java/org/openhab/core/io/rest/core/internal/service/"


refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/persistence/"              "bundles/org.opensmarthouse.core.io.rest.persistence/src/main/java/org/openhab/core/io/rest/core/persistence/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/persistence/"              "bundles/org.opensmarthouse.core.io.rest.persistence/src/test/java/org/openhab/core/io/rest/core/persistence/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/persistence/"     "bundles/org.opensmarthouse.core.io.rest.persistence/src/main/java/org/openhab/core/io/rest/core/internal/persistence/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/persistence/"     "bundles/org.opensmarthouse.core.io.rest.persistence/src/test/java/org/openhab/core/io/rest/core/internal/persistence/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/thing/internal/console/"                "bundles/org.opensmarthouse.core.io.rest.thing/src/main/java/org/openhab/core/thing/internal/console/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/thing/internal/console/"                "bundles/org.opensmarthouse.core.io.rest.thing/src/test/java/org/openhab/core/thing/internal/console/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/thing/"                    "bundles/org.opensmarthouse.core.io.rest.thing/src/main/java/org/openhab/core/io/rest/core/thing/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/thing/"                    "bundles/org.opensmarthouse.core.io.rest.thing/src/test/java/org/openhab/core/io/rest/core/thing/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/thing/"           "bundles/org.opensmarthouse.core.io.rest.thing/src/main/java/org/openhab/core/io/rest/core/internal/thing/"
refactor $1 "bundles/org.openhab.core.io.rest.core/src/test/java/org/openhab/core/io/rest/core/internal/thing/"           "bundles/org.opensmarthouse.core.io.rest.thing/src/test/java/org/openhab/core/io/rest/core/internal/thing/"

refactor $1 "bundles/org.openhab.core.thing/src/main/java/org/openhab/core/thing/internal/console/"                       "bundles/org.opensmarthouse.core.thing.console/src/main/java/org/openhab/core/thing/internal/console/"
refactor $1 "bundles/org.openhab.core.thing/src/test/java/org/openhab/core/thing/internal/console/"                       "bundles/org.opensmarthouse.core.thing.console/src/test/java/org/openhab/core/thing/internal/console/"

#refactor $1 "bundles/org.openhab.core.thing/src/main/java/org/openhab/core/thing/internal/"                               "bundles/org.opensmarthouse.core.thing.core/src/main/java/org/openhab/core/thing/internal/"
#refactor $1 "bundles/org.openhab.core.thing/src/test/java/org/openhab/core/thing/internal/"                               "bundles/org.opensmarthouse.core.thing.core/src/test/java/org/openhab/core/thing/internal/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/i18n/"                                               "bundles/org.opensmarthouse.core.i18n/src/main/java/org/openhab/core/i18n/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/i18n/"                                               "bundles/org.opensmarthouse.core.i18n/src/test/java/org/openhab/core/i18n/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/i18n/"                                      "bundles/org.opensmarthouse.core.i18n.core/src/main/java/org/openhab/core/internal/i18n/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/i18n/"                                      "bundles/org.opensmarthouse.core.i18n.core/src/test/java/org/openhab/core/internal/i18n/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/events/"                                             "bundles/org.opensmarthouse.core.event/src/main/java/org/openhab/core/events/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/events/"                                             "bundles/org.opensmarthouse.core.event/src/test/java/org/openhab/core/events/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/events/system/"                                      "bundles/org.opensmarthouse.core.event.core/src/main/java/org/openhab/core/events/system/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/events/system/"                                      "bundles/org.opensmarthouse.core.event.core/src/test/java/org/openhab/core/events/system/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/events/"                                    "bundles/org.opensmarthouse.core.event.core/src/main/java/org/openhab/core/internal/events/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/events/"                                    "bundles/org.opensmarthouse.core.event.core/src/test/java/org/openhab/core/internal/events/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/extension/"                                          "bundles/org.opensmarthouse.core.extension/src/main/java/org/openhab/core/extension/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/extension/"                                          "bundles/org.opensmarthouse.core.extension/src/test/java/org/openhab/core/extension/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/service/"                                            "bundles/org.opensmarthouse.core.service/src/main/java/org/openhab/core/service/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/service/"                                            "bundles/org.opensmarthouse.core.service/src/test/java/org/openhab/core/service/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/service/"                                   "bundles/org.opensmarthouse.core.service.core/src/main/java/org/openhab/core/internal/service/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/service/"                                   "bundles/org.opensmarthouse.core.service.core/src/test/java/org/openhab/core/internal/service/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/net/"                                                "bundles/org.opensmarthouse.core.net/src/main/java/org/openhab/core/net/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/net/"                                                "bundles/org.opensmarthouse.core.net/src/test/java/org/openhab/core/net/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/types/util/"                                         "bundles/org.opensmarthouse.core.library.unit/src/main/java/org/openhab/core/types/util/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/types/util/"                                         "bundles/org.opensmarthouse.core.library.unit/src/test/java/org/openhab/core/types/util/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/unit/"                                       "bundles/org.opensmarthouse.core.library.unit/src/main/java/org/openhab/core/library/unit/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/unit/"                                       "bundles/org.opensmarthouse.core.library.unit/src/test/java/org/openhab/core/library/unit/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/items/"                                      "bundles/org.opensmarthouse.core.library.item/src/main/java/org/openhab/core/library/items/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/items/"                                      "bundles/org.opensmarthouse.core.library.item/src/test/java/org/openhab/core/library/items/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/library/types/"                                      "bundles/org.opensmarthouse.core.library.type/src/main/java/org/openhab/core/library/types/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/library/types/"                                      "bundles/org.opensmarthouse.core.library.type/src/test/java/org/openhab/core/library/types/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/internal/scheduler/"                                 "bundles/org.opensmarthouse.core.scheduler.core/src/main/java/org/openhab/core/internal/scheduler/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/internal/scheduler/"                                 "bundles/org.opensmarthouse.core.scheduler.core/src/test/java/org/openhab/core/internal/scheduler/"

refactor $1 "bundles/org.openhab.core/src/main/java/org/openhab/core/util/"                                               "bundles/org.opensmarthouse.core.util/src/main/java/org/openhab/core/util/"
refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/util/"                                               "bundles/org.opensmarthouse.core.util/src/test/java/org/openhab/core/util/"

refactor $1 "bundles/org.openhab.core.io.rest.core/src/main/java/org/openhab/core/io/rest/core/internal/profile"          "bundles/org.opensmarthouse.core.io.rest.item/src/main/java/org/openhab/core/io/rest/core/internal/profile"

refactor $1 "bundles/org.openhab.core/src/test/java/org/openhab/core/cache/"                                              "bundles/org.opensmarthouse.core.cache/src/test/java/org/openhab/core/cache/"

refactor $1 "bundles/org.openhab.core.voice/src/main/java/org/openhab/core/voice/internal/"                               "bundles/org.opensmarthouse.core.voice.core/src/main/java/org/openhab/core/voice/internal/"
refactor $1 "bundles/org.openhab.core.voice/src/test/java/org/openhab/core/voice/internal/"                               "bundles/org.opensmarthouse.core.voice.core/src/test/java/org/openhab/core/voice/internal/"
refactor $1 "bundles/org.openhab.core.voice/src/main/resources"                                                           "bundles/org.opensmarthouse.core.voice.core/src/main/resources"

refactor $1 "bundles/org.openhab.core.ui/src/main/java/org/openhab/core/ui/chart/"                                        "bundles/org.opensmarthouse.core.ui.chart/src/main/java/org/openhab/core/ui/chart/"
refactor $1 "bundles/org.openhab.core.ui/src/main/java/org/openhab/core/ui/internal/chart/"                               "bundles/org.opensmarthouse.core.ui.chart/src/main/java/org/openhab/core/ui/internal/chart/"

refactor $1 "bundles/org.openhab.core.ui/src/main/java/org/openhab/core/ui/internal/proxy/"                               "bundles/org.opensmarthouse.core.ui.proxy/src/main/java/org/openhab/core/ui/internal/proxy/"
refactor $1 "bundles/org.openhab.core.ui/src/test/java/org/openhab/core/ui/internal/proxy/"                               "bundles/org.opensmarthouse.core.ui.proxy/src/test/java/org/openhab/core/ui/internal/proxy/"

refactor $1 "bundles/org.openhab.core.ui/src/test/java/org/openhab/core/ui/sitemap/"                                      "bundles/org.opensmarthouse.core.ui.sitemap/src/test/java/org/openhab/core/ui/sitemap/"


# Catch-all. Must be last!
refactor $1 "itests/org.openhab.core"  "itests/org.opensmarthouse.core"
refactor $1 "bundles/org.openhab.core" "bundles/org.opensmarthouse.core"


if [ $check == 1 ]
then
    echo Only performing a git check - patch will not be applied
    # Check if the commit will work
    git apply --check $1
else
    echo Applying patch
    # Commit the changes
    git apply --reject $1
fi

# Restore the original file
rm $1
rm $1.original.diff
mv $1.tmp $1

echo --- Patch Information ---
echo $title
echo $commit
