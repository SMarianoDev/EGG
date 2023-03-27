//Construir un programa que simule un menú de opciones para realizar las cuatro
//	operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//	numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//	o ?m? para la multiplicación y ?D? o ?d? para la división.

Algoritmo sin_titulo
	
	Definir num1, num2 Como Entero
	Definir operacion Como Caracter
	
	Escribir "ingrese el primer numero"
	leer num1
	Escribir "ingrese el segundo numero"
	leer num2
	
	Escribir "ingrese que operacion desea hacer"
	Escribir " S - Suma"
	Escribir " R - Resta"
	Escribir " D - Division"
	Escribir " M - Multiplicacion"
	leer operacion
	
	
	Segun operacion Hacer
		"s","S": 
			Escribir num1+num2
		"r","R":
			Escribir abs(num1-num2)
		"d","D":
			Escribir abs(num1/num2)
		"m","M":
			Escribir num1*num2
	FinSegun
	
FinAlgoritmo
