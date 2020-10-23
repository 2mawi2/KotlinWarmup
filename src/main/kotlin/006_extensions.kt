import HorseCategory.Arab

fun Int.square() {
    this * this
}

val Int.canBeSquared: Boolean
    get() = this != 0

fun squareTest() {
    val number = 1
    if (number.canBeSquared) {
        number.square()
    }
}

// extension function with receiver

fun Horse.useCheats(applyCheats: Horse.() -> Unit): Horse {

    applyCheats()
    return this
}

fun test() {
    val horse = Horse(Arab, 1).useCheats {
        size = 500000
    }.apply {
        size = 50
    }

    print(horse)
}
