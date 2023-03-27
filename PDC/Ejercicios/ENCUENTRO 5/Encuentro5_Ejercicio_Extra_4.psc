////cobra alquiler por hora
//// si devuelve el auto dentro de las 2 horas de uso pago $400 y nafta de regalo
//// si pasa las 2hs se le cobra la nafta y el tiempo que se paso de las 2hs
//// se le cobra $40 pesis por litro de nafta y $5.20 el minuto de exceso
//// registrar informacion y total a pagar



Algoritmo alquiler
	
	Definir horaDeUso, cantidadNafta, minutosExce, minDeUso, totalDeUso Como Real
	Escribir "ingrese cuantas horas uso el vehiculo"
	leer horaDeUso
	Escribir "ingrese cuantos minutos uso el vehiculo"
	leer minDeUso
	
	totalDeUso = (horaDeUso*60)+minDeUso
	
	cantidadNafta = azar(10) * 40
	Escribir cantidadNafta // esto es para saber el numero random de cantidadNafta
	minutosExce = minDeUso * 5.20 // minutos excedidos por los pesos por minutos
	Escribir minutosExce
	
	si totalDeUso <= 120 Entonces
		Escribir "Usted debe abonar $400"
	SiNo
		si totalDeUso > 120 Entonces
			Escribir "Usted tiene que pagar: $400 + ", "$",cantidadNafta , " y $" , minutosExce
		FinSi
	FinSi
	
	
FinAlgoritmo
