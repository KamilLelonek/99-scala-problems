import org.scalatest._

class P09Spec extends FlatSpec with Matchers {
  import P09._

  it should "group the same elements in separate lists" in {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  it should "put each element in a single list from anunique list" in {
    pack(List(1, 2, 3)) should be (List(List(1), List(2), List(3)))
  }

  it should "do nothing with empty list" in {
    pack(List()) should be (List())
  }
}
