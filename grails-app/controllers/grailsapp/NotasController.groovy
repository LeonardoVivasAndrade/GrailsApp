package grailsapp

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class NotasController {

    NotasService notasService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond notasService.list(params), model:[notasCount: notasService.count()]
    }

    def show(Long id) {
        respond notasService.get(id)
    }

    def create() {
        respond new Notas(params)
    }

    def save(Notas notas) {
        if (notas == null) {
            notFound()
            return
        }

        try {
            notasService.save(notas)
        } catch (ValidationException e) {
            respond notas.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'notas.label', default: 'Notas'), notas.id])
                redirect notas
            }
            '*' { respond notas, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond notasService.get(id)
    }

    def update(Notas notas) {
        if (notas == null) {
            notFound()
            return
        }

        try {
            notasService.save(notas)
        } catch (ValidationException e) {
            respond notas.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'notas.label', default: 'Notas'), notas.id])
                redirect notas
            }
            '*'{ respond notas, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        notasService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'notas.label', default: 'Notas'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'notas.label', default: 'Notas'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
