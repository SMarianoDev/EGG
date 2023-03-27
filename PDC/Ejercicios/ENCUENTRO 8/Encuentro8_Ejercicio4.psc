Algoritmo sin_titulo
	
	Definir num, suma Como Entero
	Definir letra Como Caracter
	
	letra = ""
	suma = 0
	
	
	Hacer
		
		Hacer
		Escribir "ingrese un numero"
		leer num
		
		
			Escribir "desea ingresar otro numero?"
			leer letra
			letra = Mayusculas(letra)
			
			suma = suma + num
		Mientras Que letra = "S"
		
		Escribir "La suma es de: " , suma
		
	Mientras Que letra <> "N"
	
	
FinAlgoritmo
