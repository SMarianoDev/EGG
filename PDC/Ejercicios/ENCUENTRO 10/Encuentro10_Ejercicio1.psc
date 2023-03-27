//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.

Algoritmo sin_titulo
	
	Definir i, j, empleados, suma Como Entero
	Definir ventas, sueldoBase, sueldoTotal, monto,comision Como Entero
	
	Escribir "Ingrese la cantidad de empleados"
	leer empleados
	
	sueldoBase = 3000
	
	para i <- 1 Hasta empleados
		
		Escribir "Ingrese cuantas ventas realizo el empleado ", i
		leer ventas
		
		suma = 0
		para j <- 1 Hasta ventas
			Escribir "Ingrese el monto de la venta :" , j
			leer monto
			
			suma = suma + monto
			
		FinPara
		
		comision = suma * 0.1 // suma * 10 /  100
		Escribir "Al vendedor " i, " debera pagarle $", comision
		sueldoTotal = sueldoBase + comision
		Escribir "Al vendedor " i, " debera pagarle $", sueldoBase " + $" , comision " : $" , sueldoTotal
		
	FinPara
	
FinAlgoritmo
