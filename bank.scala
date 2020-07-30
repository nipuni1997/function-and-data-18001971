object bank {

  class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    var accnumber: Int = n
    var balance: Double = b
    val overdraft: List[Account] => List[Account] = (a:List[Account])=>a.filter(x=>x.balance<0)
    val sumOfBalance: List[Account] => Account = (a:List[Account])=>a.reduce((y, z)=> new Account("all",0,y.balance+z.balance))
    val Interest: List[Account] => List[Account] = (a:List[Account])=>a.map(y=>{if(y.balance<0) new Account(y.nic,y.accnumber,y.balance*1.05) else new Account(y.nic,y.accnumber,y.balance*1.1)})
    override def toString: String =
      "["+nic+":"+accnumber +":"+ balance+"]"
  }
  def main(argc: Array[String]): Unit ={
    val bank:List[Account]=List(
      new Account("001",200,-1000.00),
      new Account("002",300,-200.00),
      new Account("003",400,-2000.00),
      new Account("004",500,3000.00)
    )
    println("Accounts with negative balances:"+bank.head.overdraft(bank))
    val x=bank.head.sumOfBalance(bank)
    println("Sum of all account balances:"+x.balance)
    println("Balance after applying interest"+bank.head.Interest(bank))

  }
}
