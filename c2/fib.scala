def fib(n: Int): Int = {

  @annotation.tailrec
  def go(n1: Int, x1: Int, x2: Int): Int = {
    if (n == n1) x1 + x2
    else go(n1 + 1, x1 + x2, x1)
  }

  n match {
    case 0 => 0
    case 1 => 1
    case _ => go(2, 1, 0)
  }
}