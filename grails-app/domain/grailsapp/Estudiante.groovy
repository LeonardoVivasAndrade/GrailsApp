package grailsapp

class Estudiante {

    int id
    String correo
    String nombres
    String apellidos
    String genero
    Date fecha_nacimiento

    static constraints = {
        id(unique:true, nullable:false, blank:false)
        correo(unique:true, nullable:false, blank:false,email:true)
        nombres(nullable:false, blank:false)
        apellidos(nullable:false, blank:false)
        genero inList: ['F', 'M']
        fecha_nacimiento(nullable:false, blank:false)
    }

    static mapping ={
        table 'estudiante'
        id column: 'id'
        correo column: 'email'
        nombres column:'nombres'
        apellidos column:  'apellidos'
        genero column: 'genero'
        fecha_nacimiento column: 'fecha_nacimiento'
    }

    String toString() {
        "${nombres + " " + apellidos}"
    }
}
