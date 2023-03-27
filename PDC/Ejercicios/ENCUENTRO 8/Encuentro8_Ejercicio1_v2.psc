Algoritmo sin_titulo
	
	Definir claveU, claveR Como Caracter
	Definir  i, ingreso Como entero
	
	i = 0
	claveR = "eureka"
	
	Hacer
			
			Escribir "ingrese la clave"
			leer claveU
			
			Mientras claveU <> claveR y i < 2
				Escribir "Clave erronea, Ingrese nuevamente la clave"
				Leer claveU
				i = i + 1
			FinMientras
			
			Mientras claveU <> claveR y i = 2
				escribir "Se agotaron los 3 intentos"
				i = i + 1
			FinMientras
			
			Mientras claveU = claveR y i <= 2
				Escribir "Se ingreso al sistema correctamente"
				claveU = ""
			FinMientras
			
		
	Mientras Que claveU <> claveR y claveU = claveR
	
	
FinAlgoritmo
