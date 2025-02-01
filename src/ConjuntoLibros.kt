

class ConjuntoLibros(val librosIniciales: Array<Libro?> = arrayOf(null, null, null)) {

    init {
        require(librosIniciales.size <= 3){throw IllegalArgumentException("No se puede añadir mas de 3 libros al conjunto")}
    }

    val libros = añadirLibrosIniciales()

    private fun añadirLibrosIniciales(): Array<Libro?> {
        val librosAñadidos = arrayOf<Libro?>(null, null,null)
        var i = 0
        for (libro in librosIniciales){
            librosAñadidos[i] = libro
            i++
        }
        return librosAñadidos
    }

    fun añadirLibro(libro: Libro?): Boolean{
        if (libro in libros){
            println("El libro ya esta introducido")
        } else {
            var i = 0
            for (libroGuardado in libros){
                if (libroGuardado == null){
                   libros[i] = libro
                    return true
                } else if (i == libros.size - 1){
                    println("El conjunto esta lleno, pruebe en otro conjunto")
                    return false
                }
                i++
            }
        }
        return false
    }

    fun eliminarLibro(libroOAutor: String){
        var  i = 0
        for (libro in libros){
            if (libro?.autor == libroOAutor.replaceFirstChar { it.uppercase() } || libro?.titulo == libroOAutor.replaceFirstChar { it.uppercase() }){
                libros[i] = null
            }
        }
    }

    fun mostrarMejorPeor(){
        var i = 0
        var mejorLibro = 0
        var peorLibro = 0
        var mejorCalificacion = 0
        var peorCalificacion = 10
        for (libro in libros) {
            if (libro?.calificacion ?: 0 > mejorCalificacion) {
                mejorCalificacion = libro?.calificacion ?: 0
                mejorLibro = i
            }
            if (libro?.calificacion?: 10 < peorCalificacion){
                peorCalificacion = libro?.calificacion?:10
                peorLibro = i
            }
            i++
        }
        println("Mejor libro: \n ${libros[mejorLibro]} \n Peor libro: \n ${libros[peorLibro]}")
    }

    fun mostrarContenido(titulo: String): Boolean{
        for (libro in libros){
            if (libro?.titulo == titulo.replaceFirstChar { it.uppercase() }){
                println(libro)
                return true
            }
        }
        println("Libro no encontrado en el conjunto")
        return false
    }

}
