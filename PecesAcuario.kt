abstract class Pez {
    abstract val color: String
}

interface AccionPez {
    fun comer()
}

class Tiburon : Pez(), AccionPez {
    override val color = "gris"
    override fun comer() {
        println("cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"
    override fun comer() {
        println("comer algas")
    }
}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()
    
    println("Color del tiburón: ${tiburon.color}")
    tiburon.comer()
    
    println("Color del pez payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    crearPeces()
}
