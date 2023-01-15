fun main() {
    var x = 5
    println(x > 3 && x < 10) //Or Operation
    println(x > 3 || x < 4) //And Operation 

    var myBool = true
    println(!myBool) //Not Operation

    //Logical Operations
    var num1 = 100;
    var check = true

    //Or Operation
    if (num1 > 100 || num1 < 500) {
        println("$num1 satisfies any of the conditions")
        num1 = 2000
    }

    //And Operation
    if (num1 > 1000 && num1 < 5000) {
        println("$num1 satisfies both the conditions")
    }

    //Not Operation
    if (check) {
        check = !check
        println("Value of check after inversion is : $check")
    }


    //Using when as a statement with else
        print ("Enter the name of heavenly body: ")
        var name = readLine() !!. toString()

        when(name) {
            "Sun" -> print("Sun is a Star")
            "Moon" -> print("Moon is a Satellite")
            "Earth" -> print("Earth is a planet")
            else -> print("I don't know anything about it")
        }

}

