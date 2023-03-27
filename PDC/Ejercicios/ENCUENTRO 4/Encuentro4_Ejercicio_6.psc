Algoritmo tareas
	
	Definir cantMail como entero
	Definir soliEjec, soliDept Como caracter
	
	
	Escribir " El orden de las tareas son las siguientes"
	Escribir "1. Iniciar sesion como administrador"
	Escribir "2. Ingresar a informes de marketing para saber ingresos publicitarios"
	Escribir "3. Completar la hoja de calculo de ingresos mensuales"
	Escribir "4. Revisar correo electronico"
	
	Escribir "Cuantos correos electronicos hay?"
	leer cantMail
	
	
	si cantMail <= 10 Entonces
		Escribir "5. Revisar correo de voz"
		Escribir "Hay solicitud ejecutivas? Responda con SI/NO"
		leer soliEjec
		si soliEjec = "SI" o soliEjec = "si" Entonces
			Escribir "Hay solocitudes de emergencia de otros departamentos? Responda con SI/NO"
			leer soliDept
			si soliDept = "SI" o soliDept = "si"  Entonces
				Escribir "6. Hacer solicitudes de emergencia de otros departamentos"
				Escribir "7. Hacer solicitudes ejecutivas"
				Escribir "8. Enviar correo electronico de actualizacion"
				Escribir "9. Apagar la computadora"
				Escribir "10. Regar planta"
			FinSi
			si soliDept = "NO" o soliDept = "no" Entonces
				Escribir "6. Hacer solicitudes ejecutivas"
				Escribir "7. Enviar correo electronico de actualizacion"
				Escribir "8. Apagar la computadora"
				Escribir "9. Regar planta"
			FinSi
		FinSi
		si soliEjec = "NO" o soliEjec = "no" Entonces
			Escribir "6. Enviar correo electronico de actualizacion"
			Escribir "7. Apagar la computadora"
			Escribir "8. Regar planta"
		FinSi
	SiNo
		Escribir "5. Enviar correo electronico de actualizacion"
		Escribir "6. Apagar la computadora"
		Escribir "7. Regar planta"
	FinSi
FinAlgoritmo
