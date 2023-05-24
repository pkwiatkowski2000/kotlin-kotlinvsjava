package _4_Tablice

fun main() {
    // int[] tablicaInt = new int[3]; // Java
    var tablicaInt: IntArray = IntArray(3)
    tablicaInt[0] = 5
    tablicaInt[1] = 15
    tablicaInt[2] = -2
    // ShortArray
    // CharArray
    // DoubleArray

    println(tablicaInt[1])
    println(tablicaInt[2])

    // int[] tablicaIntKrocej = {5, 15, -2} // Java
    var tablicaIntKrocej: IntArray = intArrayOf(5, 15, -2)

    println(tablicaInt.size)

    tablicaInt.set(2, 1000)
    tablicaInt.get(2)

    var tablicaObiektow: Array<String> = arrayOf("Jeden", "Dwa", "Trzy")
    println(tablicaObiektow[0])
    println(tablicaObiektow[1])
    println(tablicaObiektow[2])
}