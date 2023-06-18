package week3fp

object Test extends App {

  var some = SomeTest(1, "someTest", Some(7))
  var example = SomeTest(2, "exampleTest", Some(0))

  def someResult(example: SomeTest): String = example match {
    case SomeTest(i, d, k) if k.isEmpty => "неизвестно"
    case SomeTest(i, d, k) if k.get == 0 => "неизвестно"
    case SomeTest(i, d, k) if k.get % 2 == 0 => "четное"
    case SomeTest(i, d, k) if k.get % 2 == 1 => "нечетное"
  }

  //немного другой вариант
  val result: String = some match {
    case SomeTest(i, d, k) if k.isEmpty => "неизвестно"
    case SomeTest(i, d, k) if k.get == 0 => "неизвестно"
    case SomeTest(i, d, k) if k.get % 2 == 0 => "четное"
    case SomeTest(i, d, k) if k.get % 2 == 1 => "нечетное"
  }
  println(someResult(example))
  print(result)
}

case class SomeTest(id: Int, description: String, kind: Option[Int]) {
}
