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

fun withdraw(amount:Int):Int {
    accountBalance =accountBalance-amount
    println("You successfully withdrew $amount dollars.")
    println("Your current balance is:$accountBalance")
    return amount
}
fun deposit(amount:Int):Int{
    accountBalance= accountBalance+amount
    println("You successfully deposited $amount dollars.")
    println("Your current balance is:$accountBalance")
    return amount
}
fun debitWithdraw(amount:Int):Int{
    if (amount > accountBalance) {
        println("Not enough money on this account! The current balance is ${accountBalance} dollars.")
        return 0
    } else {
        return withdraw(amount)
    }
}
fun creditDeposit(amount:Int):Int{
    if(-accountBalance + amount > 0){
        println("Can not deposit. You are trying to deposit more money than your credit balance.")
        return 0
    }
    else {
        return deposit(amount)
    }
}
fun transfer (mode:String){
    println("Please enter the transfer amount:")
    val money= readln().toInt()
    val transferAmount:Int
    when(mode){
    "withdraw"->{
        if(accountType.equals("debit"))
            transferAmount=debitWithdraw(money)
        else
            transferAmount=withdraw(money)
    }
    "deposit"->{
        if(accountType.equals("credit"))
            transferAmount=creditDeposit(money)
        else
            transferAmount=deposit(money)
    }
    else->{
        return
    }
        }
}
    var isSystemOpen=true
    var option=0
    while(isSystemOpen){
        println("What would you like to do?")
        println("1. Check bank account balance")
        println("2. Withdraw money")
        println("3. Deposit money")
        println("4. Close the app")
        println("Which option do you choose? (1, 2, 3 or 4)")
        var option=readln().toInt()
        when(option){
            1->println("Your balance is:$accountBalance")
            2->transfer("withdraw")
            3->transfer("deposit")
            4->isSystemOpen=false
            else->continue
        }




    }









}
