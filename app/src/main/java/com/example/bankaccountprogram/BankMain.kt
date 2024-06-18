package com.example.bankaccountprogram

fun main(){
    val bhavyaBankAccount = BankAccount("Bhavya Desai", 12223.40)

    bhavyaBankAccount.deposit(200.0)
    bhavyaBankAccount.withdraw(100.0)
    bhavyaBankAccount.deposit(3000.0)
    bhavyaBankAccount.deposit(300.0)
    bhavyaBankAccount.withdraw(300.0)

    bhavyaBankAccount.displayTransactionHistory()

    println("${bhavyaBankAccount.accountHolder}'s balance is ${bhavyaBankAccount.acctBalance()}")

    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)

    sarahBankAccount.displayTransactionHistory()

    println( println("${sarahBankAccount.accountHolder}'s balance is ${sarahBankAccount.acctBalance()}"))

}