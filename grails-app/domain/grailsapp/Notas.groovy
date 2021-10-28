package grailsapp

class Notas {

    Estudiante estudiante
    int id
    float notaP1
    float notaP2
    float notaP3
    float notaFinal
    float notaExamen

    static constraints = {
        id(unique:true, nullable:false, blank:false)
        notaP1(unique:false, nullable:false, blank:false, number:true, min:0.0f, max:5.0f, scale: 2)
        notaP2(unique:false, nullable:false, blank:false, number:true, min:0.0f, max:5.0f)
        notaP3(unique:false, nullable:false, blank:false, number:true, min:0.0f, max:5.0f)
        notaExamen(unique:false, nullable:false, blank:false, number:true, min:0.0f, max:5.0f)
        notaFinal(unique:false, editable:false, nullable:false, blank:false, number:true)
    }

    static mapping ={
        table 'notas'
        notaP1 column:'notap1'
        notaP2 column:'notap2'
        notaP3 column:'notap3'
        notaFinal column:'notafinal'
        notaExamen column:'notaExamen'
        estudiante column: 'id_estudiante'
    }
}
