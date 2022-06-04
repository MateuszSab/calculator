import scala.sys.exit

object excercise1 extends App {
  val ERROR_CODE_NOT_ENOUGH_ARGS = -2
  var response =
//  while () {
//
//  }
  if (args.length >= 1) {
    val x = args(0).toInt
    val y = args(1).toInt
    val result = x + y
    println(s"$x+$y = $result")

  } else {
    println(s"Blad: lliczba arguentoe = ${args.length}")
  }
  exit()

}
