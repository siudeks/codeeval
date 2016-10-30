package net.siudek

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  "Fizz Buzz" should "produce proper answer" in {
    FizzBuzz.produce(3, 5, 10) should be ("1 2 F 4 B F 7 8 F B")
    FizzBuzz.produce(2, 7, 15) should be ("1 F 3 F 5 F B F 9 F 11 F 13 FB 15")
  }

  "Fizz Buzz input line" should "produce proper answer" in {
    FizzBuzz.produce("3 5 10") should be ("1 2 F 4 B F 7 8 F B")
    FizzBuzz.produce("2 7 15") should be ("1 F 3 F 5 F B F 9 F 11 F 13 FB 15")
  }
}