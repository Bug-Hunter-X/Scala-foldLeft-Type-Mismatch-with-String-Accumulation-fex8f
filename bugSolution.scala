```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of foldLeft with String accumulation
  val result = list.foldLeft("")((acc, elem) => acc + elem.toString)

  println(result) // Output: 12345

  // Alternative more concise version
  val result2 = list.mkString
  println(result2) //Output: 12345
}
```