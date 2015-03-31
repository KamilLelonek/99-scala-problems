/**
  P07 (**) Flatten a nested list structure.

  Example:
    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */

object P07 {
   def flatten[T](list: List[T]): List[T] = list match {
     case head :: tail => {
       head match {
         case h : List[T] => flatten(h) ++ flatten(tail)
         case _ : Any => head :: flatten(tail)
       }
     }
     case _ => Nil
   }
 }
