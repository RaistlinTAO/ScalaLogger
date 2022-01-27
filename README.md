# Scala Logger

Just a lightweight logger with colour and time support for Scala 3

![License](https://img.shields.io/github/license/RaistlinTAO/ScalaLogger)

![Sonatype](https://img.shields.io/nexus/s/io.github.raistlintao/logger_3?server=https%3A%2F%2Fs01.oss.sonatype.org%2F)
![Maven Central](https://img.shields.io/maven-central/v/io.github.raistlintao/logger_3.svg)

![Code Size](https://img.shields.io/github/languages/code-size/raistlintao/ScalaLogger)
![Repo Size](https://img.shields.io/github/repo-size/RaistlinTAO/ScalaLogger)

Just a lightweight logger for Scala with no dependencies


##### This helper was built for [Scala 3](https://www.scala-lang.org)

# Usage

1. Import the library
2. Use Logger.log (message: String, LogLevel) or just Logger.info(message: String) to get start

```scala
    logger.log("Project Initialised", LogLevel.Info)
    logger.info("Project Initialised")
    //Lets do a huge calculation here
    Thread.sleep(2000)
    logger.log("2 Seconds passed", LogLevel.Notice)
    logger.warning("Something fishy here")
    logger.log("Normally put ex.message here", LogLevel.Error)
    logger.debug("Good bye!")
```

What you will get:
```shell
    25/01/22 17:14:53 INFO Project Initialised - [usage.scala(main): 6] (+0.21 Seconds)
    25/01/22 17:14:53 INFO Project Initialised - [usage.scala(main): 7] (+0.00 Seconds)
    25/01/22 17:14:55 NOTI 2 Seconds passed - [usage.scala(main): 10] (+2.00 Seconds)
    25/01/22 17:14:55 WARN Something fishy here - [usage.scala(main): 11] (+0.00 Seconds)
    25/01/22 17:14:55 ERRO Normally put ex.message here - [usage.scala(main): 12] (+0.00 Seconds)
    25/01/22 17:14:55 DEBG Good bye! - [usage.scala(main): 13] (+0.00 Seconds)
    
    Process finished with exit code 0
```