object Hello extends App {
  val dt = List("Poniedziałek","Wtorek", "środa", "Czwartek","Piątek", "Sobota","Niedziela");

   for(i <- dt){println(i)}
   for(i <- dt if i.charAt(0) == 'P'){println(i)};
    dt.foreach{println}
    var counter = 0;
    while (counter < dt.length){
      println(dt(counter))
      counter +=1;
    }


  def rekuerncja(myList : List[String]):String={
    if(myList.isEmpty) ""
    else
      myList.head + "\n" +rekuerncja(myList.tail);
  }
  println(rekuerncja(dt));

  println(rekuerncjaodKonca(dt));
  def rekuerncjaodKonca(myList : List[String]):String={
    if(myList.isEmpty) ""
    else
      myList.last + "\n" +rekuerncjaodKonca(myList.take(myList.length-1));
  }
  println( dt.foldLeft("")(_ +" "+ _));
  println( dt.foldRight("")(_ +" "+ _));
  println(dt.foldLeft("") { (acc, i) => if(i.charAt(0)=='P') acc+" "+i else acc })
  //mapy
  var products = Map("chleb"->2.00,"masło" ->10.00, "jajka" ->6.00)
  var cheaperProducts = products.mapValues(x => x*0.9);
  for ((k,v) <- cheaperProducts) printf("key: %s, value: %s\n", k, v)

  //tuple
  def printTuple(tuples : (String, Int, Double)) =
  {
    print(tuples._1 + "\n" + tuples._2 + "\n" + tuples._3)
  }
  printTuple(Tuple3("Dajana", 1, 2.3));

  var option = products.get("mleko");

  println(option.getOrElse("nie ma produktu"))

  def zadanie5(x : String): String={
    x match{
      case ("Poniedziałek" | "Wtorek" | "środa" | "Czwartek" | "Piątek") => "Praca"
      case ("Sobota" | "Niedziela") => "Weekend"
      case  _ => "Nie ma takiego dnia"
    }
  }
  println(zadanie5(" k"))
}