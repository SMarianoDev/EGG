//Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
//	mayor número ingresado.

Algoritmo sin_titulo
	
	Definir num, i Como Entero
	Definir numMax, numMin Como Entero
	
	numMax = 0
	numMin = 999999
	
	
	para i <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir "ingrese un numero"
		leer num
		
		si num > numMax Entonces
			numMax = num
		FinSi
		
		si num < numMin Entonces
			numMin = num
		FinSi
		
	FinPara
	Escribir "El numero maximo es: ", numMax
	Escribir "El numero minimo es: ", numMin
FinAlgoritmo
