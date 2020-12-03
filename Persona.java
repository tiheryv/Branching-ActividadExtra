public class Persona{
	//Atributos
	private String nombre;
	private String nacionalidad;
	private int edad;

	//Constructor

	public Persona(String nombre, String pais, int edad){
		this.nombre = nombre;
		this.pais = nacionalidad;
		this.edad = edad;
	}

	//Metodos de acceso

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNacionalidad(){
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad){
		this.nacionalidad = nacionalidad;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}

	//Metodo
	public String dameDatosPersona(){
		return "Nombre: " + nombre +
			"Edad: " + edad +
			"Nacionalidad: " + nacionalidad;
	}
}

