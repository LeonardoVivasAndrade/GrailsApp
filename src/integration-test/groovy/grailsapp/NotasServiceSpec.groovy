package grailsapp

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NotasServiceSpec extends Specification {

    NotasService notasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Notas(...).save(flush: true, failOnError: true)
        //new Notas(...).save(flush: true, failOnError: true)
        //Notas notas = new Notas(...).save(flush: true, failOnError: true)
        //new Notas(...).save(flush: true, failOnError: true)
        //new Notas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //notas.id
    }

    void "test get"() {
        setupData()

        expect:
        notasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Notas> notasList = notasService.list(max: 2, offset: 2)

        then:
        notasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        notasService.count() == 5
    }

    void "test delete"() {
        Long notasId = setupData()

        expect:
        notasService.count() == 5

        when:
        notasService.delete(notasId)
        sessionFactory.currentSession.flush()

        then:
        notasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Notas notas = new Notas()
        notasService.save(notas)

        then:
        notas.id != null
    }
}
