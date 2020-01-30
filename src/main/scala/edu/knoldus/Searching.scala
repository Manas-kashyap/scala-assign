package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    var left = 0
    var right = array.length-1
    while (left<=right) {
      val mid = left + (right-left)/2
      if (array(mid)==elem)
        {true}
      else if (array(mid)>elem)
        {right = mid-1}
      else
        {left = mid + 1}
    }
    true
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    if (array.isEmpty) { false }
    else if (array.head == elem) { true }
    else { linearSearch(array.tail, elem) }
      true
  }


}
