
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

Algoritmo suma_de_numeros
	
	Definir num, suma, i, limite Como Entero
	
	Escribir "ingrese un limite"
	leer limite
	
	suma = 0
	num = 0
	
	Mientras suma < limite Hacer
		
		Escribir "ingrese un numero"
		leer num
		suma = suma + num
		Escribir suma
		
	FinMientras
	
	Escribir "la suma de los " , num , " numeros naturales es: " , suma
	
FinAlgoritmo
