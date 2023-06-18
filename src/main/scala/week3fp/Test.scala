package week3fp

object Test extends App {

  //объекты для проверки
  var example = SomeTest(1, "exampleTest", Some(0))
  var anotherExample = SomeTest(2, "someTest", Some(7))

  def result(example: SomeTest): String = example match {
    case SomeTest(i, d, k) if k.isEmpty => "неизвестно"
    case SomeTest(i, d, k) if k.get == 0 => "неизвестно"
    case SomeTest(i, d, k) if k.get % 2 == 0 => "четное"
    case SomeTest(i, d, k) if k.get % 2 == 1 => "нечетное"
  }

  //немного другой вариант
  val anotherResult: String = anotherExample match {
    case SomeTest(i, d, k) if k.isEmpty => "неизвестно"
    case SomeTest(i, d, k) if k.get == 0 => "неизвестно"
    case SomeTest(i, d, k) if k.get % 2 == 0 => "четное"
    case SomeTest(i, d, k) if k.get % 2 == 1 => "нечетное"
  }

  //вывод результата
  println(result(example))
  println(anotherResult)

}

case class SomeTest(id: Int, description: String, kind: Option[Int]) {
}
