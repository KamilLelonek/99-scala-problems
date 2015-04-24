import org.scalatest._

class P11Spec extends FlatSpec with Matchers {
  import P11._

  it should "compress and count consecutive duplicates from a given lists" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  it should "put each element in a single list from anunique list" in {
    encodeModified(List(1, 2, 3)) should be (List(1, 2, 3))
  }

  it should "do nothing with empty list" in {
    encodeModified(List()) should be (List())
  }
}
