object Demo3{
  def deleteZeroFromList(list : List[Int]): List[Int]={
    list.filterNot(_==0);

  }
  def incrementList(list : List[Int]): List[Int]={
    list.map(n => n +1)
  }

  def absoluteValue(list : List[Int]): List[Int]={
    var result = list.filter(x=>(x>=(-5) && x<=12))
    result.map(_ abs)
  }
  def main(args: Array[String]): Unit = {
    var list = List(0,1,23,0,56,0,43,0);
    list = deleteZeroFromList(list);
    println(list)
    println(incrementList(list))
    println(absoluteValue(List(-234,-2,1,-4,-5,2,6,765)))
  }
}
