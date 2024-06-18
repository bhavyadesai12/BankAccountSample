package com.example.bankaccountprogram

class BankAccount(var accountHolder: String,
                  var balance:Double)
{
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        balance += amount
       // balance = balance + amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double){
        if(amount <= balance ){
            //we can withdraw money
            balance -= amount
            // balance = balance - amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else{
            //we cannot withdraw money
            println("You dont have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory(){
        for(transaction in transactionHistory){
            println("Transaction history for $accountHolder")
            println(transaction)
        }

    }

    fun acctBalance():Double{
        return balance
    }
}