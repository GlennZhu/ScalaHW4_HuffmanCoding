package patmat

object Test {
  val chars = List('c', 'a', 'c', 'b', 'b');      //> chars  : List[Char] = List(c, a, c, b, b)
  val result = chars.groupBy { c => c }.values.map(l => (l.head, l.size)).toList;
                                                  //> result  : List[(Char, Int)] = List((b,2), (a,1), (c,2))
}