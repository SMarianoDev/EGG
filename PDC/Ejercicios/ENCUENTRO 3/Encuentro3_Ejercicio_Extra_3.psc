Algoritmo descuento
	
	Definir salarioNeto, salarioBruto, porcentaje Como Real
	
	Escribir "ingrese su salario en pesos"
	leer salarioNeto
	
	porcentaje = (20*salarioNeto)/100
	//salarioNeto --- 100%
	//x ---- 20%
	
	salarioBruto = salarioNeto - porcentaje
	
	Escribir "Su salario bruto seria de " , salarioBruto , " pesos."
FinAlgoritmo
