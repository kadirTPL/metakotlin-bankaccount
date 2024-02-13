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



}
