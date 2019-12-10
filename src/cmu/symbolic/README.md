# WorldWind Symbolic Execution Tests

Symbolic Execution Tests for a select classes from WorldWind.

## Installation

How to install the project to run the symbolic execution tests.

### Prerequisites

* You will need Java 8. If you don't have it already, please install it. On Ubuntu 18.0.4, you can do this with `sudo apt-get install java-8-openjdk-default`.
* You will also need the [Eclipse IDE](https://www.eclipse.org/downloads).  Please install it.

### Install JPF

* $ `mkdir -p ~/Projects/jpf && cd ~/Projects/jpf`
* $ `git clone https://github.com/SymbolicPathFinder/jpf-symbc.git`
* $ `git clone https://github.com/SymbolicPathFinder/jpf-core.git`
* $ `cd ~/jpf/jpf-symbc && git checkout 0f2f2901cd0ae9833145c38fee57be03da90a64f`
* $ `cd ~/jpf/jpf-core && git checkout b64ab6a0c8dde218b34969b46ee526ece7ddee44`
* Add `export LD_LIBRARY_PATH=~/Projects/jpf/jpf-symbc/lib` to `~/.bashrc` (or .zshrc or whatever)
* Add the following code in `~/.jpf/site.properties`
    
```
jpf-core = ${user.home}/Projects/jpf/jpf-core
jpf-symbc = ${user.home}/Projects/jpf/jpf-symbc
extensions = ${jpf-core},${jpf-symbc}
```

### Install WorldWindJava

* $ `cd ~/Projects`
* $ `git clone https://github.com/grese/WorldWindJava.git`
* $ `cd ~/Projects/WorldWindJava && git checkout symbc`

### IDE Setup

* Open a new Eclipse workspace.
* Import all three projects (jpf-symbc, jpf-core, WorldWindJava) into the eclipse workspace.

## Build

Instructions for building WorldWind. Commands are run from within the WorldWindJava root directory.

* Build: `ant build`
* Clean and build: `ant clean build`

## Run

How to run the symbolic execution tests (located in `src/cmu/symbolic` on the `symbc` branch). Make sure that you've run the build first.

* `java -jar ~/Projects/jpf/jpf-core/RunJPF.jar <JPFTestFile>`
* Example: `java -jar ~/Projects/jpf/jpf-core/RunJPF.jar ~/Projects/WorldWindJava/src/cmu/symbolic/AngleTest.jpf`

## Develop

During development, after making changes in any Java files, you can run the following to build & run the project

* `ant build && java -jar ~/Projects/jpf/jpf-core/RunJPF.jar <JPFTestFile>`

----

## WorldWind All-Pairs Testing

We also performed all-pairs testing on some of the same classes.  You can find the source code for the all pairs testing here: [https://github.com/jmerlinz/WorldWindForAllPairs](https://github.com/jmerlinz/WorldWindForAllPairs)


