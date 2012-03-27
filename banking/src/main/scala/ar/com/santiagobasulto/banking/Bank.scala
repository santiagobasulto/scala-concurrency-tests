package ar.com.santiagobasulto.banking

trait Bank{
  
  val accounts: Seq[Account]

  def size = this.accounts.size 
  def totalBalance:Double ={
    accounts.foldLeft(0.0)((t,i) => t + i.balance)
    // Using implicit conversion
    //accounts.foldLeft(0.0)((t,i) => t + i)
  }
  def getAccount(id: Int): Account = this.accounts(id)
  
  def transfer(fromId: Int,toId: Int,amount: Double):Unit
}
