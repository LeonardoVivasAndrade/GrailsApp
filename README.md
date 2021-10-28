# GrailsApp


## Table of Contents
1. [General](#general)
2. [Demo](#demo)
3. [Tecnologías](#tecnologías)
4. [Instalación](#instalación)
5. [Colaboración](#colaboración)

### General
* Ejemplo de app web sencilla usando el Framework Grails, este framework se basa en Lenguaje Java y en Groovy para crear app web o [plugins](https://plugins.grails.org/) de forma sencilla y rapida, gracias a la integración con muchas otras tecnologías y la generacion de código, Grails genera el código de la capas vistas, controlador y servicios, agilizando la inicializacion de estas capas en el proyecto, a su vez genera una conexión con la capa de datos mucho más rapida y ágil de usar.

### Demo
* Revise el demo en https://grailsapp.tk/

El demo es una app web sencilla alojada en una instancia EC2 de [Amazon Web Service](https://aws.amazon.com/) generada por Grails con conexión a una base de datos mysql en [Amazon RDS](https://aws.amazon.com/es/rds/) puede probar inicio de sesión, el usuario de login es usuario: usuario@usuario.com - contraseña: 1, a su vez puede crear, editar, consultar y eliminar usuarios, estudiantes y notas y asignarlas a un estudiante creado.

### Capturas

![image](https://user-images.githubusercontent.com/46111379/139271020-d6e9f2d4-6da1-4a44-933b-98853dd28401.png)

![image](https://user-images.githubusercontent.com/46111379/139337744-b0d73b2b-a6d9-4d40-81bc-5cdb2e10c051.png)

![image](https://user-images.githubusercontent.com/46111379/139337783-98c3610f-44d2-449a-a8fa-2184776217dd.png)

![image](https://user-images.githubusercontent.com/46111379/139337804-23ad6253-61c5-4544-80f0-2864a93cf25d.png)

## Tecnologías
***
Lista de tecnologias utilizadas en la realiación del proyecto:
* [Java](https://www.oracle.com/java/technologies/downloads/): Version 11
* [Grails Framework](https://grails.org/): Version 5.0
* [Groovy](https://groovy.apache.org/): Version 3.0.9
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/): Version 2019
* [Gradle](https://gradle.org/): Version 7.2

## Instalación

*** 
Pasos para instalar Grails
* Descargar grails 5.0 en [Descargar Grails 5.0](https://github.com/grails/grails-core/releases/download/v5.0.0/grails-5.0.0.zip)  ó https://grails.org/
* Descomprimir
* Agregar la carpeta descompimida a las variables de entorno ($GRAILS_HOME)

*** 
Pasos para instalar Groovy (Sólo en entorno desarrollo)
* Descargar Groovy en [Groovy Apache](https://groovy.apache.org/download.html) ó https://groovy.apache.org/
* Instalar Grrovy [Cómo hacerlo](https://groovy-lang.org/install.html)
* Agregar Groovy a las variables de entorno (GROOVY_HOME)

*** 
Pasos para instalar Java
* Descargar Java en [Java Oracle](https://www.oracle.com/java/technologies/downloads/)
* Instalar Java 
* Agregar Java a las variables de entorno (JAVA_HOME)

***
Pasos para descargar e iniciar la app
```
$ git clone https://github.com/LeonardoVivasAndrade/GrailsApp.git
$ cd ../path/to/the/file
$ grails clean
$ grails compile
$ grails run-app o grails run-app --port=[puerto]
```

***
Para conocer toda la documentación de Grails ir a https://docs.grails.org/5.0.0/guide/single.html

***
Pasos para configurar base de datos Mysql
* Previamente tener una base de datos nombrada [grailsdb] en mysql (no es necesario crear tablas, grails las crea en una primera instancia)
* Abrir el archivo ..\GrailsApp\grails-app\conf\application.yml
* Modificar username, password y url respectivamente

![image](https://user-images.githubusercontent.com/46111379/139277700-333fb1ba-8df6-4f46-9286-9e29c2ed65d5.png)

## Colaboración
***
Equipo de trabajo
* [Jose Eduardo Rozo](https://github.com/joseedye)
* [Enmanuel Martínez](https://github.com/enmanuelM9999)
* [Angel Vivas](https://github.com/LeonardoVivasAndrade)
