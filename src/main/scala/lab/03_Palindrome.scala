/** 
  *  True if the string with all spaces and punctuation removed is a palindrome
  *  
  *  Hint: the Scala collections API is your friend
  *  https://docs.scala-lang.org/overviews/collections-2.13/overview.html
  */
def isPalindrome(s: String): Boolean =  {
  val data = s.filter(l => l.isLetter).map(l => l.toLower)
  return data == data.reverse
}
