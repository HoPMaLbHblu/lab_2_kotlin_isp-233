import kotlin.reflect.typeOf

fun main() {
//    print("Введите первое число: ")
//    val num = readln().toInt()
//    print("Введите второе число: ")
//    val num2 = readln().toInt()
//    if (num > num2) {
//        println("Первое число больше")
//    } else if (num == num2) {
//        println("Числы равны")
//    } else {
//        println("Второе число больше")
//    }
//    val max = if (num > num2) num else num2
//    println("Максимальное число: $max")
//    val age = readln().toInt()
//    val status = if (age >= 18) "Взрослый" else "Ребенок"
//    println(status)
//    val numbs = 1..100
//    val symbol = 'a'..'z'
//    val numbers = 199 downTo  100 step 5
//    for(i in numbers) {
//        println(i)
//
//    }
//    print("Введите порядковый номер месяца(1-12): ")
//    val index = readln().toInt()
//    var month = ""
//
//    if (index == 1) {
//        month = "Январь"
//    } else if (index == 2) {
//        month = "Февраль"
//    }else if (index == 3) {
//        month = "Март"
//    }else if (index == 4) {
//        month = "Апрель"
//    }else if (index == 5) {
//        month = "Май"
//    }else if (index == 6) {
//        month = "Июнь"
//    }else if (index == 7) {
//        month = "Июль"
//    }else if (index == 8) {
//        month = "Август"
//    }else if (index == 9) {
//        month = "Сентябрь"
//    }else if (index == 10) {
//        month = "Октябрь"
//    }else if (index == 11) {
//        month = "Ноябрь"
//    }else if (index == 12) {
//        month = "Декабрь"
//    }

//    val month = when (index) {
//        1 ->  "Январь"
//        2 -> "Февраль"
//        3 -> "Март"
//        4 -> "Апрель"
//        5 -> "Май"
//        6 -> "Июнь"
//        7 -> "Июль"
//        8 -> "Август"
//        9 -> "Сентябрь"
//        10 -> "Октябрь"
//        11 -> "Ноябрь"
//        12 -> "Декабрь"
//        else -> "некорекктный номер"
//    }
//    if (index in 1..12) {
//        println("Ваш индекс $index соответствует месяцу $month")
//
//    } else {
//        println("Индекс вне диапазона")
//    }
//    print("Введите урон: ")
//    val dmg = readln().toInt()
//    print("Щит активен? (введите да или нет): ")
//    val shield = readln()
//    val dmgTaken = if (shield == "да") dmg/2 else dmg
//    print("Полученный урон: $dmgTaken")
//    print("Введите ваш уровень: ")
//    val lvl = readln().toInt()
//    print("У вас есть vip? (true/false): ")
//    val vip = readln().toBoolean()
//    if (lvl >= 30 && vip == true) {
//        println("Доступ разрешен")
//    }
//    else if (lvl >= 50) {
//        println("Доступ разрешен")
//    }
//    else {
//        println("Доступ запрещён")
//    }
//    println("Начинаем ритуал защиты!")
//    val index = 0
//    repeat(5) { index ->
//        if (index == 2) {
//            println("Пропускаем шаг ${index + 1} из за магического вмешательства!")
//            return@repeat
//        }
//        println("Заклинание защиты активировано! (Шаг ${index + 1})")
//    }
//    println("Замок защищен!")
//
//    val months = listOf("Python", "Kotlin", "C#", "C++", "Java")
//    println(months[0])
//    println(months.size)
//    println("Kotlin" in months)
//    val daysInMonth = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
//    val input = readln().toInt()
//    if (input in 1..12) {
//        val days = daysInMonth[input-1]
//        println(" этом месяце $days дней.") }
//    else {
//            println("Некорректный номер месяца.")
//        }
//    val lowerCaseLetter: Char = 'a'
//    val upperCaseLetter: Char = 'Q'
//    val number: Char = '1'
//    val space: Char = ' '
//    val dollar: Char = '$'
//    val ch = '\u0040'
//    println(ch)
//    val cha = 'a'
//    println(ch.code)
//    val num = 97
//    println(num.toChar())
//    val cher:Char = readln().first()
//    val ch1 = 'b'
//    val ch2 = ch1 + 1
//    val ch3 = ch - 2
//    val ch1 = 1 + ch
//    val charsSum = 'a' + 'b'
//    var chars = 'A'
//    chars += 10
//    println(chars)
//    println(++chars)
//    println(++chars)
//    println(--chars)
//    println('a' < 'c')
//    println('x' >= 'z')
//    println('D' == 'D')
//    println('Q' != 'q')
//    println('A' < 'a')
//    val one = '1'
//    val isDigit = one.isDigit()
//    val isLetter = one.isLetter()
//    val capital = 'A'
//    val small = 'e'
//    val isLetterOrDigit = capital.isLetterOrDigit()
//    val isUpperCase = capital.isUpperCase()
//    val isLowerCase = capital.isLowerCase()
//    val capitalEString = small.uppercase()
//    val capitalE = small.uppercaseChar()

}