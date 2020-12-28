<?xml version="1.0" encoding="utf-8" ?>
<!--

    Copyright (c) 2019-2020 Contributors to the OpenSmartHouse project

    See the NOTICE file(s) distributed with this work for additional
    information.

    This program and the accompanying materials are made available under the
    terms of the Eclipse Public License 2.0 which is available at
    http://www.eclipse.org/legal/epl-2.0

    SPDX-License-Identifier: EPL-2.0
-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:features="http://karaf.apache.org/xmlns/features/v1.4.0" exclude-result-prefixes="features">

  <!--
  This basic transformation set allows to generate "compat" feature set which allows to run standard
  OH bindings with OSH. Entire thing is generating "openhab-xyz" feature which refer source feature
  "opensmarthouse-xyz".
  -->
  <xsl:output method="xml" encoding="utf-8" indent="yes" />

  <xsl:template match="/">
    <xsl:copy>
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>

  <xsl:template match="node()|@*">
    <xsl:copy>
      <xsl:apply-templates select="node()|@*"/>
    </xsl:copy>
  </xsl:template>

  <xsl:template match="features:features/@name">
    <xsl:attribute name="name">
      <xsl:value-of select="concat(., '-compat')" />
    </xsl:attribute>
  </xsl:template>

  <xsl:template match="features:feature">
    <xsl:element name="feature" namespace="{namespace-uri()}">
      <xsl:attribute name="name">
        <xsl:call-template name="string-replace-all">
          <xsl:with-param name="text" select="attribute::name"/>
          <xsl:with-param name="replace" select="'opensmarthouse-'"/>
          <xsl:with-param name="by" select="'openhab-'"/>
        </xsl:call-template>
      </xsl:attribute>
      <xsl:element name="feature" namespace="{namespace-uri()}">
        <xsl:value-of select="@name" />
      </xsl:element>
    </xsl:element>
  </xsl:template>

  <!-- string-replace-all from http://geekswithblogs.net/Erik/archive/2008/04/01/120915.aspx -->
  <xsl:template name="string-replace-all">
    <xsl:param name="text" />
    <xsl:param name="replace" />
    <xsl:param name="by" />
    <xsl:choose>
      <xsl:when test="contains($text, $replace)">
        <xsl:value-of select="substring-before($text,$replace)" />
        <xsl:value-of select="$by" />
        <xsl:call-template name="string-replace-all">
          <xsl:with-param name="text"
            select="substring-after($text,$replace)" />
          <xsl:with-param name="replace" select="$replace" />
          <xsl:with-param name="by" select="$by" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$text" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>