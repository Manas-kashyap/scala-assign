package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for (i <- 0 until array.length) {
      val item = array(i)
      var j = i
      while (j > 0 && array(j - 1) > item) {
        array(j) = array(j - 1)
        j = j - 1
      }
      // put item in the hole
      array(j) = item
    }

    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    def swap(array: Array[Int], i: Int, j: Int) {
      var tmp = array(i)
      array(i) = array(j)
      array(j) = tmp
    }

    var i = 0
    while (i < (array.length - 1)) {
      var min = i
      var j = i + 1

      while (j < array.length) {
        if (array(j) < array(min)) {
          min = j
        }
        j += 1
      }

      swap(array, i, min)
      i += 1
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    val hasSwaps =
      for {
        i <- (1 until array.length)
      } yield {
        if (array(i - 1) > array(i)) {
          val tmp = array(i)
          array(i) = array(i - 1)
          array(i - 1) = tmp
          true
        }
        else {false}
      }

    if (hasSwaps.reduce(_ || _)){bubbleSort(array)}
    else {array}
  }

}
