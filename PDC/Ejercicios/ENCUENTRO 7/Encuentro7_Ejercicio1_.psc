
// Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
//se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo notas
	
	Definir nota Como Entero
	Escribir "ingrese la nota entre 0 y 10"
	leer nota
	Mientras nota > 10 o nota < 0 Hacer
		Escribir "el numero ingresado es incorrecto"
		leer nota
	FinMientras
	
	Escribir "Tu nota es de: " , nota
	
FinAlgoritmo
