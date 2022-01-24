package io.github.raistlintao.logger

import java.text.SimpleDateFormat

object LogLevel extends Enumeration {
  val Warning, Info, General, Error, Notice, Debug, Trace = Value
}

object logger {
  private var _lastTimeStamp: Long = System.currentTimeMillis()

  def log(message: String, level: LogLevel.Value): Unit = {
    level match {
      case LogLevel.Error => {
        println(prepareMessage(message, "ERRO", Console.RED))
      }
      case LogLevel.Warning => {
        println(prepareMessage(message, "WARN", Console.YELLOW))
      }
      case LogLevel.Info => {
        println(prepareMessage(message, "INFO", Console.BLUE))
      }
      case LogLevel.Notice => {
        println(prepareMessage(message, "NOTI", Console.CYAN))
      }
      case LogLevel.General => {
        println(prepareMessage(message, "GENE", Console.GREEN))
      }
      case LogLevel.Debug => {
        println(prepareMessage(message, "DEBG", Console.MAGENTA))
      }
      case _ => {
        println(prepareMessage(message, "TRAC", Console.WHITE))
      }
    }
  }

  def general(message: String): Unit = {
    println(prepareMessage(message, "GENE", Console.GREEN))
  }

  def notice(message: String): Unit = {
    println(prepareMessage(message, "NOTI", Console.CYAN))
  }

  def warning(message: String): Unit = {
    println(prepareMessage(message, "WARN", Console.YELLOW))
  }

  def error(message: String): Unit = {
    println(prepareMessage(message, "ERRO", Console.RED))
  }

  private def prepareMessage(message: String, typeString: String, color: String): String = {
    val currentThread = Thread.currentThread().getStackTrace
    val finalMessage = color + new SimpleDateFormat("DD/MM/YY HH:mm:ss").format(System.currentTimeMillis()) + " "
      + typeString + " " + message + " - [" + currentThread(3).getFileName + "(" + currentThread(3).getMethodName + "): " + currentThread(3).getLineNumber + "]"
      + " (+" + "%.2f".format((System.currentTimeMillis().toDouble - _lastTimeStamp.toDouble) / 1000) + " Seconds)"
    _lastTimeStamp = System.currentTimeMillis()
    finalMessage
  }

  def trace(message: String): Unit = {
    println(prepareMessage(message, "TRAC", Console.WHITE))
  }

  def debug(message: String): Unit = {
    println(prepareMessage(message, "DEBG", Console.MAGENTA))
  }

  def info(message: String): Unit = {
    println(prepareMessage(message, "INFO", Console.BLUE))
  }
}
