


object BankAccount {
  private val accountNum: Int = 123
}

class BankAccount(var accountNumber: Int, var _initialBalance: Double) extends Logger {
  def this(accountNumber: Int) = this(accountNumber, 0.0)

  accountNumber = BankAccount.accountNum
  private var balance = _initialBalance

  def deposit(amount: Double) = {
    balance = balance + amount
    balance

  }
  def withdraw(amount: Double) = {
    if (amount > balance) log("You don't have enough amount")
    else
      balance = balance - amount
    balance
  }

  override def toString: String = "(" + accountNumber + ", " + _initialBalance + ")"
}

trait Logger {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logger {
  override def log(msg: String) {
    println(msg)
  }
}

trait TimestampLogger extends Logger {
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }

}
