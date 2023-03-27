/// Ofrecen 15% de descuento en el total de la compra
/// Cliente quiere saber cuanto es el total a pagar

Algoritmo descuento
	
	Definir montoReal, montoFinal, desc Como Real
	
	Escribir "ingrese el monto a pagar"
	leer montoReal
	
	desc = (15*montoReal)/100
	
	montoFinal = montoReal-desc
	
	Escribir "El monto a pagar con el 15% de descuento es de: " , montoFinal
	
FinAlgoritmo
