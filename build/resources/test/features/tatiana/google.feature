
Feature: Busquedas desde pagina principal google

  Yo como usuario
  quiero encontrar resultados en la pagina de google
  para validar que los resultados coinciden con mi busqueda

  @google
  Scenario:  Busqueda en google por palabra
    Given que el "usuario" esta en la pagina de google
    When  el usuario busca por la palabra "musica"
    Then se valida que el primer titulo y la descripcion tenga la palabra musica
