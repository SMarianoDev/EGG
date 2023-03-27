Algoritmo sin_titulo
	Definir opciones Como Caracter
	opciones = ""
	Repetir
		menu
	Mientras Que opciones <> " "
	
FinAlgoritmo

SubProceso menu
	Definir opciones, espesor, largo, alto  Como Entero
	opciones = 0
	Hacer
		Escribir "ingrese la opcion que desea ejecutar"
		Escribir "1 - Calcular muro de ladrillos"
		Escribir "2 - Calcular viga de hormigon"
		Escribir "3 - Calcular columnas de hormigon"
		Escribir "4 - Calcular contrapisos"
		Escribir "5 - Calcular techo"
		Escribir "6 - Calcular pisos"
		Escribir "7 - Calcular pintura"
		Escribir "8 - Calcular iluminacion"
		Escribir "9 - salir"
		leer opciones
	Mientras Que opciones = 0
	Segun opciones Hacer
		
		1:
			calcularMuro
		2:
			calcularViga
		3:
			calcularColumna
		4:
			calcularContrapiso
		5:
			
		6:
			
		7:
		
		8:
			
		9:
			
			
	FinSegun
	
FinSubProceso

Funcion superficie <- calcularSuperficie(alto, largo)
	Definir superficie Como real
	superficie = alto*largo
	superficie = superficie/100
FinFuncion
Funcion volumen <- calcularVolumen(alto,largo, espesor)
	Definir volumen Como Entero
	volumen = (alto*largo)*espesor
	volumen = volumen/100
FinFuncion

SubProceso calcularMuro
	Definir espesor, largo, alto Como Entero
	Definir superficie Como Real
	Escribir "ingrese 20 o 30 segun el espesor de los ladrillos"
	leer espesor
	Escribir "ingrese el largo del ladrillo"
	leer largo
	Escribir "ingresar el alto del ladrillo"
	leer alto
	
	superficie = calcularSuperficie(alto,largo)
	
	si espesor = 30
		Escribir "se necesitaran ", superficie*15.2 " Kg de cemento."
		Escribir "se necesitaran ", superficie*0.115 " m3 de arena"
		Escribir "se necesitaran ", superficie*120 " ladrillos"
	FinSi
	si espesor = 20
		Escribir "se necesitaran ", superficie*10.9 " kg de cemento."
		Escribir "se necesitaran ", superficie*0.09 " m3 de arena"
		Escribir "se necesitaran ", superficie*90 " ladrillos"
	FinSi
	Escribir "----------------------------------------"
FinSubProceso

SubProceso calcularViga
	Definir largo Como Entero
	Escribir "ingrese el largo de la viga"
	leer largo
	
	Escribir "se necesitaran ", largo*9 " Kg de cemento."
	Escribir "se necesitaran ", largo*0.02 " m3 de arena"
	Escribir "se necesitaran ", largo*0.02 " m2 de piedra"
	Escribir "se necesitaran ", largo*4 " m de hierro del 8"
	Escribir "se necesitaran ", largo*3 " m de hierro del 4"
	Escribir "----------------------------------------"
FinSubProceso
SubProceso calcularColumna
	Definir largo Como Entero
	Escribir "ingrese el largo de la viga"
	leer largo
	
	Escribir "se necesitaran ", largo*7.5 " Kg de cemento."
	Escribir "se necesitaran ", largo*0.016 " m3 de arena"
	Escribir "se necesitaran ", largo*0.016 " m2 de piedra"
	Escribir "se necesitaran ", largo*6 " m de hierro del 10"
	Escribir "se necesitaran ", largo*3 " m de hierro del 4"
	Escribir "----------------------------------------"
FinSubProceso
SubProceso calcularContrapiso
	Definir espesor, largo, alto Como Entero
	Definir volumen Como Real
	Escribir "ingrese el espesor del piso"
	leer espesor
	Escribir "ingrese el largo del piso"
	leer largo
	Escribir "ingresar el alto del piso"
	leer alto
	
	volumen = calcularVolumen(alto,largo, espesor)
	
	Escribir "se necesitaran ", volumen*10.5 " Kg de cemento."
	Escribir "se necesitaran ", volumen*0.45 " m3 de arena"
	Escribir "se necesitaran ", volumen*0.9 " m3 de piedra"
	
	Escribir "----------------------------------------"
FinSubProceso
SubProceso calcularTecho
	Definir espesor, largo, alto Como Entero
	Definir volumen Como Real
	Escribir "ingrese el espesor del techo"
	leer espesor
	Escribir "ingrese el largo del techo"
	leer largo
	Escribir "ingresar el alto del techo"
	leer alto
	
	volumen = calcularVolumen(alto,largo, espesor)
	
	Escribir "se necesitaran ", volumen*10.5 " Kg de cemento."
	Escribir "se necesitaran ", volumen*0.45 " m3 de arena"
	Escribir "se necesitaran ", volumen*0.9 " m3 de piedra"
	
	Escribir "----------------------------------------"
FinSubProceso
	