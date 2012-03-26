package ar.com.santiagobasulto.unsynchbank

class Account(val initialBalance: Double){
  var balance: Double = initialBalance
  def debit(amount: Double): Unit ={
    balance -= amount
  }
  def credit(amount: Double): Unit ={
    balance += amount
  }
}

class Bank(val nrOfAccounts:Int, val initialBalance:Double){
  val accounts:Array[Account] = Array.fill(nrOfAccounts)(new Account(initialBalance))

  def size = this.accounts.size 
  def totalBalance:Double ={
    accounts.foldLeft(0.0)((t,i) => t + i.balance)
  }
  def getAccount(id: Int): Account = this.accounts(id)
  def transfer(fromId: Int,toId: Int,amount: Double){
    val from = getAccount(fromId)
    val to = getAccount(toId)
    from.debit(amount)
    to.credit(amount)
  }
}
