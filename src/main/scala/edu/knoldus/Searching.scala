package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val SortedArray = array.sortWith(_ < _)
    val k=mySearch(SortedArray,0,array.length-1,elem)
    k
  }
  def mySearch(array:Array[Int],l:Int,r:Int,elem:Int):Boolean= {
    if (r >= l) {
      val mid = l + (r - l) / 2
      if (array(mid) == elem)
      {
       true
      }
      if (array(mid) > elem) {
        mySearch(array, l, mid - 1, elem)
      }
      mySearch(array, mid + 1, r, elem)
    }else{
    false }
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    if (array.isEmpty) { false }
    else if (array.head == elem) { true }
    else { linearSearch(array.tail, elem) }
      true
  }
}
