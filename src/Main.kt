

fun main(){
    val libro1 = Libro("A", "Adrian", 10, 7)
    val libro2 = Libro("b", "paula", 145, 5)
    val conjuntoLibros1 = ConjuntoLibros()
    conjuntoLibros1.añadirLibro(libro1)
    conjuntoLibros1.añadirLibro(libro2)
    conjuntoLibros1.mostrarMejorPeor()
    conjuntoLibros1.eliminarLibro("a")
    conjuntoLibros1.eliminarLibro("Paula")
    conjuntoLibros1.añadirLibro(Libro("c", "juan", 84, 6))
    conjuntoLibros1.mostrarContenido("c")
}