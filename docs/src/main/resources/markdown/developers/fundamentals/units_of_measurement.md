# Units Of Measurement

<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="../index.php">Developers Guide</a></li>
    <li class="breadcrumb-item"><a href="index.php">Fundamental Concepts</a></li>
    <li class="breadcrumb-item active" aria-current="page">Units of Measurement</li>
  </ol>
</nav>

## Overview

To express measured values in a scientific correct unit the framework supports units of measurement.
By using quantified decimal values in state updates and commands, the framework is able to automatically convert values to a desired unit which may be defined by the system locale or on a per-use-basis. 

## QuantityType 

Bindings use the `QuantityType` to post updates of sensor data with a quantifying unit. 
This way the framework and/or the user is able to convert the quantified value to other matching units:

A weather binding which reads temperature values in °C would use the `QuantityType` to indicate the unit as °C.
The framework is then able to convert the values to either °F or Kelvin according to the configuration of the system.
The default conversion the framework will use is locale-based:
The framework tries to convert a `QuantityType` to the default unit of the configured locale.
This is the imperial system for the United States (locale US) and Liberia (language tag "en-LR"). 
The metric system with SI units is used for the rest of the world. 
This conversion will convert the given `QuantityType` into a default unit for the specific dimension of the type. 
This is:

| Dimension     | default unit metric        | default unit imperial  |
|---------------|----------------------------|------------------------|
| Length        | Meter (m)                  | Inch (in)              |
| Temperature   | Celsius (°C)               | Fahrenheit (°F)        |
| Pressure      | Hectopascal (hPa)          | Inch of mercury (inHg) | 
| Speed         | Kilometers per hour (km/h) | Miles per hour (mph)   |
| Intensity     | Irradiance (W/m2)          | Irradiance (W/m2)      |
| Dimensionless | Abstract unit one (one)    | Abstract unit one (one)|
| Angle         | Degree (°)                 | Degree (°)             |

## NumberItem linked to QuantityType Channel

In addition to the automated conversion the `NumberItem` linked to a Channel delivering `QuantityTypes` can be configured to always have state updates converted to a specific unit. 
The unit given in the state description is parsed and then used for conversion (if necessary).
The framework assumes that the unit to parse is always the last token in the state description.
If the parsing failed the locale-based default conversion takes place.

    Number:Temperature temperature "Outside [%.2f °F]" { channel="...:current#temperature" }
    
In the example the `NumberItem` is specified to bind to Channels which offer values from the dimension `Temperature`.
Without the dimension information the `NumberItem` only will receive updates of type `DecimalType` without a unit and any conversion.
The state description defines two decimal places for the value and the fix unit °F.
In case the state description should display the unit the binding delivers or the framework calculates through locale-based conversion the pattern will look like this:
    
    "Outside [%.2f %unit%]"
    
The special placeholder `%unit%` will then be replaced by the actual unit symbol.
The placeholder `%unit%` can be placed anywhere in the state description.
 
#### Defining ChannelTypes

In order to match `NumberItems` and Channels and define a default state description with unit placeholder the Channel also has to provide an Item type which includes the dimension information:


    <channel-type id="temperature">
        <item-type>Number:Temperature</item-type>
        <label>Temperature</label>
        <description>Current temperature</description>
        <state readOnly="true" pattern="%.1f %unit%" />
    </channel-type>

The state description pattern "%.1f %unit%" describes the value format as floating point with one decimal place and also the special placeholder for the unit.

## Implementing UoM
When creating QuantityType states the framework offers some useful packages and classes:
The `org.eclipse.smarthome.core.library.unit` package contains the classes `SIUnits`, `ImperialUnits` and `SmartHomeUnits` which provide units unique to either of the measurement systems and common units used in both systems.

The `MetricPrefix` class provides prefixes like MILLI, CENTI, HECTO, etc. and the `BinaryPrefix` class provides prefixes like KIBI, MEBI, etc. both of which are wrappers to create derived units.

The `org.eclipse.smarthome.core.library.dimension` and `javax.measure.quantity` packages provide interfaces which are used to type the generic QuantityType and units. 

