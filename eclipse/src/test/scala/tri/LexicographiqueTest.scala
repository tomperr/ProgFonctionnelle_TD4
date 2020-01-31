package tri

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LexicographiqueTest extends FunSuite {
    
  import Lexicographique._
  
  /**
   * Test lexico
   */
  test("Lexico - 1") {
    assert(compareLexico(List('1', '2', '3'), List('1', '3', '3')) === true)
  }
  
  test("Lexico - 2") {
    assert(compareLexico(List('1', '2', '2'), List('3', '2', '3', '0')) === true)
  }
  
  test("Lexico - 3") {
    assert(compareLexico(List('9', '5', '1'), List('4', '3', '2')) === false)
  }
  
  test("Lexico - empty first list") {
    assert(compareLexico(List(), List('1', '3', '3')) === true)
  }
  
  test("Lexico - empty second list") {
    assert(compareLexico(List('1', '2', '3'), List()) === false)
  }
  
  test("Lexico - empty lists") {
    assert(compareLexico(List(), List()) === true)
  }
  
  test("Lexico - same lists") {
    assert(compareLexico(List('1', '2', '3'), List('1', '2', '3')) === true)
  }
}