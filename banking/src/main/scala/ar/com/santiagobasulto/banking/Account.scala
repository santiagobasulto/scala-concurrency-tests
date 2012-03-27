trait Account
  
  var balance: Double
  
  def debit(amount: Double): Unit ={
    balance -= amount
  }
  def credit(amount: Double): Unit ={
    balance += amount
  }
}
/*
object Account{
  implicit def account2Double(a: Account): Double = a.balance
}
*/
