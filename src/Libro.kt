

class Libro(titulo: String, autor: String, numPag: Int, calificacion: Int = 0) {
    init {
        require(calificacion in 0..10) {throw IllegalArgumentException("La puntuacion solo pueder ser de 0 a 10")}
    }

    val titulo = titulo.replaceFirstChar { it.uppercaseChar() }

    val  autor = autor.replaceFirstChar { it.uppercase() }

    val numPag = numPag

    val calificacion = calificacion

    override fun toString(): String {
        return "Titulo: $titulo \n Autor: $autor \n Nº de paginas: $numPag \n Calificacion: $calificacion"
    }

}