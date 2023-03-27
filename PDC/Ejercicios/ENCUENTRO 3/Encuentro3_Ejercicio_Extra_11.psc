/// Alumno quiere saber su calificacion final 
/// la calificacion se compone de 3 porcentajes
/// 55% del promedio de 3 calificaciones
/// 30% de un examen final
///15% de un trabajo final


Algoritmo calificaciones
	
	Definir nota1,nota2,nota3,promParciales,porcenParciales Como Real //Punto a de la guia
	Definir examFinal, porcenExamFinal Como Real //punto b de la guia
	Definir trabFinal, porcenTrabFinal Como Real //punto c de la guia
	Definir total Como Real
	Escribir "ingrese 3 calificaciones parciales"
	leer nota1, nota2, nota3
	
	promParciales = (nota1+nota2+nota3)/3
	
	//100% -- promedioNotas
	//55% -- x
	porcenParciales = (55*promParciales)/100
	
	Escribir "ingrese calificacion de examen final"
	Leer examFinal
	
	//100% -- examFinal
	//30% -- x
	porcenExamFinal = (30*examFinal)/100
	
	Escribir "ingrese calificacion del trabajo final"
	leer trabFinal
	
	//100% -- trabFinal
	//15% -- x
	porcenTrabFinal = (15*trabFinal)/100
	
	total = porcenExamFinal+porcenParciales+porcenTrabFinal
	Escribir "Su nota final es de: ", total
	
FinAlgoritmo
