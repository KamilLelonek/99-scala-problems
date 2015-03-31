import org.scalatest._

class P01Spec extends FlatSpec with Matchers {
  import P01._

  it should "find the last element of a given list" in {
    val lastElement = 3
    val list        = List(true, "string") :: lastElement :: Nil
    last(list) should be (lastElement)
  }

  it should "throw NoSuchElementException for an empty list" in {
    val emptyList = List()
    a [NoSuchElementException] should be thrownBy {
      last(emptyList)
    }
  }
}
