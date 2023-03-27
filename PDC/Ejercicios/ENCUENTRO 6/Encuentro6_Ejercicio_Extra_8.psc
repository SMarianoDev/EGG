// calcular sueldos semanales (lunes a viernes) en base a 3 modalidades
// realizar un menu de opciones para poder elegir el tipo de contrato que tiene un empleado
// A = comision ----- 40% del monto total de ventas realizadas en semana es el sueldo fijo
// A = salario fijo + comision ---- precio por hora * cantidad de horas por semana (max 40 horas) y monto total de ventas por semana + comision (25% de la venta total) 
// A = salario fijo ------ precio por hora * cantidad de horas por semana (si supera las 40 horas, se paga 50% del valor de la hora por hora realizada) 


Algoritmo empresa
	
	Definir contrato Como Caracter
	Definir montoVentas, horasHechas, precioHora, horasExtras Como entero
	Definir comisionVentasA, comisionVentasB Como Real
	
	Escribir "ingrese la letra segun su contrato"
	Escribir "A - Comision"
	Escribir "B - Salario + Comision"
	Escribir "C - Salario fijo"
	leer contrato
	
	montoVentas = (azar(10))*100
	comisionVentasA = montoVentas*0.4
	comisionVentasB = montoVentas*0.25
	horasHechas = azar(50)
	precioHora = 50
	horasExtras = (horasHechas-40)
	
	segun contrato Hacer
		"a","A":
			Escribir "El monto total de ventas es de: $" , montoVentas 
			Escribir "Su comision es de: $" , comisionVentasA
			Escribir "Su salario es de: $", comisionVentasA
		"b","B":
			si horasHechas <= 40 Entonces
				Escribir "Usted realizo: " , horasHechas " horas en la semana"
				Escribir "El monto total de ventas es de: $" , montoVentas 
				Escribir "Su comision es de: $" , comisionVentasB
				Escribir "Su salario fijo es de: $", (horasHechas * precioHora) + comisionVentasB
			sino
				si horasHechas > 40 Entonces
					Escribir "Usted realizo: " , horasHechas " horas en la semana"
					Escribir "El monto total de ventas es de: $" , montoVentas 
					Escribir "Su comision es de: $" , comisionVentasB
					Escribir "Su salario fijo es de: $", (40 * precioHora) + comisionVentasB
				FinSi
			FinSi
		"c","C":
			si horasHechas <= 40 Entonces
				Escribir "Usted realizo: " , horasHechas " horas en la semana"
				Escribir "Su salario fijo es de: $", (horasHechas * precioHora)
			sino
				si horasHechas > 40 Entonces
					Escribir "Usted realizo: " , horasHechas " horas en la semana"
					Escribir "Su salario fijo es de: $", (horasHechas * precioHora) + (horasExtras*(precioHora/2))
				FinSi
			FinSi
		De Otro Modo:
			Escribir "La letra que ingreso no coincide con las opciones"
	FinSegun
FinAlgoritmo
