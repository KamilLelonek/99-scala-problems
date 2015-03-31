import org.scalatest._

class P05Spec extends FlatSpec with Matchers {
  import P05._

  it should "reverse a given list" in {
    reverse(List())        should be (List())
    reverse(List(1, 2, 3)) should be (List(3, 2, 1))
  }
}
