Algoritmo sin_titulo
	
	Definir letraU, letraR, vocales Como Caracter
	Definir posiAleat Como Entero
	
	posiAleat = Aleatorio(0,4)
	vocales = "aeiou"
	letraR = Mayusculas(Subcadena(vocales,posiAleat,posiAleat))
	Escribir letraR
	
	Escribir "ingrese una vocal para ver si la acierta"
	leer letraU
	letraU = Mayusculas(letraU)
	
	mientras letraU <> "A" y letraU <> "E" y letraU <> "I" y letraU <> "O" y letraU <> "U"
		
		Escribir "Esto no es una vocal"
		Escribir "ingrese una vocal para ver si la acierta"
		leer letraU
		letraU = Mayusculas(letraU)
		
	FinMientras
	
	mientras letrau <> letraR Hacer
		Escribir "Incorrecto, elija otra vocal"
		leer letraU 
		letraU = Mayusculas(letraU)
		mientras letraU <> "A" y letraU <> "E" y letraU <> "I" y letraU <> "O" y letraU <> "U"
			Escribir "Esto no es una vocal"
			Escribir "ingrese una vocal para ver si la acierta"
			leer letraU
			letraU = Mayusculas(letraU)
		FinMientras
	FinMientras
	
	Escribir "ADIVINASTE!"
	
	
	
	
FinAlgoritmo
