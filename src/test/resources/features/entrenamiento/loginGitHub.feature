  # language: es

  Característica: Login en pagina github

  Yo como usuario
  quiero realizar login en la pagina github
  para validar el ingreso correcto o errado al sistema

  @github
  Escenario: Login fallido en github
    Dado que el "usuario" esta en la pagina de github
    Cuando  el usuario se loguea con credenciales erradas
    Entonces se validara que se presente un mensaje informando el error
