Algoritmo sin_titulo
	Definir tempmax, tempmin, cantdias, i Como Entero
	
	Escribir "ingrese la cantidad de dias"
	leer cantdias
	
	para i <- 1 Hasta cantdias
		Escribir "ingrese la temperatura maxima del dia ", i
		leer tempmax
		Escribir "ingrese la temperatura minima del dia ", i
		leer tempmin
		
		contador(tempmax,tempmin)
		
	FinPara
	
	
FinAlgoritmo

SubProceso contador (tempmax, tempmin)
	Definir tempmedia Como real
	
	tempmedia = (tempmax+tempmin)/2
	Escribir "la temperatura media es de: " tempmedia
	
FinSubProceso
	