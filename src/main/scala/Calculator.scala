import scala.io.StdIn.readLine

object Calculator extends App {

  val x = readLine("Podaj x: ").toInt
  val y = readLine("Podaj y: ").toInt
  val result = x + y
  print(x + "+" + y + "=" + result)
  print(s"$x+$y = $result")

}
