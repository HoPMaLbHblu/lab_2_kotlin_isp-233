fun main() {
    print("Введите первое число: ")
    val num = readln().toInt()
    print("Введите второе число: ")
    val num2 = readln().toInt()
    if (num > num2) {
        println("Первое число больше")
    } else if (num == num2) {
        println("Числы равны")
    } else {
        println("Второе число больше")
    }
    val max = if (num > num2) num else num2
    println("Максимальное число: $max")
    val age = readln().toInt()
    val status = if (age >= 18) "Взрослый" else "Ребенок"
    println(status)

}