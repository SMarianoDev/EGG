Algoritmo sin_titulo
	
	Definir num1, num2 Como Entero
	Escribir "ingresar numero 1"
	leer num1
	Escribir "ingrese numero 2" 
	leer num2
	
	intercambio(num1,num2)
	
FinAlgoritmo

SubProceso intercambio(num1, num2)
	Definir aux Como Entero
	Escribir "primer numero: " , num1 " y el segundo numero es: " , num2
	aux = 0
	aux = num1
	num1 = num2
	num2 = aux
	
	Escribir "el intercambio es de: ", num1 " y " , num2
	
FinSubProceso
	