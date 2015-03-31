import org.scalatest._

class P03Spec extends FlatSpec with Matchers {
  import P03._

  it should "find the nth element of a given list" in {
    val second = 1
    val list   = List("first", second)
    nth(0, list) should be (list.head)
    nth(1, list) should be (second)
  }

  it should "throw IndexOutOfBoundsException for an empty list" in {
    val emptyList = List()
    a [IndexOutOfBoundsException] should be thrownBy {
      nth(0, emptyList)
    }
  }

  it should "throw IndexOutOfBoundsException when n isn't less than list length" in {
    val oneElementList = List(1)
    a [IndexOutOfBoundsException] should be thrownBy {
      nth(1, oneElementList)
    }
  }
}
