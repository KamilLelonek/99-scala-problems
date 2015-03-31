import org.scalatest.FlatSpec

class P06Spec extends FlatSpec {
  import P06._

  it should "confirm that list is a palindrome" in {
    assert(isPalindrome(List()))
    assert(isPalindrome(List(1, 2, 1)))
  }

  it should "deny that list is a palindrome" in {
    assert(!isPalindrome(List(1, 2, 3)))
  }
}
