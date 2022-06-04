import scala.io.StdIn.readLine
import scala.sys.exit

object excercise2 extends App {
  //  var response: Boolean = true // true
  while (true) {
    val x = readLine("Podaj x: ").toInt
    val y = readLine("Podaj y: ").toInt
    val result = x + y
    println(s"$x+$y = $result")

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Dizienki")
      exit(0)
    }
  }
}