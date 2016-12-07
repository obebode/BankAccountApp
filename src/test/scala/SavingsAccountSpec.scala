import org.scalatest._

import org.specs2.mutable.Specification

class SavingsAccountSpec extends Specification {

  val savings = new SavingsAccount(123, 100)

  "Add 10 perent interest to the balance and the new balance will be: 110" in {
    savings.addInterest(10) must be equalTo 110
  }

  "amount to indicate negative to allow for overdraft " in {
    savings.withdraw(200) must be equalTo -100
  }
}
