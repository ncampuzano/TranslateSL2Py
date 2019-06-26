MAX_ALUMNOS = 20

for k in range(int(1), int(MAX_ALUMNOS)+1):
	print(str("\nIngrese nota para alumno numero ") , str( k) , str( ":"))
	notas = input()
	sumanotas = sumanotas + notas[k]
prom = suma_notas / MAX_ALUMNOS
cnb = 0
for k in range(int(1), int(MAX_ALUMNOS)+1):
	if notas[k] < prom:
		cnb = cnb + 1
print(str("\nExisten ") , str( cnb) , str( " alumnos con notas inferiores") , str( " al promedio del curso, que es ") , str( prom))