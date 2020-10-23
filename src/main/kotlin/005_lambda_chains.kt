import HorseCategory.*

enum class HorseCategory { Arab, Asian }
data class Horse(
    val category: HorseCategory,
    var size: Int = 0
)

fun chained() {
    val horses = listOf(
        Horse(category = Arab, size = 200),
        Horse(category = Asian, size = 180),
        Horse(category = Arab, size = 200),
        Horse(category = Asian, size = 180),
        Horse(category = Asian, size = -50),
    )

    horses
        .filter { it.size > 0 }
        .groupBy { it.category }
        .map {
            val category = it.key
            val sumOfHorseSize = it.value.sumBy { horse -> horse.size }
            print("Category: $category sum of size: $sumOfHorseSize")
        }
}