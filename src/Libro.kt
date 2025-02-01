

class Libro(titulo: String, autor: String, numPag: Int, calificacion: Int = 0) {
    init {
        require(calificacion in 0..10) {throw IllegalArgumentException("La puntuacion solo pueder ser de 0 a 10")}
    }

}