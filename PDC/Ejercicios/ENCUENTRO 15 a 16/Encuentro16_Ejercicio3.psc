Algoritmo sin_titulo
	
	Definir dividendo, divisor Como Entero
	Escribir "ingrese un dividendo"
	leer dividendo
	Escribir "ingrese un divisor"
	leer divisor
	
	resultado(dividendo,divisor)
	
FinAlgoritmo


SubProceso resultado(dividendo, divisor)
	
	Definir resta Como Entero
	
	resta = dividendo - divisor
	Escribir dividendo " - " , divisor " = " resta
	
	Mientras  resta > divisor
		Escribir Sin Saltar resta " - " divisor 
		resta = resta - divisor
		Escribir " = " resta
	FinMientras
	
	Escribir "el resultado es: " resta
	
FinSubProceso
	