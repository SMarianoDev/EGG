Algoritmo intervalo
	
	Definir num1, num2,num3, i Como Entero
	Escribir "Ingrese un numero maximo"
	leer num1
	Escribir "ingrese un numero minimo"
	leer num2
	Escribir "ingrese numeros entre " , num1 " y " , num2
	leer num3
	
	i = 0
	
	Mientras num3 <= num1 y num3 >= num2  Hacer
		Escribir "ingrese otro numero"
		leer num3
		i = i+1
	FinMientras
	
	Escribir "El numero ingresado no esta dentro del intervalo"
	Escribir "Usted ingreso " , i , " numeros"
	
FinAlgoritmo
