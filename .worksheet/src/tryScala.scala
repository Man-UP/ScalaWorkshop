import scala.util.{ Random => rd }

object tryScala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
  println("Welcome to the Scala worksheet");$skip(179); 

  //this following was summarised by Robert.
  //Please let us know if there is any mistake. Thanks

  def sumInts(a: Int, b: Int): Int = if (a > b) 0 else a + sumInts(a + 1, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(16); val res$0 = 
  sumInts(0, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(17); val res$1 = 
  sumInts(0, 10);System.out.println("""res1: Int = """ + $show(res$1));$skip(80); 

  def sumSq(a: Int, b: Int): Int = if (a > b) 0 else (a * a) + sumSq(a + 1, b);System.out.println("""sumSq: (a: Int, b: Int)Int""");$skip(15); val res$2 = 

  sumSq(0, 4);System.out.println("""res2: Int = """ + $show(res$2));$skip(99); 

  def sumPi(a: Int, b: Int): Double = if (a > b) 0 else (1.0 / (a * a + 2 * a) + sumPi(a + 4, b));System.out.println("""sumPi: (a: Int, b: Int)Double""");$skip(23); val res$3 = 

  sumPi(1, 10000) * 8;System.out.println("""res3: Double = """ + $show(res$3));$skip(133); 

  def sum(a: Int, b: Int, inc: Int => Int, comp: Int => Double): Double =
    if (a > b) 0 else comp(a) + sum(inc(a), b, inc, comp);System.out.println("""sum: (a: Int, b: Int, inc: Int => Int, comp: Int => Double)Double""");$skip(33); val res$4 = 
  sum(0, 10, x => x + 1, x => x);System.out.println("""res4: Double = """ + $show(res$4));$skip(36); val res$5 = 

  sum(0, 10, x => x + 1, identity);System.out.println("""res5: Double = """ + $show(res$5));$skip(28); val res$6 = 

  sum(0, 10, 1+, identity);System.out.println("""res6: Double = """ + $show(res$6));$skip(31); val res$7 = 

  sum(0, 10, (1).+, identity);System.out.println("""res7: Double = """ + $show(res$7));$skip(54); val res$8 = 

  sum(1, 1000, 4+, x => (1.0 / (x * x + 2 * x))) * 8;System.out.println("""res8: Double = """ + $show(res$8));$skip(73); 

  //the following part is about big data

  val l = List(1, 2, 3, 4, 5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(20); val res$9 = 
  l.map(x => x * x);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(23); val res$10 = 
  l.filter(x => x < 3);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(22); 
  val r = 1 to 100000;System.out.println("""r  : scala.collection.immutable.Range.Inclusive = """ + $show(r ));$skip(36); val res$11 = 
  //range
  r.partition(x => x < 3);System.out.println("""res11: (scala.collection.immutable.IndexedSeq[Int], scala.collection.immutable.IndexedSeq[Int]) = """ + $show(res$11));$skip(48); 
  val arr = Array.fill(100000)(rd.nextInt(100));System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(50); 

  val (aged, young) = arr.partition(x => x > 55);System.out.println("""aged  : Array[Int] = """ + $show(aged ));System.out.println("""young  : Array[Int] = """ + $show(young ));$skip(36); 

  val ages = aged groupBy (x => x);System.out.println("""ages  : scala.collection.immutable.Map[Int,Array[Int]] = """ + $show(ages ));$skip(43); val res$12 = 

  ages map { case (k, v) => (k, v.size) };System.out.println("""res12: scala.collection.immutable.Map[Int,Int] = """ + $show(res$12));$skip(30); val res$13 = 
  ages.mapValues(v => v.size);System.out.println("""res13: scala.collection.immutable.Map[Int,Int] = """ + $show(res$13))}
}
