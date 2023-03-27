Algoritmo inflacion
	
	Definir precioInicial, precioFinal, aumento, total Como Real
	
	Escribir "ingresar precio inicial"
	leer precioInicial
	Escribir "ingresar precio final"
	leer precioFinal

	total = (precioFinal-precioInicial)/precioInicial
	aumento = total*100
	
	Escribir "El aumento fue de un " , aumento "%"
	
FinAlgoritmo
