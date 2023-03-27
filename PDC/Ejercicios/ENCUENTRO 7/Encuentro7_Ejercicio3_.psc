Algoritmo contador_promedios
	
	Definir num, suma, i Como real
	Definir limite Como Caracter
	Escribir "ingrese numero"
	leer num
	
	suma = 0
	i = 0 
	
	
	Mientras (num <> -1) Hacer
		suma = (suma + num)
		i = i + 1 
		Escribir suma
		Leer num
		
	FinMientras
	
	Escribir "tu promedio es: " , (suma/(i)) 
	
FinAlgoritmo
