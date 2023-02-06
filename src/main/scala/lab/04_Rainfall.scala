/**
  *  Computes the average of a sequence of `Double`s that represents daily 
  *  rainfall readings.  
  *  
  *  The input may contain the number -999 indicating the end of the data of 
  *  interest. The function computes the average of the non-negative values in
  *  the input up to the first -999 (if it shows up).  There may be negative 
  *  numbers other than -999 in the input (representing faulty readings).  
  *  
  *  If there are no valid readings, returns `Double.NaN`.
  *  
  *  Hint: the Scala collections API is your friend
  *  https://docs.scala-lang.org/overviews/collections-2.13/overview.html
  */
def rainfall(data: Seq[Double]): Double = {
  val processedData = data.takeWhile(n => n != -999).filter(n => n >= 0)
  processedData.sum / processedData.length
}
