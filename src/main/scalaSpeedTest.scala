object NetworkCheck {
  def checkBandwidth(speed: Int): String = {
    if (speed > 1000) "High-speed link"
    else if (speed > 100) "Medium-speed link"
    else "Low-speed link"
  }

  def main(args: Array[String]): Unit = {
    val speeds = List(50, 500, 2000) // Like a list of interface speeds
    for (speed <- speeds) {
      println(s"Speed $speed Mbps: ${checkBandwidth(speed)}")
    }
  }
}