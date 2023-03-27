
Algoritmo sin_titulo
	
	definir nombre, dia, turno, respuesta, feriado como caracter
	definir horas Como Entero
	
	escribir "Ingrese su Nombre"
	leer nombre
	escribir "ingrese el dia de la semana que trabajo"
	leer dia
	Hacer
		escribir "El dia fue feriado? Escriba SI/NO"
		leer feriado
	Mientras Que Mayusculas(feriado) <> "SI" y Mayusculas(feriado) <> "NO"
	Hacer
		escribir "En que turno trabajo? escriba DIURNO/NOCTURNO "
		leer turno
	Mientras Que Mayusculas(turno) <> "DIURNO" y Mayusculas(turno) <> "NOCTURNO"
	
	escribir "cuantas horas trabajo?"
	leer horas	
	
	respuesta = Concatenar(feriado,turno)
	escribir "El empleado " ,nombre " trabajó " horas, " horas el dia " ,dia ". Y como ", Mayusculas(feriado) " era feriado, cobrará: $", jornal(horas,respuesta)
	
FinAlgoritmo

funcion tarifa = jornal(horas por valor respuesta Por Valor)
	definir tarifa, tarifanocturna, tarifadiurna como real

	tarifanocturna= 125
	tarifadiurna= 90
	Segun Mayusculas(respuesta)
		"NODIURNO":
			tarifa = horas * tarifadiurna
		"NONOCTURNO":
			tarifa = horas * tarifanocturna
		"SIDIURNO":
			tarifa = (horas * tarifadiurna) + ((horas * tarifadiurna)*0.1)
		"SINOCTURNO":
			tarifa = (horas * tarifadiurna) + ((horas * tarifadiurna)*0.15)
	FinSegun
	
FinFuncion