fun main(){
    var supply = arrayOf("Item 1", "Item 2", "Item 3")
    var qty = arrayOf("10", "5", "22")
    var userAns = 0
    var amount = 0
    // for (i in supply.indices){ works too
//    for (i in 0..supply.size -1){
//        println("The ${supply[i]} has ${qty[i]} items.")
//    }
    var combArray = arrayOf<Array<String>>()
    combArray+= supply
    combArray+= qty
    var rowcount = combArray[0].size -1

    println("Please enter the number of your selection: ")
    println("1) Show Inventory")
    println("2) Replace Inventory")
    println("3) Stop")
    print("Enter Your Choice: ")
    userAns = readLine()!!.toInt()
    do {
        if (userAns == 1) {
            println("Your Current Inventory:")
            for (i in 0..rowcount) {
                var a_item = combArray[0][i]
                var a_qty = combArray[1][i]
                println("$a_item has $a_qty items.")
            }
        } else if (userAns == 2) {
            println("Please Enter the Number Item You Would Like to Replace: ")
            println("1) Item 1")
            println("2) Item 2")
            println("3) Item 3")
            print("Enter Your Choice: ")
            userAns = readLine()!!.toInt()
            if (userAns == 1) {
                print("Enter the Amount You Would Like to Replace in Item 1: ")
                amount = readLine()!!.toInt()
                qty[0] += amount.toString()
            }else if (userAns == 2) {
                print("Enter the Amount You Would Like to Replace in Item 2: ")
                amount = readLine()!!.toInt()
                qty[1] += amount.toString()
            }else if (userAns == 2) {
                print("Enter the Amount You Would Like to Replace in Item 3: ")
                amount = readLine()!!.toInt()
                qty[2] += amount.toString()
            }

        }
    }while (userAns != 1 && userAns != 2 && userAns != 3)
}