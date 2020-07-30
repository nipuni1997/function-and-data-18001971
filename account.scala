object account {
  var bank:List[Account]=List()
  class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    def transfer(a:Account,b:Double): Double =this.b+a.balance
    override def toString: String =
      "["+nic+":"+acnumber +":"+ balance+"]"
  }
  def main(argc: Array[String]): Unit ={
    println("Enter ID number:")
    val p = readLine()
    println("Enter account number:")
    val q=readInt()
    println("Enter transfer amount:")
    val t=readDouble()
    val z=new Account(p,q,t)
    println(t+ "amount tranfered from"+z)
  }

}
