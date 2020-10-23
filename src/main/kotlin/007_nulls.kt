import HorseCategory.Arab

class TestClaas {
    lateinit var thisIsNull: String


    fun initThisIsNull() {
        if (::thisIsNull.isInitialized)
            thisIsNull = "ftrwet"
    }
}

fun nullSafety() {

    val thisCouldBeNull: String? = "some"

    thisCouldBeNull?.let {
        if (it != null) { // not needed since compiler smart casts: String? -> String
            print(it)
        }
    }

    val length2 = thisCouldBeNull!!.length ?: -1
}
