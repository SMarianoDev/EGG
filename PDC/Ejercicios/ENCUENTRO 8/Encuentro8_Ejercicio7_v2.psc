Algoritmo sin_titulo
	
	Definir numAzar, numU Como Entero
	
	numAzar = Aleatorio(1,10)
	Escribir numAzar
	
	Escribir "ingrese un numero"
	
	hacer 
		
		leer numU
		
		Mientras numU > numAzar y numU <> 0
			Escribir "el numero es mas mas pequeño"
			numU = 0
		FinMientras
		
		Mientras numU < numAzar y numU <> 0
			Escribir "el numero es mas mas grande"
			numU = 0
		FinMientras
		
	Mientras Que numAzar <> numU
	
	Escribir "Felicitaciones!"
	
FinAlgoritmo
