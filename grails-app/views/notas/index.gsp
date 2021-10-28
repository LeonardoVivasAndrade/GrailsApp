<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'notas.label', default: 'Notas')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <div class="btn-group" role="group" aria-label="Basic example">
        <a href="/notas"><button type="button" class="btn btn-secondary">Notas</button></a>
        <a href="/estudiante"><button type="button" class="btn btn-secondary">Estudiantes</button></a>
        <a href="/usuario"><button type="button" class="btn btn-secondary">Usuarios</button></a>
    </div>
        <a href="#list-notas" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-notas" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${notasList}" />

            <div class="pagination">
                <g:paginate total="${notasCount ?: 0}" />
            </div>
        </div>
    </body>
</html>