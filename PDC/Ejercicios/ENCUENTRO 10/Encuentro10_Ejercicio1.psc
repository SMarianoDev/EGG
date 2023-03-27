//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
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
