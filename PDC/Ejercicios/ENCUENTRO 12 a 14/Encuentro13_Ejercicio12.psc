Algoritmo sin_titulo
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	leer num
	
	Escribir fibo(num)
	
FinAlgoritmo
Funcion sumas <- fibo (num Por Valor)
	Definir sumas, i, a, b, c Como Entero
	a = 0
	b = 1
	
	para i <- 1 Hasta num
		Escribir a
		c = a +b
		a = b
		b = c
	FinPara

FinFuncion
	