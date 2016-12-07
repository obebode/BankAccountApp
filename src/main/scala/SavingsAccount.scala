
class SavingsAccount(accountNumber: Int, _initialBalance: Double) extends BankAccount(accountNumber, _initialBalance) {
  def this(accountNumber: Int) = this(accountNumber, 0.0)

  private var balance = _initialBalance

  def addInterest(percentInterestRate: Double) {
    balance += (percentInterestRate / 100) * balance
  }

  override def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

}