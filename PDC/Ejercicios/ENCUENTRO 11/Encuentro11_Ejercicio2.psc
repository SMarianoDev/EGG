Algoritmo dos_encuentro11
	Definir num, cantidad_digitos,i,j Como Entero
	Escribir "ingrese un numero entero"
	Leer num 
	i=0
	para j <- 1 Hasta num Hacer
		si num<>0 Entonces
			num= trunc(num/10)
			i= i + 1
		FinSi
	FinPara
	Escribir i
FinAlgoritmo
