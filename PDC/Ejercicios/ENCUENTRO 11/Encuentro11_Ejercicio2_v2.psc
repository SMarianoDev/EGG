Algoritmo dosdia11_mientras
	Definir num, cantidad_digito Como Entero
	Escribir "ingrese un numero entero"
	Leer num 
	cantidad_digito = 0
	Mientras num >= 1 Hacer
		num= trunc(num/10)
		cantidad_digito = cantidad_digito + 1
	FinMientras
	Escribir "La cantidad de digitos es = " cantidad_digito
FinAlgoritmo