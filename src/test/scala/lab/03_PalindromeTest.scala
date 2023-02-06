import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class PalindromeTest extends AnyFunSuite with Matchers:
  
  test("") {
    isPalindrome("") should be (true)
  }
  
  test("123") {
    isPalindrome("123") should be (true)
  }
  
  test("arbitrary"){
    isPalindrome("asdfasdfadshior29=t2p9hhighio") should be (false)
  }
  
  test("civic") {
    isPalindrome("civic") should be (true)
  }

  test("banana") {
    isPalindrome("banana") should be (false)
  }
  
  test("sit on a potato pan, otis") {
    isPalindrome("sit on a potato pan, otis") should be (true)
  }
  
  test("Was it a car or a cat I saw?") {
    isPalindrome("Was it a car or a cat I saw?") should be (true)
  }
  
  test("drab as a fool as aloof as a bard") {
    isPalindrome("drab as a fool as aloof as a bard") should be (true)
  }
  
  test("Yawn a more Roman way.") {
    isPalindrome("Yawn a more Roman way.") should be (true)
  }
  
  test("Dennis … sinned") {
    isPalindrome("Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel and Ellen sinned. Ban campus motto: \"Bottoms up, MacNab\". Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel and Ellen sinned.") should be (true)
  }
  
  test("Long panama") {
    isPalindrome("A man, a plan, a canoe, pasta, heros, rajahs, a coloratura, maps, snipe, percale, macaroni, a gag, a banana bag, a tan, a tag, a banana bag again (or a camel), a crepe, pins, Spam, a rut, a Rolo, cash, a jar, sore hats, a peon, a canal; Panama!") should be (true)
  }
  
end PalindromeTest