Algoritmo AgendarCitas
	Dimension usuariosdoctores[2]
	usuariosdoctores[1] <- '3345'
	usuariosdoctores[2] <- '3452'
	Dimension contraseñadoctores[2]
	contraseñadoctores[1] <- '123'
	contraseñadoctores[2] <- '456'
	Dimension nomdoctores[2]
	nomdoctores[1] <- 'Sarha'
	nomdoctores[2] <- 'Carlos Will'
	Dimension especialidad[2]
	especialidad[1] <- 'Nutrición'
	especialidad[2] <- 'Gastro'
	Dimension usuariospacientes[2]
	usuariospacientes[1] <- 'Josh'
	usuariospacientes[2] <- 'Lizza'
	Dimension contraseñapacientes[2]
	contraseñapacientes[1] <- '678'
	contraseñapacientes[2] <- '901'
	Dimension nompacientes[2]
	nompacientes[1] <- 'Josh Lim'
	nompacientes[2] <- 'Liza Simmone'
	Escribir 'Bienvenido'
	Escribir 'Por favor, seleccione si es Paciente o Doctor'
	Leer respuesta
	Si respuesta='Doctor' Entonces
		Escribir 'Por favor, seleccione si quiere ingresar (escriba 1) o quiere registrarse (escriba 2)'
		Leer resdoctor1
		Si resdoctor1=1 Entonces
			Escribir 'Introduce tu usuario: '
			Leer doctor
			Si doctor=usuariosdoctores[1] O doctor=usuariosdoctores[2] Entonces
				Escribir 'Introduce tu contraseña: '
				Leer contraseña
				Si contraseña=contraseñadoctores[1] O contraseña=contraseñadoctores[2] Entonces
					Escribir '¡Hola!'
				SiNo
					Escribir 'Contraseña incorrecta'
				FinSi
			SiNo
				Escribir 'Usuario desconocido'
			FinSi
		FinSi
		Si resdoctor1=2 Entonces
			Escribir 'Por favor, escriba su nuevo usuario (ID único)'
			Leer nuevoUsuDoc
			Mientras nuevoUsuDoc=usuariosdoctores[1] O nuevoUsuDoc=usuariosdoctores[2] Hacer
				Escribir 'Usuario ya existe '
				Escribir 'Por favor, escriba su nuevo usuario'
				Leer nuevoUsuDoc
			FinMientras
			usuariosdoctores[3] <- nuevoUsuDoc
			Escribir 'Por favor, escriba su nueva contraseña'
			Leer nuevaContraDoc
			contraseñadoctores[3] <- nuevaContraDoc
			Escribir 'Por favor, escriba su nombre completo'
			Leer nombreDoc
			nomdoctores[3] <- nombreDoc
			Escribir 'Por favor, escriba su especialidad'
			Leer nuevaEspe
			especialidad[3] <- nuevaEspe
			Escribir 'Usuario Registrado'
		SiNo
			Escribir 'Seleccione un número dentro del menú de opciones'
		FinSi
	FinSi
	Si respuesta='Paciente' Entonces
		Escribir 'Por favor, seleccione si quiere ingresar (escriba 1) o quiere registrarse (escriba 2)'
		Leer respacien1
		Si respacien1=1 Entonces
			Escribir 'Introduce tu usuario: '
			Leer paciente
			Si paciente=usuariospacientes[1] O paciente=usuariospacientes[2] Entonces
				Escribir 'Introduce tu contraseña: '
				Leer contraseña
				Si contraseña=contraseñapacientes[1] O contraseña=contraseñapacientes[2] Entonces
					Escribir '¡Hola!, ¿Quieres agendar una cita? Sí escribe 1, No escribe 2'
					Leer respacien2
					Mientras respacien2=1 Hacer
						Escribir 'Favor de llenar los siguientes datos: '
						Escribir 'Nombre completo del paciente'
						Leer paciente
						Escribir 'Edad del paciente'
						Leer paciente
						Escribir 'Número de seguro social'
						Leer seguro
						Escribir ' Elija con a su doctor'
						Leer doctor
						Escribir 'Elija fecha y hora de la cita'
						Leer fechayhora
						Escribir 'Motivo de la cita'
						Leer motivo
						Escribir 'Cita agendada'
						Escribir 'Quiere agendar otra cita? Sí escribe 1, No escribe 2'
						Leer respacien2
					FinMientras
					Escribir 'Buen día'
				SiNo
					Escribir 'Contraseña incorrecta'
				FinSi
			SiNo
				Escribir 'Usuario desconocido'
			FinSi
		FinSi
		Si respacien1=2 Entonces
			Escribir 'Por favor, escriba su nuevo usuario'
			Leer nuevoUsuPac
			Mientras nuevoUsuPac=usuariospacientes[1] O nuevoUsuPac=usuariospacientes[2] Hacer
				Escribir 'Usuario ya existe '
				Escribir 'Por favor, escriba su nuevo usuario'
				Leer nuevoUsuPac
			FinMientras
			usuariospacientes[3] <- nuevoUsuPac
			Escribir 'Por favor, escriba su nueva contraseña'
			Leer nuevaContraPac
			contraseñapacientes[3] <- nuevaContraPac
			Escribir 'Por favor, escriba su nombre completo'
			Leer nombrePac
			nompacientes[3] <- nombrePac
			Escribir 'Usuario Registrado'
		SiNo
			Escribir 'Seleccione un número dentro del menú de opciones'
		FinSi
	FinSi
FinAlgoritmo
