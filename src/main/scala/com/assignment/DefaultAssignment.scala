package com.assignment

class DefaultAssignment {

  def log(message: String, level: String = "INFO"): Unit = {
    println("[" + level + "]:" + message)
  }

}
object default extends App {
  val obj = new DefaultAssignment
  obj.log("log")
  obj.log("newLog", "SENIOR")
}