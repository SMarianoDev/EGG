//Realizar una función que calcule y retorne la suma de todos los divisores del número n distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo sin_titulo
	
	definir num, cantidad Como Entero
	cantidad = 0
	Repetir		
		
		Escribir "ingrese numero"
		leer num
		
		Escribir divisores(num)
		
	Mientras Que num <> 0
FinAlgoritmo

Funcion pepito <- divisores(num Por Valor)
	Definir pepito, i Como Entero
	pepito = 0
	para i <- 1 Hasta num
		si num mod i = 0  y i <> num
			pepito = pepito + i
		FinSi
	FinPara
FinFuncion
	