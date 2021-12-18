enum class Alignment {
    LEFT,
    RIGHT,
    CENTER,
    JUSTIFY
}

fun alignText(
    text: String,
    lineWidth: Int = 100,
    alignment: Alignment = Alignment.LEFT
): String {
    var words = text.split(" ")
    when (alignment) {
        Alignment.LEFT -> {

        }
        Alignment.RIGHT -> {

        }
        Alignment.CENTER -> {

        }
        Alignment.JUSTIFY -> {

        }
    }
    return ""
}
