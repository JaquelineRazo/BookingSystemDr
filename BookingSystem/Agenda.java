import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    static ArrayList<String> usuarioAdmin = new ArrayList<String>();
    static ArrayList<String> contrasenaAdmin = new ArrayList<String>();

    static ArrayList<String> nombreDoc = new ArrayList<String>();
    static ArrayList<String> especialidadDoc = new ArrayList<String>();
    static ArrayList<Integer> edadDoc = new ArrayList<Integer>();
    static ArrayList<String> sexoDoc = new ArrayList<String>();
    static ArrayList<Long> telefonoDoc = new ArrayList<Long>();
    static ArrayList<String> cedulaProfesional = new ArrayList<String>();

    static ArrayList<Integer> pacienteEdad = new ArrayList<Integer>();
    static ArrayList<String> pacienteNombre = new ArrayList<String>();
    static ArrayList<String> pacienteSexo = new ArrayList<String>();
    static ArrayList<String> numSeguroSocial = new ArrayList<String>();
    static ArrayList<Long> telefonoPaciente = new ArrayList<Long>();

    static ArrayList<String> pacienteNombreCita = new ArrayList<String>();
    static ArrayList<Integer> patienteEdadCita = new ArrayList<Integer>();
    static ArrayList<String> motivoCita = new ArrayList<String>();
    static ArrayList<String> horaCita = new ArrayList<String>();
    static ArrayList<String> fechaCita = new ArrayList<String>();
    static ArrayList<Byte> doctorID = new ArrayList<Byte>();

    public void dataBase() { // Crear base de datos
        usuarioAdmin.add("Usuario");
        contrasenaAdmin.add("Contraseña");

        nombreDoc.add("Mariel Luna");
        nombreDoc.add("Santiago Torres");

        especialidadDoc.add("Pediatra");
        especialidadDoc.add("Cardiologo");

        sexoDoc.add("F");
        sexoDoc.add("M");

        edadDoc.add(25);
        edadDoc.add(24);

        telefonoDoc.add(1333491345l);
        telefonoDoc.add(2313491345l);

        cedulaProfesional.add("1234553MDC");
        cedulaProfesional.add("1242153DFU");
    }

    public void doctorRegistro() throws Exception { // Crear registro de doctores
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t -------------------------");
        System.out.println("\t\t|   Registro de Doctores  |");
        System.out.println("\t\t -------------------------");
        System.out.println("\n");

        System.out.println("Ingresar nombre completo: ");
        nombreDoc.add(sc.next());
        System.out.println("Ingresar edad: ");
        edadDoc.add(sc.nextInt());
        System.out.println("Ingresar sexo: ");
        sexoDoc.add(sc.next());
        System.out.println("Ingresar especialidad: ");
        especialidadDoc.add(sc.next());
        System.out.println("Ingresar telefono: ");
        telefonoDoc.add(sc.nextLong());
        System.out.println("Ingresar numero de cedula profesional: ");
        cedulaProfesional.add(sc.next());
        System.out.println("Registro exitoso!");
        Thread.sleep(900);

    }

    public void pacienteRegistro() throws Exception { // Crear registro de pacientes
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t --------------------------");
        System.out.println("\t\t|   Registro de Pacientes  |");
        System.out.println("\t\t --------------------------");
        System.out.println("\n");

        System.out.println("Ingresar nombre completo: ");
        pacienteNombre.add(sc.next());
        System.out.println("Ingresar edad: ");
        pacienteEdad.add(sc.nextInt());
        System.out.println("Ingresar sexo: ");
        pacienteSexo.add(sc.next());
        System.out.println("Ingresar telefono: ");
        telefonoPaciente.add(sc.nextLong());
        System.out.println("Ingresar numero de seguro social: ");
        numSeguroSocial.add(sc.next());
        System.out.println("Registro exitoso!");
        Thread.sleep(900);

    }

    public void citas() throws Exception { // Crear registro de citas
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        byte choice;

        System.out.println("\t\t  ______________________");
        System.out.println("\t\t |                     |");
        System.out.println("\t\t |     Agendar Cita    |");
        System.out.println("\t\t |_____________________|");
        System.out.println("\n Elige un doctor: ");

        for (int i = 0; i <= nombreDoc.size() - 1; i++) {
            System.out.println((i + 1) + ". " + nombreDoc.get(i));
        }
        choice = sc.nextByte();
        doctorID.add(choice);

        while (flag) {
            Thread.sleep(1000);
            System.out.println("\t\t  ______________________");
            System.out.println("\t\t |                     |");
            System.out.println("\t\t |     Agendar Cita    |");
            System.out.println("\t\t |_____________________|");

            if (choice <= nombreDoc.size() && choice > 0) {
                System.out.println("\n\nName: \t " + nombreDoc.get(choice - 1) + "\nEspecialidad: \t "
                        + especialidadDoc.get(choice - 1) + "\nCedula Profesional:  "
                        + cedulaProfesional.get(choice - 1));
                System.out.println("\nIngresa tu nombre: \t");
                sc.nextLine();
                pacienteNombreCita.add(sc.nextLine());
                System.out.println("Ingresa tu edad: \t");
                patienteEdadCita.add(sc.nextInt());
                System.out.println("Ingresa la fecha (DD/MM/YY): \t");
                fechaCita.add(sc.next());
                System.out.println("Ingresa la hora (00:00): \t");
                horaCita.add(sc.next());
                System.out.println("Ingresa el motivo \t");
                motivoCita.add(sc.next());

                System.out.println("\n Registro exitoso!");

                flag = false;
                break;
            } else {
                System.out.println("\n enter correct input..");
                flag = true;
                Thread.sleep(1000);
            }

        }

    }

    public static void main(String[] args) throws Exception { // Main
        Agenda ap = new Agenda();
        Scanner sc = new Scanner(System.in);
        ap.dataBase();
        boolean flag = false;
        

        String usuarioCheck;
		System.out.println("\t\t----------------------------------------");
		System.out.println("\t\t| Saludos! Ingresa tus credenciales    |");
		System.out.println("\t\t----------------------------------------");
		
		System.out.println("Ingresa tu usuario");
		usuarioCheck=sc.next();
		System.out.println("Ingresa tu contrasena");
		String password=sc.next();

        for(int i = 0; i<=usuarioAdmin.size()-1;i++)
		{
			
			if((usuarioAdmin.get(i)).equals(usuarioCheck)&&(contrasenaAdmin.get(i)).equals(password))
			{
				flag=true;
				break;
			}
		}
        if(flag==true)
		{
            while (flag = true) {

                System.out.println("\t\t----------------------------------------");
                        System.out.println("\t\t| Bienvenido al Sistema de Agenda       |");
                        System.out.println("\t\t----------------------------------------");

                System.out.println("\nMenu de opciones:\n");
                System.out.println("[1] - Registrar doctor");
                System.out.println("[2] - Registrar patiente");
                System.out.println("[3] - Crear cita");
                System.out.println("[4] - Ver lista de doctores");
                System.out.println("[5] - Ver pacientes registrados");
                System.out.println("[6] - Ver citas");
                System.out.println("[7] - Salir");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        ap.doctorRegistro();
                        flag = true;
                        break;
                    case 2:
                        ap.pacienteRegistro();
                        flag = true;
                        break;
                    case 3:

                        ap.citas();
                        flag = true;
                        break;
                    case 4:
                        for (int i = 0; i <= nombreDoc.size() - 1; i++) {
                            System.out.println(i + ". Nombre: " + nombreDoc.get(i) + "  \n"+ "Edad: " + edadDoc.get(i) + "  \n"+
                                                "Sexo: " + sexoDoc.get(i) + "  \n"+
                                                "Telefono: " + telefonoDoc.get(i) +"  \n"+
                                                "Especialidad: " + especialidadDoc.get(i) +"  \n"+
                                                "Cedula Profesional: " + cedulaProfesional.get(i)+ "  \n\n ");
                                            
                        }

                        break;

                    case 5:
                        if (pacienteNombre.isEmpty()) {
                            System.out.println("No hay pacientes registrados.");
        
                            break;
                        } else {
                            for (int i = 0; i <= pacienteNombre.size() - 1; i++) {
                                System.out.println(i + ". Nombre: " + pacienteNombre.get(i) + "  \n"+
                                                "Edad: " + pacienteEdad.get(i) + "  \n"+
                                                "Sexo: " + pacienteSexo.get(i) + "  \n"+
                                                "Telefono: " + telefonoPaciente.get(i) + "  \n"+
                                                "Seguro Social: " + numSeguroSocial.get(i)+ "  \n\n");
                                                
                            }
                        }

                        break;

                    case 6:
                        if (pacienteNombreCita.isEmpty()) {
                            System.out.println("\nNo hay citas.");

                            break;
                        }

                        else {
                            for (int i = 0; i <= pacienteNombreCita.size() - 1; i++) {
                                System.out.println(i + ". Nombre:" + pacienteNombreCita.get(i) + "  \n"+
                                                "Edad: " + patienteEdadCita.get(i) + "  \n"+
                                                "Motivo: " + motivoCita.get(i) + "  \n"+
                                                "Hora: " + horaCita.get(i) + "  \n"+
                                                "Fecha:  " + fechaCita.get(i)+ "  \n"+
                                                "Doctor: " + nombreDoc.get(i)+ "  \n"+
                                                "Especialidad: " + especialidadDoc.get(i)+ "  \n\n ");
                            }

                            flag = false;

                        }
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.exit(0);

                }
            }
        }
        else {
            System.out.println("Usuario o Contraseña Incorrectos");
            flag = false;
        }
    }

}
