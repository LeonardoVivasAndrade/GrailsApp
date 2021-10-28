package grailsapp

import grails.gorm.services.Service

@Service(Notas)
interface NotasService {

    Notas get(Serializable id)

    List<Notas> list(Map args)

    Long count()

    void delete(Serializable id)

    Notas save(Notas notas)

}