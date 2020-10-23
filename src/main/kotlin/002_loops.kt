fun loops() {


    mutableListOf(1,2)
        .iterator()



    for (i in 1 downTo 4 step 2) {
        println(i)
    }
    (1..3)
        .forEach { i -> println(i) }

    var i = 0
    while (i++ < 3) {
        println(i)
    }
}
