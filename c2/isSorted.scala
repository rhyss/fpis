def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) : Boolean = {

  @annotation.tailrec
  def loop(acc: Int): Boolean = {
    if (as.length <= acc + 1) true
    else ordered(as(acc), as(acc+1)) && loop(acc+1)
  }
  
  loop(0)
}