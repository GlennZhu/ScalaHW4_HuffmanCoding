package patmat

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  val chars = List('c', 'a', 'c', 'b', 'b');System.out.println("""chars  : List[Char] = """ + $show(chars ));$skip(82); ;
  val result = chars.groupBy { c => c }.values.map(l => (l.head, l.size)).toList;;System.out.println("""result  : List[(Char, Int)] = """ + $show(result ))}
}
