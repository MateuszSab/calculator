import scala.Console.{out, printf}
import scala.io.StdIn.{readChar, readLine}
import scala.sys.exit

object excercise3 extends App {

  val calculator = new MyCalculator
//  println(calculator.add(readLine("Podaj x: ").toInt, readLine("Podaj y: ").toInt))
//  exit()

  //  def myReadChar(text: String): Char = {
  //    printf(text, args: _*)
  //    out.flush()
  //    readChar()
  //  }
  while (true) {
    val x = readLine("Podaj x: ").toInt
    val y = readLine("Podaj y: ").toInt
    val z = readLine("Podaj operator: (+, -, *, /): ")
    var result: Int = 0
    if (z == "+") {
      result = calculator.add(x, y)
    } else if (z == "-") {
      result = calculator.subt(x, y)
    } else if (z == "*") {
      result = calculator.mult(x, y)
    } else if (z == "/") {
      result = calculator.div(x, y)
    } else {
      println(s"ERROR: unknown operator: $z")
    }
    println(s"$x$z$y = $result")
    //    if (z == "/" && y == "0" ) {
    //      println("nie dziel przez 0!")
    //    }

    val answer = readLine("Czy kontynuowac? (Y/n) ")
    if (answer == "n") {
      println("Dzienki")
      exit(0)
    }
  }
}
