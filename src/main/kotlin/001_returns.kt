fun returns() {
    val result = (0..20).map { number ->
        if (number < 15) {
            return@map number + number
        } else {
            return
        }
    }
    result.forEach { println(it) }
}