## List of Units

All units which are currently supported by default are listed in the tables below.


#### Imperial:

<table>
	<thead>
		<tr><th>Type</th><th>Unit</th><th>Symbol</th></tr>
	</thead>
	<tbody>
		<tr valign="top"><td>Pressure</td><td>Inch of Mercury</td><td>inHg</td></tr>
		<tr valign="top"><td>Temperature</td><td>Degree Fahrenheit</td><td>°F</td></tr>
		<tr valign="top"><td>Speed</td><td>Miles per Hour</td><td>mph</td></tr>
		<tr valign="top"><td rowspan="7">Length</td><td>Inch</td><td>in</td>
		<tr valign="top"><td>Foot</td><td>ft</td>
		<tr valign="top"><td>Yard</td><td>yd</td>
		<tr valign="top"><td>Chain</td><td>ch</td>
		<tr valign="top"><td>Furlong</td><td>fur</td>
		<tr valign="top"><td>Mile</td><td>mi</td>
		<tr valign="top"><td>League</td><td>lea</td></tr>
	</tbody>
</table>

#### SI:

<table>
	<thead>
		<tr><th>Type</th><th>Unit</th><th>Symbol</th></tr>
	</thead>
	<tbody>
		<tr valign="top"><td rowspan="2">Acceleration</td><td>Metre per Second squared</td><td>m/s²</td></tr>
		<tr valign="top"><td>Standard Gravity</td><td>ɡₙ</td></tr>
		<tr valign="top"><td rowspan="2">AmountOfSubstance</td><td> Mole</td><td>mol</td></tr>
		<tr valign="top"><td>Deutscher Härtegrad</td><td>°dH</td></tr>
		<tr valign="top"><td rowspan="4">Angle</td><td>Radian</td><td>rad</td>
		<tr valign="top"><td>Degree</td><td>°</td>
		<tr valign="top"><td>Minute Angle</td><td>'</td>
		<tr valign="top"><td>Second Angle</td><td>''</td>
		<tr valign="top"><td>Area</td><td>Square Metre</td><td>m²</td></tr>
		<tr valign="top"><td>ArealDensity</td><td>Dobson Unit</td><td>DU</td></tr>
		<tr valign="top"><td>CatalyticActivity</td><td>Katal</td><td>kat</td></tr>
		<tr valign="top"><td rowspan="10">DataAmount</td><td>Bit</td><td>bit</td></tr>
		<tr valign="top"><td>Megabit</td><td>Mbit</td>
		<tr valign="top"><td>Kilobit</td><td>kbit</td>
		<tr valign="top"><td>Gigabit</td><td>Gbit</td></tr>
		<tr valign="top"><td>Terabit</td><td>Tbit</td></tr>
		<tr valign="top"><td>Byte</td><td>B</td>
		<tr valign="top"><td>Octet</td><td>o</td>
		<tr valign="top"><td>Kibioctet</td><td>Kio</td></tr>
		<tr valign="top"><td>Mebioctet</td><td>Mio</td></tr>
		<tr valign="top"><td>Gibioctet</td><td>Gio</td></tr>
		<tr valign="top"><td rowspan="5">DataTransferRate</td><td>Bit per Second</td><td>bit/s</td></tr>
		<tr valign="top"><td>Kilobit per Second</td><td>kbit/s</td></tr>
		<tr valign="top"><td>Megabit per Second</td><td>Mbit/s</td></tr>
		<tr valign="top"><td>Gigabit per Second</td><td>Gbit/s</td></tr>
		<tr valign="top"><td>Terabit per Second </td><td>Tbit/s</td></tr>
		<tr valign="top"><td rowspan="2">Density</td><td>Microgram per cubic Metre</td><td>µg/m³</td></tr>
		<tr valign="top"><td>Kilogram per cubic Metre</td><td>kg/m³</td></tr>
		<tr valign="top"><td rowspan="3">Dimensionless</td><td>Percent</td><td>%</td></tr>
		<tr valign="top"><td>Parts per Million</td><td>ppm</td></tr>
		<tr valign="top"><td>Decibel</td><td>dB</td></tr>
		<tr valign="top"><td>ElectricPotential</td><td>Volt</td><td>V</td></tr>
		<tr valign="top"><td>ElectricCapacitance</td><td>Farad</td><td>F</td></tr>
		<tr valign="top"><td rowspan="3">ElectricCharge</td><td>Coulomb</td><td>C</td></tr>
		<tr valign="top"><td>Ampere Hour</td><td>Ah</td></tr>
		<tr valign="top"><td>Milliampere Hour</td><td>mAh</td></tr>
		<tr valign="top"><td>ElectricConductance</td><td>Siemens</td><td>S</td></tr>
		<tr valign="top"><td>ElectricConductivity</td><td>Siemens per Metre</td><td>S/m</td></tr>
		<tr valign="top"><td>ElectricCurrent</td><td>Ampere</td><td>A</td></tr>
		<tr valign="top"><td>ElectricInductance</td><td>Henry</td><td>H</td></tr>
		<tr valign="top"><td>ElectricResistance</td><td>Ohm</td><td>Ω</td></tr>
		<tr valign="top"><td rowspan="8">Energy</td><td>Joule</td><td>J</td></tr>
		<tr valign="top"><td>Watt Second</td><td>Ws</td></tr>
		<tr valign="top"><td>Watt Hour</td><td>Wh</td></tr>
		<tr valign="top"><td>Kilowatt Hour</td><td>kWh</td></tr>
		<tr valign="top"><td>Megawatt Hour</td><td>MWh</td></tr>
		<tr valign="top"><td>Volt-Ampere Hour</td><td>VAh</td></tr>
		<tr valign="top"><td>Volt-Ampere Reactive Hour</td><td>varh</td></tr>
		<tr valign="top"><td>Kilovar Hour</td><td>kvarh</td></tr>
		<tr valign="top"><td>Force</td><td>Newton</td><td>N</td></tr>
		<tr valign="top"><td>Frequency</td><td>Hertz</td><td>Hz</td></tr>
		<tr valign="top"><td>Illuminance</td><td>Lux</td><td>lx</td></tr>
		<tr valign="top"><td rowspan="2">Intensity</td><td>Irradiance</td><td>W/m²</td></tr>
		<tr valign="top"><td>Microwatt per square Centimeter</td><td>µW/cm²</td></tr>
		<tr valign="top"><td rowspan="2">Length</td><td>Metre</td><td>m</td></tr>
		<tr valign="top"><td>Kilometre</td><td>km</td></tr>
		<tr valign="top"><td>LuminousFlux</td><td>Lumen</td><td>lm</td></tr>
		<tr valign="top"><td>LuminousIntensity</td><td>Candela</td><td>cd</td></tr>
		<tr valign="top"><td>MagneticFlux</td><td>Weber</td><td>Wb</td></tr>
		<tr valign="top"><td>MagneticFluxDensity</td><td>Tesla</td><td>T</td></tr>
		<tr valign="top"><td rowspan="2">Mass</td><td>Kilogram</td><td>kg</td></tr>
		<tr valign="top"><td>Gram</td><td>g</td></tr>
		<tr valign="top"><td rowspan="5">Power</td><td>Watt</td><td>W</td></tr>
		<tr valign="top"><td>Volt-Ampere</td><td>VA</td></tr>
		<tr valign="top"><td>Volt-Ampere Reactive</td><td>var</td></tr>
		<tr valign="top"><td>Kilovar</td><td>kvar</td></tr>
		<tr valign="top"><td>Decibel-Milliwatts</td><td>dBm</td></tr>
		<tr valign="top"><td rowspan="5">Pressure</td><td>Pascal</td><td>Pa</td></tr>
		<tr valign="top"><td>Hectopascal</td><td>hPa</td></tr>
		<tr valign="top"><td>Millimetre of Mercury</td><td>mmHg</td></tr>
		<tr valign="top"><td>Bar</td><td>bar</td></tr>
		<tr valign="top"><td>Millibar</td><td>mbar</td></tr>
		<tr valign="top"><td>Radioactivity</td><td>Becquerel</td><td>Bq</td></tr>
		<tr valign="top"><td>RadiationDoseAbsorbed</td><td>Gray</td><td>Gy</td></tr>
		<tr valign="top"><td>RadiationDoseEffective</td><td>Sievert</td><td>Sv</td></tr>
		<tr valign="top"><td>SolidAngle</td><td>Steradian</td><td>sr</td></tr>
		<tr valign="top"><td rowspan="4">Speed</td><td>Metre per Second</td><td>m/s</td></tr>
		<tr valign="top"><td>Millimetre per Hour</td><td>mm/h</td></tr>
		<tr valign="top"><td>Kilometre per Hour</td><td>km/h</td></tr>
		<tr valign="top"><td>Knot</td><td>kn</td></tr>
		<tr valign="top"><td rowspan="2">Temperature</td><td>Kelvin</td><td>K</td></tr>
		<tr valign="top"><td>Celsius</td><td>°C</td></tr>
		<tr valign="top"><td rowspan="6">Time</td><td>Second</td><td>s</td></tr>
		<tr valign="top"><td>Minute</td><td>min</td></tr>
		<tr valign="top"><td>Hour</td><td>h</td></tr>
		<tr valign="top"><td>Day</td><td>d</td></tr>
		<tr valign="top"><td>Week</td><td>week</td></tr>
		<tr valign="top"><td>Year</td><td>y</td></tr>
		<tr valign="top"><td rowspan="2">Volume</td><td>Litre</td><td>l</td></tr>
		<tr valign="top"><td>Cubic Metre</td><td>m³</td></tr>
		<tr valign="top"><td rowspan="5">VolumetricFlowRate</td><td>Litre per Minute</td><td>l/min</td></tr>
		<tr valign="top"><td>Cubic Metre per Second</td><td>m³/s</td></tr>
		<tr valign="top"><td>Cubic Metre per Minute</td><td>m³/min</td></tr>
		<tr valign="top"><td>Cubic Metre per Hour</td><td>m³/h</td></tr>
		<tr valign="top"><td>Cubic Metre per Day</td><td>m³/d</td></tr>
	</tbody>
