import org.scalatest._

class P10Spec extends FlatSpec with Matchers {
  import P10._

  it should "compress and count consecutive duplicates from a given lists" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  it should "put each element in a single list from anunique list" in {
    encode(List(1, 2, 3)) should be (List((1, 1), (1, 2), (1, 3)))
  }

  it should "do nothing with empty list" in {
    encode(List()) should be (List())
  }
}
