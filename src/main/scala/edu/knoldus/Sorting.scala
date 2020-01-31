package edu.knoldus

class Sorting {
  def insertionSort(array: Array[Int]): Array[Int] = {
    for(i<-1 to array.length-1)
    {
      for(j<- i to 1 by -1)
      {
        if(array(j-1)>array(j))
        {
          val temp=array(j)
          array(j)=array(j-1)
          array(j-1)=temp
        }
      }
    }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for(i<-0 to array.length-1)
    {
      val x = Array(i)
      for(j<-i to array.length-1) {
        if (array(j) < array(x(0))) {
          x(0) = j
        }
      }
      val temp=array(i)
      array(i)=array(x(0))
      array(x(0))=temp
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    val swap =
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
    if (swap.reduce(_ || _)){bubbleSort(array)}
    else {array}
  }
}
