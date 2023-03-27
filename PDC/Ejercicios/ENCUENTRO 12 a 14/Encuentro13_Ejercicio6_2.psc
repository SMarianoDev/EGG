Algoritmo sin_titulo
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	leer num
	
	Escribir total(num)
	
FinAlgoritmo

Funcion divisores <- total(num Por referencia)
	Definir divisores,i Como Entero
	divisores = 0
	para i <- 1 Hasta num
		si num mod i = 0 y i <> num
			divisores = divisores + i
		FinSi
	FinPara
	
FinFuncion
	