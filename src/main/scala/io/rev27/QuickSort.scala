package io.rev27

import scala.util.Random

object QuickSort:
  def quickSort(arr: Seq[Int]): Seq[Int] =
    doQuickSort(arr)
  end quickSort

  private def doQuickSort(arr: Seq[Int]): Seq[Int] =
    val lenArr = arr.length
    if lenArr <= 1 then arr
    else
      val pivot = arr(Random.nextInt(lenArr))
      val lesser: Seq[Int] = arr.filter(elem => elem < pivot)
      val greater: Seq[Int] = arr.filter(elem => elem > pivot)
      (doQuickSort(lesser):+pivot)++doQuickSort(greater)
  end doQuickSort
end QuickSort

