package week3fp

object Test2 extends App {

  val seq = Seq(1,2,3,4,5,6,7,8,9,10,11,12,13)
  print(seq.filter(_ % 2 == 1).sum)

  // таким образом будет еще короче
  print(Seq(1,2,3,4,5,6,7,8,9,10,11,12,13,14).filter(_ % 2 == 1).sum)
}
