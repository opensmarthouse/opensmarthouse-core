# _OpenSmartHouse_ Core

This project contains core bundles of the _OpenSmartHouse_ runtime.

Building and running the project is fairly easy if you follow the steps detailed below.

Please note that _OpenSmartHouse_ Core is not a product itself, but a framework to build solutions on top. This means that what you build is primarily an artifact repository of OSGi bundles that can be used within smart home products.

## 1. Prerequisites

The build infrastructure is based on Maven. 
If you know Maven already then there won't be any surprises for you. 
If you have not worked with Maven yet, just follow the instructions and everything will hopefully work ;-)

What you need before you start:

- Java SE Development Kit 11
- Maven 3 from https://maven.apache.org/download.html

Make sure that the `mvn` command is available on your path

## 2. Checkout

Checkout the source code from GitHub, e.g. by running:

```
git clone https://github.com/opensmarthouse/opensmarthouse-core.git
```

## 3. Building with Maven

To build this project from the sources, Maven takes care of everything:

- set `MAVEN_OPTS` to `-Xms512m -Xmx1024m`
- change into the opensmarthouse-core directory (`cd opensmarthouse-core`)
- run `mvn clean install` to compile and package all sources

If there are tests that are failing occasionally on your local build, run `mvn -DskipTests=true clean install` instead to skip them.
