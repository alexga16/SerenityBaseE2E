# language: es

Característica: : Login en pagina git hub

  Yo como usuario
  quiero realizar login en la pagina  gitlab
  para validar el ingreso correcto o errado al sistema

  @github
  Escenario:login fallido en github
    Dado que el "usuario" esta en la pagina de github
    Cuando  el usuario se loguea con credenciales erradas
    Entonces se valida un mensaje informando el error