import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.ShouldMatchers

import ar.com.santiagobasulto.unsynchbank.Bank
import ar.com.santiagobasulto.unsynchbank.Account

class BankSuite extends FunSuite with BeforeAndAfter with ShouldMatchers{
  var bank: Bank = _
  before {
    bank = new Bank(nrOfAccounts = 10, initialBalance=1000)
  }

  test("Bank should have 10 accounts"){
    bank should have size (10)
  }

  test("Total ammount of money in bank"){
    (bank 
      totalBalance) should equal (10000)
  }
  test("A bank should have 10 accounts"){

  }
  test("The initial balance of an account should be 1000"){
    val a: Account = bank.getAccount(1);
    (a balance) should equal (1000)
  }
  test("After transfering 100 from account 1 to account 2 the total balance should remain"){
    bank.transfer(1,2,100)
    (bank totalBalance) should equal (10000.0)
  }
}
