package grailsapp

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EstudianteServiceSpec extends Specification {

    EstudianteService estudianteService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Estudiante(...).save(flush: true, failOnError: true)
        //new Estudiante(...).save(flush: true, failOnError: true)
        //Estudiante estudiante = new Estudiante(...).save(flush: true, failOnError: true)
        //new Estudiante(...).save(flush: true, failOnError: true)
        //new Estudiante(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //estudiante.id
    }

    void "test get"() {
        setupData()

        expect:
        estudianteService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Estudiante> estudianteList = estudianteService.list(max: 2, offset: 2)

        then:
        estudianteList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        estudianteService.count() == 5
    }

    void "test delete"() {
        Long estudianteId = setupData()

        expect:
        estudianteService.count() == 5

        when:
        estudianteService.delete(estudianteId)
        sessionFactory.currentSession.flush()

        then:
        estudianteService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Estudiante estudiante = new Estudiante()
        estudianteService.save(estudiante)

        then:
        estudiante.id != null
    }
}
