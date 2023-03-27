Algoritmo sin_titulo
	Definir num, EsPrimo Como Entero
	
	EsPrimo = 0
	
	Repetir
		
		Escribir "ingrese numero"
		leer num
		
		EsPrimo = primo(num)
		
		si EsPrimo = 2
			Escribir "es un numero primo"
		SiNo
			Escribir "no es un numero primo"
		FinSi
		
	Mientras Que num <> 0
FinAlgoritmo

Funcion contador <- primo(num Por Valor)
	Definir contador, i Como Entero
	contador = 0
	para i <- 1 Hasta num
		si num mod i = 0
			contador = contador + 1
		FinSi
	FinPara
FinFuncion