package grailsapp

import grails.gorm.services.Service

@Service(Estudiante)
interface EstudianteService {

    Estudiante get(Serializable id)

    List<Estudiante> list(Map args)

    Long count()

    void delete(Serializable id)

    Estudiante save(Estudiante estudiante)

}