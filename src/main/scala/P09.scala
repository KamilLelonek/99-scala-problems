/**
  P09 (**) Pack consecutive duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.

  Example:
    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/

object P09 {
  def gather[T](list: List[T]): List[T] = list match {
    case h :: tail => h :: gather(tail.takeWhile(_ == h))
    case _         => Nil
  }

  def pack[T](list: List[T]): List[List[T]] = list match {
    case h :: tail => gather(list) :: pack(tail.dropWhile(_ == h))
    case _         => Nil
  }
}
