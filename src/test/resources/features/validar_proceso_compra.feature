#language: es

Característica: Yo como usuario quiero agregar 2 productos al carrito y validar el proceso de compra

  Esquema del escenario: Validar compra de 2 productos en carrito
    Dado que el usuario ingresa al portal
    Cuando agrega <cantidad> producto al carrito
    Entonces visualiza el carrito con los productos
    Y termina el proceso de compra
      | nombre   | pais   | ciudad   | tarjeta   | mes   | anno   |
      | <nombre> | <pais> | <ciudad> | <tarjeta> | <mes> | <anno> |
    Ejemplos:
      | cantidad | nombre | pais     | ciudad | tarjeta   | mes | anno |
      | 2        | Juan   | Colombia | Bogota | 1212-4242 | 12  | 30   |
