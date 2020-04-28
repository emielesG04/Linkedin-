Feature: yo como usuario del servicio
  Necesito registrar la cuenta en  linkedin
  Para estar registrado en el sistema

  Scenario: ingresar al sistema por primera vez
    Given que Elvis esta en el portal
    When el ingresa la información para ingresar
      | usuario         | contrasena         |
      | usuarioLinkedin | contrasenaLinkedin |
    Then el usuario debe ver el nombre Welcome, pruebas!

