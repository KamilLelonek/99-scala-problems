import collection.mutable.Stack
import org.scalatest._

class P02Spec extends FlatSpec with Matchers {
  import P02._

  it should "find the last but one element of a given list" in {
    val penultimateElement = 3
    val list               = "first" :: penultimateElement :: true :: Nil
    penultimate(list) should be (penultimateElement)
  }

  it should "throw NoSuchElementException for an empty list" in {
    val emptyList = List()
    a [NoSuchElementException] should be thrownBy {
      penultimate(emptyList)
    }
  }

  it should "throw NoSuchElementException for a list with only one element" in {
    val oneElementList = List(1)
    a [NoSuchElementException] should be thrownBy {
      penultimate(oneElementList)
    }
  }
}
