//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior. 
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha 
//representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que 
//		dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores 
//			dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo EjercicioFecha
	
	Definir dia, mes, anio Como Entero
	Escribir "Ingrese una fecha en formato DD/MM/AAAA"
	Leer dia, mes, anio
	diaAnterior(dia, mes, anio)
	
FinAlgoritmo

SubProceso diaAnterior(dd, mm, aaaa)
	
	Si dd > 1 Entonces
		dd = dd - 1
	SiNo
		Si dd = 1 Y mm = 1 Entonces
			aaaa = aaaa - 1
			dd = 31
			mm = 12
		SiNo
			mm = mm - 1
			Segun mm Hacer
				2: 
					Si ((aaaa MOD 4 = 0) Y (aaaa MOD 100 <> 0)) O (aaaa MOD 400 = 0) entonces
						dd = 29
					SiNo
						dd = 28
					FinSi
				4,6,9,11:
					dd = 30
				3,5,7,8,10,12:
					dd = 31
			FinSegun
		FinSi
	FinSi
	
	Escribir "La fecha anterior es: " dd "/" mm "/" aaaa
	
FinSubProceso