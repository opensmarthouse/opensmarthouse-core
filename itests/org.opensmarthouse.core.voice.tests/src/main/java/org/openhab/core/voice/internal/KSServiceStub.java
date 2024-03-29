/**
 * Copyright (c) 2020-2021 Contributors to the OpenSmartHouse project
 * Copyright (c) 2010-2021 Contributors to the openHAB project
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
package org.openhab.core.voice.internal;

import java.util.Locale;
import java.util.Set;

import org.openhab.core.audio.AudioFormat;
import org.openhab.core.audio.AudioStream;
import org.openhab.core.voice.KSException;
import org.openhab.core.voice.KSListener;
import org.openhab.core.voice.KSService;
import org.openhab.core.voice.KSServiceHandle;

/**
 * A {@link KSService} stub used for the tests.
 *
 * @author Mihaela Memova - Initial contribution
 * @author Velin Yordanov - migrated from groovy to java
 */
public class KSServiceStub implements KSService {

    private static final Set<AudioFormat> SUPPORTED_FORMATS = Set.of(AudioFormat.MP3, AudioFormat.WAV);

    private static final String KSSERVICE_STUB_ID = "ksServiceStubID";
    private static final String KSSERVICE_STUB_LABEL = "ksServiceStubLabel";

    private boolean isWordSpotted;
    private boolean isKSExceptionExpected;

    @Override
    public String getId() {
        return KSSERVICE_STUB_ID;
    }

    public void setIsKsExceptionExpected(boolean value) {
        this.isKSExceptionExpected = value;
    }

    @Override
    public String getLabel(Locale locale) {
        return KSSERVICE_STUB_LABEL;
    }

    @Override
    public Set<Locale> getSupportedLocales() {
        return Set.of();
    }

    @Override
    public Set<AudioFormat> getSupportedFormats() {
        return SUPPORTED_FORMATS;
    }

    @Override
    public KSServiceHandle spot(KSListener ksListener, AudioStream audioStream, Locale locale, String keyword)
            throws KSException {
        if (isKSExceptionExpected) {
            throw new KSException("Expected KSException");
        } else {
            isWordSpotted = true;
            return new KSServiceHandle() {
                @Override
                public void abort() {
                }
            };
        }
    }

    public boolean isWordSpotted() {
        return isWordSpotted;
    }

    @Override
    public String toString() {
        return getId();
    }
}
