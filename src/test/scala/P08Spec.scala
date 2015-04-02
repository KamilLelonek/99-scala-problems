import org.scalatest._

class P08Spec extends FlatSpec with Matchers {
  import P08._

  it should "compress a given list" in {
    compress(List(1, 2, 2, 3, 3, 3, 1, 1, 2, 2, 2, 3, 3, 3, 3)) should be (List(1, 2, 3, 1, 2, 3))
  }

  it should "do nothing with an already unique list" in {
    val uniqueElementsList = List(1, 2, 3)
    compress(uniqueElementsList) should be (uniqueElementsList)
  }

  it should "do nothing with empty list" in {
    compress(List()) should be (List())
  }
}
