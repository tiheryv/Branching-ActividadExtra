public class Main {

    public static void main(String[] args) {

	//Creacion  de objeto tipo Persona
       	Persona nuevaPersona = new Persona( "Jonathan", "Mexicano", 20);

        System.out.println("Datos persona: "+
				nuevaPersona.dameDatosPersona());

        nuevaPersona.setEdad(21);
        System.out.println("La edad de la persona es: "+
				nuevaPersona.getEdad());

        System.out.println("Datos persona: "+
                                nuevaPersona.dameDatosPersona());

	//Creacion de objeto tipo Empleado
        Empleado nuevoEmpleado = new Empleado (317, 5526262626, 13000,
						21, "Jonathan", "Mexicano" );

        nuevoEmpleado.datosEmpleado();

	//Uso del metodo de la interfaz
        System.out.println("Puesto: "+ nuevoEmpleado.PuestoEmpleado("CEO"));
        System.out.println("Anios: "+ nuevoEmpleado.aniosLaborando(2)+"Años: /");

    }
}

