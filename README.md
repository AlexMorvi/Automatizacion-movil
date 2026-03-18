# Automatizacion Mobile - QA Lab

Proyecto de automatizacion funcional mobile sobre My Demo App (Sauce Labs) usando Appium + Serenity BDD + Cucumber + JUnit 4.

## Stack

- Java 17
- Appium
- Serenity BDD 4.0.19
- Cucumber
- JUnit 4.13.1
- Maven

## Que automatiza

Flujo de validacion de carrito en la app mobile:

1. Ingreso a la app y validacion de pantalla principal.
2. Validacion de carga de productos en galeria.
3. Seleccion de producto y ajuste de cantidad.
4. Agregado al carrito.
5. Validacion de cantidad y nombre de producto en carrito.

El escenario usa `Scenario Outline` con 3 ejemplos:

- Sauce Labs Backpack (1 unidad)
- Sauce Labs Bolt - T-Shirt (1 unidad)
- Sauce Labs Bike Light (2 unidades)

## Estructura

```text
src/test/java/com/nttdata/
├── runners/            Suite Cucumber con Serenity
├── screens/            Mapeo de elementos de pantallas
├── steps/              Acciones y validaciones
└── stepsdefinitions/   Bindings Gherkin -> Java

src/test/resources/
├── app/                APK de My Demo App
└── features/           Escenarios .feature
```

## Requisitos previos

- Appium Server levantado en `http://localhost:4723/`
- Emulador Android disponible
- APK configurada en `serenity.properties`

## Ejecucion

```
Runner del IDE con las variables de entorno si no las tuviere.
```

Opcional:

```bash
mvn clean verify
```

## Reportes

Al finalizar la ejecucion, Serenity genera el reporte en:

- `target/site/serenity/index.html`