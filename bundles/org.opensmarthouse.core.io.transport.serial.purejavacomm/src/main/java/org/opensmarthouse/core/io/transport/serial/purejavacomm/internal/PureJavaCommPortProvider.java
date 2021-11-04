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
package org.opensmarthouse.core.io.transport.serial.purejavacomm.internal;

import java.net.URI;
import java.util.Enumeration;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openhab.core.io.transport.serial.ProtocolType;
import org.openhab.core.io.transport.serial.ProtocolType.PathType;
import org.openhab.core.io.transport.serial.SerialPortIdentifier;
import org.openhab.core.io.transport.serial.SerialPortProvider;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import purejavacomm.CommPortIdentifier;
import purejavacomm.NoSuchPortException;

/**
 * A pure java serial port provider.
 *
 * Underlying implementation is based upon purejavacomm library and JNA.
 * 
 * @author Łukasz Dywicki - initial contribution from ConnectorIO
 */
@Component(service = SerialPortProvider.class)
public class PureJavaCommPortProvider implements SerialPortProvider {

  private final Logger logger = LoggerFactory.getLogger(PureJavaCommPortProvider.class);

  @Override
  public SerialPortIdentifier getPortIdentifier(URI port) {
    CommPortIdentifier ident = null;
    try {
      ident = CommPortIdentifier.getPortIdentifier(port.getPath());
    } catch (NoSuchPortException e) {
      logger.debug("No SerialPortIdentifier found for: {}", port.getPath());
      return null;
    }
    return new PureJavaCommSerialPortIdentifier(ident);
  }

  @Override
  public Stream<ProtocolType> getAcceptedProtocols() {
    return Stream.of(new ProtocolType(PathType.LOCAL, "purejavacomm"));
  }

  @Override
  public Stream<SerialPortIdentifier> getSerialPortIdentifiers() {
    @SuppressWarnings("unchecked")
    final Enumeration<CommPortIdentifier> ids = CommPortIdentifier.getPortIdentifiers();
    return StreamSupport.stream(new SplitIteratorForEnumeration<>(ids), false)
        .filter(id -> id.getPortType() == CommPortIdentifier.PORT_SERIAL).map(PureJavaCommSerialPortIdentifier::new);
  }

  private static class SplitIteratorForEnumeration<T> extends Spliterators.AbstractSpliterator<T> {
    private final Enumeration<T> e;

    public SplitIteratorForEnumeration(final Enumeration<T> e) {
      super(Long.MAX_VALUE, Spliterator.ORDERED);
      this.e = e;
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action) {
      if (e.hasMoreElements()) {
        action.accept(e.nextElement());
        return true;
      }
      return false;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
      while (e.hasMoreElements()) {
        action.accept(e.nextElement());
      }
    }
  }

}
