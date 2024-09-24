class BankAccount(deposited: Long,withdrawn: Long){
    var deposited: Long = deposited
    var withdrawn :Long = withdrawn
    val balance = deposited - withdrawn
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}
