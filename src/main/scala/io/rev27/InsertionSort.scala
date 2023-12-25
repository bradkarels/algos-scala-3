package io.rev27

object InsertionSort:
  def iSort(ints: Array[Int]): Array[Int] =
    for (i <- 1 until ints.length)
      var j = i
      while ints(j) < ints(j-1) do
        // swap
        val smaller = ints(j)
        ints(j) = ints(j-1)
        ints(j-1) = smaller
        if j > 1 then j = j -1
    ints
end InsertionSort
