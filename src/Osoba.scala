case class Osoba(val imie: String, val nazwisko: String) {

  def hello(o : Osoba):String={
    o match {
      case Osoba("Dajana", "Kubica") => "Dzień dobry Dajano"
      case Osoba("Ewa","Nowak") => "Witaj Ewa Nowak"
      case Osoba("Piotr","Kowalski") => "Siema Piotrze"
      case Osoba("Kuba","Godlewski") => "Dzień dobry panie Piotrze"
      case Osoba(imie,nazwisko) => "Witaj nieznajomy o imieniu " + imie
    }
  }
}
object Demo2{
  def main(args: Array[String]): Unit = {
    val o1 = new Osoba("Dajana", "Kubica");
    val o2 = new Osoba("Ewa", "Nowak");
    val o3 = new Osoba("Piotr", "Kowalski");
    val o4 = new Osoba("Kuba", "Godlewski");
    val o5 = new Osoba("Karol", "Makowiecki");

    println((o5.hello(o5)));
    println((o4.hello(o4)));
    println((o3.hello(o3)));
    println((o2.hello(o2)));
    println((o1.hello(o1)));


  }

}