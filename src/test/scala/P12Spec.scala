import org.scalatest._

class P12Spec extends FlatSpec with Matchers {
  import P12._

  it should "decode and expand elements from a given list" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be (List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  it should "just flatten symbols with count of 1" in {
    decode(List((1, 'a), (1, 'b), (1, 'c))) should be (List('a, 'b, 'c))
  }

  it should "do nothing with empty list" in {
    decode(List()) should be (List())
  }
}
