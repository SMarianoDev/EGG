Algoritmo sin_titulo
	
	definir i, num, suma Como Entero
	
	Escribir "ingrese la cantidad de numeros naturales a sumar"
	leer num
	
	suma = 0
	
	para i <- 1 Hasta num
		
		suma = suma + i 
		
	FinPara
	i = i-1
	Escribir "la suma de ", i " numeros naturales es de: " , suma
FinAlgoritmo
