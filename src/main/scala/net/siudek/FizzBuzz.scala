
// CodeEval solution:
object Main extends App {
  import net.siudek._
  val source = scala.io.Source.fromFile(args(0))
  val lines = source.getLines.filter(_.length > 0)
  for (l <- lines) {
    val result = FizzBuzz.produce(l)
    System.out.println(result)
  }
}

package net.siudek {

  object FizzBuzz {
    def produce(line: String): String = {
      val Array(a, b, c) = line split "\\s+" map (_.toInt)
      produce(a, b, c)
    }

    def produce(fizzNumber: Int, buzzNumber: Int, limit: Int): String = {
      def asChar(x: Int) = if (x % fizzNumber == 0 && x % buzzNumber == 0) "FB" else if (x % fizzNumber == 0) "F" else if (x % buzzNumber == 0) "B" else x.toString
      Stream.from(1).take(limit - 1).foldLeft("")((acc, cur) => acc + asChar(cur) + " ") + asChar(limit)
    }
  }

}