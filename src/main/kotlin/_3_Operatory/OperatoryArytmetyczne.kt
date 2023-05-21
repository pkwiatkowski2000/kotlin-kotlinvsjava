package _3_Operatory

fun main() {
    var a = 10
    var b = 3
    var wynik: Int

    wynik = a + b
    wynik = a.plus(b)
    wynik = a - b
    wynik = a.minus(b)
    wynik = a * b
    wynik = a.times(b)
    wynik = a / b
    wynik = a.div(b)
    wynik = a % b
    wynik = a.mod(b)

    a = a + 5
    a += 5

    a = a + 1
    a += 1
    a++

    b = b - 1
    b -= 1
    b--

    a = a * 3
    a *= 3

    b = b / 3
    b /= 3

    a = a % 10
    a %= 10
}