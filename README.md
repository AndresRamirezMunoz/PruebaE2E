# Prueba E2E con Serenity, Screenplay y Cucumber

Este proyecto realiza pruebas automatizadas de extremo a extremo (E2E) para validar el proceso de compra en el sitio web Demoblaze, utilizando Serenity BDD, Screenplay y Cucumber.

## Tecnologías
- Java
- Gradle
- Serenity BDD
- Cucumber
- Screenplay Pattern
- WebDriver (Chrome)

## Requisitos
- JDK 11 o superior
- Gradle

## Ejecución
1. Clona el repositorio.
2. Ejecuta `./gradlew test` para correr las pruebas.

## Configuración
- Navegador: Google Chrome (configurable en `serenity.conf`)
- URL base: https://www.demoblaze.com/

## Adicional
- Se carga la carpeta Target para almacenar los reportes generados por Serenity.
