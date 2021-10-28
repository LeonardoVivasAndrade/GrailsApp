<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'estudiante.label', default: 'Estudiante')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <div class="btn-group" role="group" aria-label="Basic example">
        <a href="/notas"><button type="button" class="btn btn-secondary">Notas</button></a>
        <a href="/estudiante"><button type="button" class="btn btn-secondary">Estudiantes</button></a>
        <a href="/usuario"><button type="button" class="btn btn-secondary">Usuarios</button></a>
    </div>
        <a href="#list-estudiante" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-estudiante" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${estudianteList}" />

            <div class="pagination">
                <g:paginate total="${estudianteCount ?: 0}" />
            </div>
        </div>
    </body>
</html>