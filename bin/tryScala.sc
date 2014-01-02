import scala.util.{ Random => rd }

object tryScala {
  println("Welcome to the Scala worksheet")

  //this following was summarised by Robert.
  //Please let us know if there is any mistake. Thanks

  def sumInts(a: Int, b: Int): Int = if (a > b) 0 else a + sumInts(a + 1, b)
  sumInts(0, 5)
  sumInts(0, 10)

  def sumSq(a: Int, b: Int): Int = if (a > b) 0 else (a * a) + sumSq(a + 1, b)

  sumSq(0, 4)

  def sumPi(a: Int, b: Int): Double = if (a > b) 0 else (1.0 / (a * a + 2 * a) + sumPi(a + 4, b))

  sumPi(1, 10000) * 8

  def sum(a: Int, b: Int, inc: Int => Int, comp: Int => Double): Double =
    if (a > b) 0 else comp(a) + sum(inc(a), b, inc, comp)
  sum(0, 10, x => x + 1, x => x)

  sum(0, 10, x => x + 1, identity)

  sum(0, 10, 1+, identity)

  sum(0, 10, (1).+, identity)

  sum(1, 1000, 4+, x => (1.0 / (x * x + 2 * x))) * 8

  //the following part is about big data

  val l = List(1, 2, 3, 4, 5)
  l.map(x => x * x)
  l.filter(x => x < 3)
  val r = 1 to 100000
  //range
  r.partition(x => x < 3)
  val arr = Array.fill(100000)(rd.nextInt(100))

  val (aged, young) = arr.partition(x => x > 55)

  val ages = aged groupBy (x => x)

  ages map { case (k, v) => (k, v.size) }
  ages.mapValues(v => v.size)
}