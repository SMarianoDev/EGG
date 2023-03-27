//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:

Algoritmo sin_titulo
	
	Definir  i, j, num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	para i <- 1 Hasta num Hacer
		para j <- 1 Hasta num Hacer
			
			si j = 1 y i = 1 o j = num y i = num
				Escribir Sin Saltar " * "
			sino
				si j = 1 o j = num 
					Escribir Sin Saltar " * "
				SiNo
					si i = 1 o i = num 
						Escribir Sin Saltar " * "
					SiNo
						Escribir Sin Saltar "   "
					FinSi
				FinSi
			FinSi
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
