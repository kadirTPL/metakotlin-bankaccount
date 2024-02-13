fun main(){
    var accountType=""
    var userChoice=0
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    println("Choose an option (1, 2 or 3)")
    userChoice= readln().toInt()
    while(true){
        when(userChoice)
        {
            1->{accountType="debit"
                break}
            2->{accountType="credit"
                break}
            3->{accountType="checking"
                break}

            else-> {println("Incorrect choice. You should enter 1, 2 or 3")
                userChoice= readln().toInt()}

        }}
    println("You have created a $accountType account.")
    println("Enter your balance:")
var accountBalance= readln().toInt()
println("The current balance is $accountBalance dollars.")
val money= readln().toInt()
fun withdraw(amount:Int):Int {
        println("You succesfully withdrew $amount dollars.")
    println("Your current balance is:$accountBalance")
        accountBalance -= amount
    return accountBalance
}
fun deposit(amount:Int):Int{
    accountBalance+=amount
    println("You succesfully deposited $amount dollars.")
    println("Your current balance is:$accountBalance")
    return accountBalance
}
fun debitWithdraw(amount:Int):Any{
    if (amount > accountBalance) {
        println("Not enough money on this account! The current balance is ${accountBalance} dollars.")
        return 0
    } else {
        return withdraw(amount)
    }
}
fun creditDeposit(amount:Int):Int{
    if(accountBalance + amount > 0){
        println("Can not deposit. You are trying to deposit more money than your credit balance.")
        return 0
    }
    else {
        return deposit(amount)
    }
}


}
