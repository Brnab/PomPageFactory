# PomPageFactory

**PLAN DE PRUEBAS.**

**Descripción del proceso.**

Se desea implementar la pagina web del banco ParaBank, entre sus serivicios están:
- Opción para ingresar a la cuenta.
- Opción para registrarse en la cuenta.
- Opción para contactarse con el banco, entre otros.


**Alcance de pruebas**

Las pruebas incluyen la verificación de las siguientes historias de usuario:

**HU001 – Inicio de sesion**

Criterios de aceptación:

- Verificar que el sistema permita al usuario loguearse en su cuenta ya previamente creada.
- Verificar que el sistema muestre un error cuando el usuario no ingresa contraseña o correo.
- 


**HU002 – Registro en la pagina de un cliente.**

Criterios de aceptación:

- Verificar que el sistema crea la cuenta cuando el usuario ingresa todos los campos obligatorios correctamente
- Verificar que cuando el usuario no escriba las dos contraseñas iguales, el sistema indique que no coinciden estas

**HU003 – Login de Usuario**

Criterios de aceptación:

- Verificar que cuando el usario se trate de contactar con el banco y que este llene la información necesaria, el mensaje sea enviado.
- Verificar que cuando el usaurio no escriba nada en el campo de mensaje, el sistema le indique que debe ingresar el mensaje correcto

**Fuera de alcance.**

- Verificacion de la longitud de la contraseña
- Verificacion del numero maximo de palabras que se pueden enviar en la parte de mensaje
- Verificacion de cuando no se ingresa ciudad o alguno de los otros campos que no entran en el criterio de aceptacion de la historia de usuario 2.
- Cualquier otro caso que no aparezca dentro de este documento

**Estrategia de pruebas.**

La realización de las pruebas se realizará de manera automatizada, usando selenium y cucumber.
La automatizacion será realizada en lenguaje de programación java y se usará POM con page factory como patrón de automatización.

**Cronograma de entregas.**

Se realizará la entrega de los resultados de las pruebas a mas tardar el dia lunes 21 de marzo de abril del presente año.


**Acuerdos.**

No se tendrán en cuenta cualquier otra puerta que esté por fuera de los criterios de aceptación.
