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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TooManyListenersException;
import org.openhab.core.io.transport.serial.SerialPort;
import org.openhab.core.io.transport.serial.SerialPortEventListener;
import org.openhab.core.io.transport.serial.UnsupportedCommOperationException;
import purejavacomm.SerialPortEvent;

/**
 * 
 * @author Łukasz Dywicki - initial contribution from ConnectorIO
 */
public class PureJavaCommSerialPort implements SerialPort {

  private final purejavacomm.SerialPort port;

  public PureJavaCommSerialPort(purejavacomm.SerialPort port) {
    this.port = port;
  }

  @Override
  public void close() {
    port.close();
  }

  @Override
  public void setSerialPortParams(int baudrate, int dataBits, int stopBits, int parity)
      throws UnsupportedCommOperationException {
    try {
      port.setSerialPortParams(baudrate, dataBits, stopBits, parity);
    } catch (purejavacomm.UnsupportedCommOperationException e) {
      throw new UnsupportedCommOperationException(e);
    }
  }

  @Override
  public InputStream getInputStream() throws IOException {
    return port.getInputStream();
  }

  @Override
  public OutputStream getOutputStream() throws IOException {
    return port.getOutputStream();
  }

  @Override
  public String getName() {
    return port.getName();
  }

  @Override
  public void addEventListener(SerialPortEventListener listener) throws TooManyListenersException {
    port.addEventListener(new purejavacomm.SerialPortEventListener() {
      @Override
      public void serialEvent(SerialPortEvent event) {
        listener.serialEvent(new org.openhab.core.io.transport.serial.SerialPortEvent() {
          @Override
          public int getEventType() {
            return event.getEventType();
          }

          @Override
          public boolean getNewValue() {
            return event.getNewValue();
          }
        });
      }
    });
  }

  @Override
  public void removeEventListener() {
    port.removeEventListener();
  }

  @Override
  public void notifyOnDataAvailable(boolean enable) {
    port.notifyOnDataAvailable(enable);
  }

  @Override
  public void notifyOnBreakInterrupt(boolean enable) {
    port.notifyOnBreakInterrupt(enable);
  }

  @Override
  public void notifyOnFramingError(boolean enable) {
    port.notifyOnFramingError(enable);
  }

  @Override
  public void notifyOnOverrunError(boolean enable) {
    port.notifyOnOverrunError(enable);
  }

  @Override
  public void notifyOnParityError(boolean enable) {
    port.notifyOnParityError(enable);
  }

  @Override
  public void enableReceiveTimeout(int timeout) throws UnsupportedCommOperationException, IllegalArgumentException {
    try {
      port.enableReceiveTimeout(timeout);
    } catch (purejavacomm.UnsupportedCommOperationException e) {
      throw new UnsupportedCommOperationException(e);
    }
  }

  @Override
  public void disableReceiveTimeout() {
    port.disableReceiveTimeout();
  }

  @Override
  public void setFlowControlMode(int flowcontrolRtsctsOut) throws UnsupportedCommOperationException {
    try {
      port.setFlowControlMode(flowcontrolRtsctsOut);
    } catch (purejavacomm.UnsupportedCommOperationException e) {
      throw new UnsupportedCommOperationException(e);
    }
  }

  @Override
  public void enableReceiveThreshold(int i) throws UnsupportedCommOperationException {
    try {
      port.enableReceiveThreshold(i);
    } catch (purejavacomm.UnsupportedCommOperationException e) {
      throw new UnsupportedCommOperationException(e);
    }
  }

  @Override
  public void setRTS(boolean rts) {
    port.setRTS(rts);
  }

  @Override
  public void sendBreak(int duration) {
    port.sendBreak(duration);
  }

  @Override
  public boolean isDTR() {
    return port.isDTR();
  }

  @Override
  public boolean isCTS() {
    return port.isCTS();
  }

  @Override
  public boolean isDSR() {
    return port.isDSR();
  }

  @Override
  public boolean isCD() {
    return port.isCD();
  }

  @Override
  public boolean isRI() {
    return port.isRI();
  }

  @Override
  public boolean isRTS() {
    return port.isRTS();
  }

  @Override
  public void setDTR(boolean state) {
    port.setDTR(state);
  }

  @Override
  public void notifyOnCarrierDetect(boolean enable) {
    port.notifyOnCarrierDetect(enable);
  }

  @Override
  public int getFlowControlMode() {
    return getFlowControlMode();
  }

  @Override
  public void notifyOnOutputEmpty(boolean enable) {
    port.notifyOnOutputEmpty(enable);
  }

  @Override
  public void notifyOnCTS(boolean enable) {
    port.notifyOnCTS(enable);
  }

  @Override
  public void notifyOnDSR(boolean enable) {
    port.notifyOnDSR(enable);
  }

  @Override
  public void notifyOnRingIndicator(boolean enable) {
    port.notifyOnRingIndicator(enable);
  }

  @Override
  public int getBaudRate() {
    return port.getBaudRate();
  }

  @Override
  public int getDataBits() {
    return port.getDataBits();
  }

  @Override
  public int getStopBits() {
    return port.getStopBits();
  }

  @Override
  public int getParity() {
    return port.getParity();
  }
}
