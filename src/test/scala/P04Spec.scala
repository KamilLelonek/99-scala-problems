import org.scalatest._

class P04Spec extends FlatSpec with Matchers {
  it should "find the length of a given list" in {
    P04.length(List())        should be (0)
    P04.length(List(1, 2, 3)) should be (3)
  }
}
