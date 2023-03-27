/// Recibe un sueldo base + 10% de comision por ventas
/// realiza 3 ventas al mes
/// Quiere saber cuanto gana en comisiones por las 3 ventas
/// Quier saber cuanto va a ganar en total con su sueldo y las comisiones

Algoritmo comisiones
	
	Definir sueldoBase, venta1, venta2, venta3,sumaVentas, comisionVenta, comisionTotal, total Como Real
	
	Escribir "ingrese su sueldo base"
	leer sueldoBase
	
	Escribir "ingrese los montos de las 3 ventas que hizo en el mes"
	leer venta1, venta2, venta3
	
	sumaVentas = venta1+venta2+venta3
	
	comisionVenta = (10*sumaVentas)/100
	comisionTotal = comisionVenta*3
	
	Escribir "El monto de comision por 3 ventas es de: " , comisionTotal
	
	total = sueldoBase+comisionTotal
	Escribir "Su sueldo total seria de: ", total
	
	
FinAlgoritmo
