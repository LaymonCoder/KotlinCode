fun main() {
    var marks = 52
    when(marks){
        in 90..100 -> println("A+")
        in 80..90  -> println("A")
        in 70..80 -> println("B")
        in 60..70 -> println("C")
        else -> println("D")
    }
}
