fun conditions() {
    val list = 0..20

    list.forEach { i ->
        if (i >= 5 && i <= 10) {
            println("in between: $i")
        } else {
            println(i)
        }
    }


    val result = list.map {
        when (it) {
            in 5..10 -> 1
            else -> 2
        }
    }
}
