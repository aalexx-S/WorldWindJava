# WorldWind Symbolic Execution Tests

Symbolic Execution Tests for a select classes from WorldWind.

## Installation

How to install the project to run the symbolic execution tests.

### Prerequisites

* You will need Java 8. If you don't have it already, please install it. On Ubuntu 18.0.4, you can do this with `sudo apt-get install java-8-openjdk-default`.
* You will also need the [Eclipse IDE](https://www.eclipse.org/downloads).  Please install it.

### Install JPF

* $ `mkdir -p ~/projects/jpf && cd ~/projects/jpf`
* $ `git clone https://github.com/SymbolicPathFinder/jpf-symbc.git`
* $ `git clone https://github.com/SymbolicPathFinder/jpf-core.git`
* $ `cd ~/jpf/jpf-symbc && git checkout 0f2f2901cd0ae9833145c38fee57be03da90a64f`
* $ `cd ~/jpf/jpf-core && git checkout b64ab6a0c8dde218b34969b46ee526ece7ddee44`
* Add the following code in `~/.jpf/site.properties`
    
```
jpf-core = ${user.home}/projects/jpf/jpf-core
jpf-symbc = ${user.home}/projects/jpf/jpf-symbc
extensions = ${jpf-core},${jpf-symbc}
```

### Install WorldWindJava

* $ `cd ~/projects`
* $ `git clone https://github.com/grese/WorldWindJava.git`
* $ `cd ~/projects/WorldWindJava && git checkout symbc`

### IDE Setup

* Open a new Eclipse workspace.
* Import all three projects (jpf-symbc, jpf-core, WorldWindJava) into the eclipse workspace.

## Build

Instructions for building WorldWind. Commands are run from within the WorldWindJava root directory.

* `ant build`

## Run

How to run the symbolic execution tests (located in `src/cmu/symbolic`). Make sure that you've run the build first.

* `java -jar ~/projects/jpf/jpf-core/RunJPF.jar <JPFTestFile>`
* Example: `java -jar ~/projects/jpf/jpf-core/RunJPF.jar ~/projects/WorldWindJava/src/cmu/symbolic/AngleTest.jpf`

