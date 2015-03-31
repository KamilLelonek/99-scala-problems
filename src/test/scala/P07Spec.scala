import org.scalatest._

class P07Spec extends FlatSpec with Matchers {
  import P07._

  it should "flatten given nested lists" in {
    flatten(List(List(1, 2, 3), 4, List(5, 6, List(7)))) should be (List(1, 2, 3, 4, 5, 6, 7))
  }

  it should "do nothing with empty list" in {
    flatten(List()) should be (List())
  }
}
