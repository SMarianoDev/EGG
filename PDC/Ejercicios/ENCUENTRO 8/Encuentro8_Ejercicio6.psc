Algoritmo sin_titulo
	
	Definir numMax, i, suma, suma2 Como Entero
	
	i = 0
	suma = 0
	suma2 = 0
	
	Escribir "ingrese un numero"
	leer numMax
	
	Hacer
		
		suma = (suma + 2)
		suma2 = suma2 + suma
		i = i + 1
		
	Mientras Que i < numMax
	Escribir "la suma de " , numMax , " pares son: " , suma2
	
FinAlgoritmo
