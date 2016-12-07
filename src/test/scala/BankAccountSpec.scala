import org.specs2.mutable.Specification


class BankAccountSpec extends Specification {
  val bank = new BankAccount(123, 100)


  "initial balance in the bank should be: 100" in {
    bank._initialBalance must be equalTo 100
  }

  "bank account number must be: 123" in {
    bank.accountNumber must be equalTo 123
  }

  "balance will be 200 when 100 is deposited in the account" in {
    bank.deposit(100) must be equalTo 200
  }

  "balance will be 150 when 50 is withdraw from the account" in {
    bank.withdraw(50) must be equalTo 150
  }


}

