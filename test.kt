fun main() {
    println("Hello!")
    println("What is your name?")

if (20 > 18) {
    println("20 is greater than 18")
}

// Kotlin if 

val x = 20
val y = 18
if (x > y) {
    println("x is gretaer than y")
}

// Kotlin else

val time = 20
if (time < 18) {
    println("Good day.")
} else {
    println("Good evening.")
}


val hour = 22
if (hour < 10) {
    println("Good morning.")
} else if (hour < 20) {
    println("Good day.")
} else {
    println("Good evening.")
}

// Set balance and price of item

val balance = 500
val phone = 600

// Check if there is enough funds to purchase item

if (phone <= balance) {
    println("You have enough money to purchase the item!")
} else {
    println("You do not have enough money in your account to purchase this item.")
}


// Kotlin else if

// Set the current grade of the student

val grade = 87

// Check if grade is an A, B, C, D, or F
if (grade >= 87) {
    println("A")
} else if (grade >= 80) {
    println("B")
} else if (grade >= 70) {
    println("C")
} else if (grade >= 60) {
    println("D")
} else {
    println("F")
}
}