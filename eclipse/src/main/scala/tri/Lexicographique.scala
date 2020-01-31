package tri

import common._

object Lexicographique {
    
  /**
   * Ordre lexicographique
   */
  def compareLexico(str1: List[Char], str2: List[Char]): Boolean = {
    (str1, str2) match {
      case (Nil, Nil) | (Nil, _) => true
      case (_, Nil) => false
      case (elem1::reste1, elem2::reste2) if elem1 > elem2 => false
      case (elem1::reste1, elem2::reste2) if elem1 < elem2 => true
      case (elem1::reste1, elem2::reste2) => compareLexico(reste1, reste2)
    }
  }
}