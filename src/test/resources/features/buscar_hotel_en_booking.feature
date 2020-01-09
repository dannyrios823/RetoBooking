#language: es

Característica: Buscar un hotel en Booking.com
  Como usuario de la plataforma para reservas de alojamiento Booking
  Quiero buscar un hotel
  Para hospedarme en mis vacaciones.

  Escenario: Busqueda del primer hotel que aparezca
    Dado que el actor abrio el navegador en la pagina de booking
    Cuando ingresa los datos iniciales para hospedarse en Miami Beach
    Y selecciona la opcion de Filtros Populares
    Entonces deberia ver la informacion del primer hotel que aparece