</table>

#### Metric Prefixes:

| Name  | Symbol | Factor |
|-------|--------|--------|
| Yotta | Y      | 10²⁴   |
| Zetta | Z      | 10²¹   |
| Exa   | E      | 10¹⁸   |
| Peta  | P      | 10¹⁵   |
| Tera  | T      | 10¹²   |
| Giga  | G      | 10⁹    |
| Mega  | M      | 10⁶    |
| Kilo  | k      | 10³    |
| Hecto | h      | 10²    |
| Deca  | da     | 10     |
| Deci  | d      | 10⁻¹   |
| Centi | c      | 10⁻²   |
| Milli | m      | 10⁻³   |
| Micro | µ      | 10⁻⁶   |
| Nano  | n      | 10⁻⁹   |
| Pico  | p      | 10⁻¹²  |
| Femto | f      | 10⁻¹⁵  |
| Atto  | a      | 10⁻¹⁸  |
| Zepto | z      | 10⁻²¹  |
| Yocto | y      | 10⁻²⁴  |

#### Binary Prefixes:

| Name | Symbol | Factor |
| ---- | ------ | ------ |
| Kibi | Ki     | 2¹⁰    |
| Mebi | Mi     | 2²⁰    |
| Gibi | Gi     | 2³⁰    |
| Tebi | Ti     | 2⁴⁰    |
| Pebi | Pi     | 2⁵⁰    |
| Exbi | Ei     | 2⁶⁰    |
| Zebi | Zi     | 2⁷⁰    |
| Yobi | Yi     | 2⁸⁰    |

To use the prefixes simply add the prefix to the unit symbol - for example:
* milliAmpere - `mA`
* centiMetre - `cm`
* kiloWatt - `kW`
* KibiByte - `KiB`
