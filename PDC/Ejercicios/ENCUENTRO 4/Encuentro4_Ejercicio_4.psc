Algoritmo capicua
	
	Definir num, num2, num3 Como Entero
	Escribir "ingrese un numero de 3 cifras"
	leer num
	
	num2 = num mod 10
	Escribir num2
	
	num3 = trunc (num/100)
	Escribir num3
	
	si num2 = num3 Entonces
		Escribir "el numero es capicua"
	sino
		Escribir "el numero no es capicua"
	FinSi
	
FinAlgoritmo
