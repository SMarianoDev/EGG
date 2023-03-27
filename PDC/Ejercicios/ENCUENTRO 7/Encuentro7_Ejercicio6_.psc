Algoritmo mayores 
	
	Definir num1,num2, num3 Como Real
	Definir  i Como Entero
	Escribir "ingrese un numero minimo con decimal"
	leer num1
	Escribir "ingrese un numero mayor a " , num1
	leer num2
	
	i = 1
	
	si num2 > num1 Entonces
		Escribir "ingrese un numero mayor a " , num1
		leer num2	
		
		Mientras num1 < num2 Hacer
			Escribir "ingrese un numero mayor a " , num1
			Leer num2
			i = i+1
		FinMientras
		
		Escribir num2 " no es mayor a " , num1
		
	SiNo
		
		Escribir num2 " no es mayor a " , num1
		
	FinSi
	
FinAlgoritmo
