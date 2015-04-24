import org.scalatest._

class P11Spec extends FlatSpec with Matchers {
  import P11._

  it should "encode and count consecutive duplicates from a given lists but only if more than one" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  it should "not transform list when there are not consecutive duplicates" in {
    encodeModified(List(1, 2, 3)) should be (List(1, 2, 3))
  }

  it should "do nothing with empty list" in {
    encodeModified(List()) should be (List())
  }
}
