/*
* El programa solicita al usuario que ingrese un número entero.
*  Luego, determina si el número ingresado es un número primo o no,
*  e imprime el resultado correspondiente
 */

fun main() {
    println("Ingresa un número entero:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val esPrimo = esPrimo(numero)

        if (esPrimo) {
            println("$numero es un número primo.")
        } else {
            println("$numero no es un número primo.")
        }
    } else {
        println("Por favor, ingresa un número entero VÁLIDO.")
    }
}

fun esPrimo(num: Int): Boolean {
    if (num <= 1) {
        return false
    }

    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}
