package io.github.raistlintao.logger

object usage {

  def main(args: Array[String]): Unit = {
    logger.log("Project Initialised", LogLevel.Info)
    logger.info("Project Initialised")
    //Lets do a huge calculation here
    Thread.sleep(2000)
    logger.log("2 Seconds passed", LogLevel.Notice)
    logger.warning("Something fishy here")
    logger.log("Normally put ex.message here", LogLevel.Error)
    logger.debug("Good bye!")
  }
}
