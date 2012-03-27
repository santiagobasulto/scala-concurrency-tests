package ar.com.santiagobasulto.unsynchbank

class UnsynchBank(val nrOfAccounts:Int, val initialBalance:Double) with Bank{
  
  val accounts:Array[Account] = Array.fill(nrOfAccounts)(new Account(initialBalance))

  def size = this.accounts.size 
  def totalBalance:Double ={
    //accounts.foldLeft(0.0)((t,i) => t + i.balance)
    // Using implicit conversion
    accounts.foldLeft(0.0)((t,i) => t + i)
  }
  def getAccount(id: Int): Account = this.accounts(id)
  
  def transfer(fromId: Int,toId: Int,amount: Double){
    val from = getAccount(fromId)
    val to = getAccount(toId)
    from.debit(amount)
    to.credit(amount)
  }
}
