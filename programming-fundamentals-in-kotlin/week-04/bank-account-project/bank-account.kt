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

    // Step 2 
    var output = 0 
     
    // Step 4 
    output = withdraw(money) 
    println("The amount you withdrew is ${output} dollars.") 

    // Step 6 
    output = debitWithdraw(money) 
    println("The amount you withdrew is ${output} dollars.") 

    // Step 7 
    fun deposit(amount: Int): Int { 
        accountBalance += amount 
        println("You successfully deposited ${amount} dollars. The current balance is ${accountBalance} dollars.") 
        return amount 
    } 
 

    // Step 8 

    output = deposit(money) 
    println("The amount you deposited is ${output} dollars.") 

 
    // Step 10 
    output = creditDeposit(money) 
    println("The amount you deposited is ${output} dollars.") 

 

 
}
