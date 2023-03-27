// septiembre, octubre, noviembre hay descuento de 10%
//solicitar que ingrese mes e importe
// calcular importe total que tiene que pagar e imprimirlo

Algoritmo descuentos
	
	Definir mes Como Caracter
	Definir  importe, descuento como real
	
	Escribir "ingrese el mes de compra"
	leer mes
	Escribir "ingrese importe de la compra"
	leer importe
	
	descuento = (importe*10)/100
	
	si mes = "septiembre" o mes = "octubre" o mes = "noviembre" Entonces
		Escribir "el total a pagar es de: " , importe-descuento
	FinSi
	
FinAlgoritmo
