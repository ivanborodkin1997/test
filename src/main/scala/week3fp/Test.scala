package week3fp

object Test extends App {

  var some = SomeTest(1,"someTest", Some(7))

  val result: String = some match {
    case SomeTest(i,d,k) if k.isEmpty => "неизвестно"
    case SomeTest(i,d,k) if k.get == 0 => "неизвестно"
    case SomeTest(i,d,k) if k.get % 2 == 0 => "четное"
    case SomeTest(i,d,k) if k.get % 2 == 1 => "нечетное"
  }
  print(result)
}

case class SomeTest(id: Int, description: String, kind: Option[Int]) {
}
