#language: es
Característica: Prueba de registrar una experiencia laboral
  Como analista de calidad se desea validar el correcto
  funcionamiento de agregar una nueva experiencia.

  Antecedentes: Inicio sesión
    Dado que Elvis esta en el portal
    Cuando el ingresa la información para ingresar
      | usuario         | contrasena         |
      | usuarioLinkedin | contraseñaLinkedin |

  Escenario: El Analista de Calidad desea registrar un nuevo cargo
    Dado el Analista se encuentra en la pantalla de agregar experiencia y digita los datos
      | titulo                            | empresa           | tipoContrato | mesIngreso | añoIngreso | ubicacion          | descripcion                                     |
      | Automatizador Pruebas Funcionales | AUTO-Software S.A | Full-time    | January    | 2019       | CALLE 10 n90909-89 | Automatización de pruebas con SELENIUM y gradle |
    Entonces el deberia ver en el perfil Automatizador Pruebas Funcionales
