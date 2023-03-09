fun main() {
    // Step 1
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    
    // Step 2
    var accountType = ""
    var userChoice = 0
    
    // Step 3
    while (accountType == "") {
       println("Choose an option (1, 2 or 3)")
       userChoice = (1..5).random()
       println("The selected option is ${userChoice}.")
       
       when (userChoice) {
           1 -> accountType = "debit"
           2 -> accountType = "credit"
           3 -> accountType = "checking"
           else -> continue
       }
    }
  
    //Step 4
    println("You have created a ${accountType} account.")

    var accountBalance = (0..1000).random() 
    println("The current balance is ${accountBalance} dollars.") 

    val money = (0..1000).random() 
    println("The amount you transferred is ${money} dollars.") 

    var output = 0 
    
    // Withdraw
    fun withdraw(amount: Int): Int {
        accountBalance -= amount
        println("You successfully withdrew ${amount} dollars. The current balance is ${accountBalance} dollars.")
        return amount
    }
    
    output = withdraw(money) 
    println("The amount you withdrew is ${output} dollars.") 

    
    // Debit Withdraw
    fun debitWithdraw(amount: Int): Int {
        if (accountBalance == 0) {
            println("Can't withdraw, no money on this account!")
            return accountBalance
        } else if (amount > accountBalance) {
            println("Not enough money on this account! The current balance is ${accountBalance} dollars.")
            return 0
        } else {
            return withdraw(amount)
        }
    }
    
    output = debitWithdraw(money) 
    println("The amount you withdrew is ${output} dollars.") 

    // Deposit
    fun deposit(amount: Int): Int { 
        accountBalance += amount 
        println("You successfully deposited ${amount} dollars. The current balance is ${accountBalance} dollars.") 
        return amount 
    }
    
    output = deposit(money) 
    println("The amount you deposited is ${output} dollars.") 

    // Credit Deposit
    fun creditDeposit(amount: Int): Int {
        if (accountBalance == 0) {
            println("This account is completely paid off! Do not deposit money!")
            return accountBalance
        } else if (accountBalance + amount > 0) {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The current balance is ${accountBalance} dollars.")
            return 0
        } else if (amount == -accountBalance) {
            accountBalance = 0
            println("You have paid off this account!")
            return amount
        } else {
            return deposit(amount)
        }
    }
    
    output = creditDeposit(money) 
    println("The amount you deposited is ${output} dollars.") 
}
