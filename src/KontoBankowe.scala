 class KontoBankowe( stanKonta:Double) {
    private var _stanKonta = stanKonta;
   def balance = _stanKonta
  def this() {
    this(_stanKonta = 0.0);
  }
    def wplata(ile:Double){
      _stanKonta = _stanKonta+ile;
    }

    def wyplata(ile:Double){
      if(stanKonta<ile)
        println("Nie posiada tyle na koncie!");
      else{
        _stanKonta = _stanKonta - ile;
      }
    }

}

object Demo{
  def main(args: Array[String]): Unit = {
    val kb = new KontoBankowe(40)
    kb.wplata(10);
    println(kb.balance);
    kb.wyplata(20);
    println(kb.balance);
  }
}