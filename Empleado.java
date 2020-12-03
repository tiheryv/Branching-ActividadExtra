public class Empleado extends Persona implements accionesPers{
	/*clase Empleado hereda de la clase Animal e implementa la
interface de accionesPers*/


	//Atributos
	private int codigoEmpleado;
	private int numTel;
	private int sueldo;

	//Constructor

	public Empleado (int codigoEmpleado, int numTel, int sueldo
			int edad, String nombre, String nacionalidad){
		super (edad, nombre, nacionalidad);
		this.codigoEmpleado = codigoEmpleado;
		this.numTel = numTel;
		this.sueldo = sueldo;
	}
  	//Metodos de acceso
    	public int getcodigoEmpleado() {
        	return codigoEmpleado;
    	}

    	public void setcodigoEmpleado(int codigoEmpleado) {
		  this.codigoEmpleado = codigoEmpleado;
    	}

    	public int getnumTel() {
        	return numTel;
    	}

    	public void setnumTel(int numTel) {
        this.numTel = numTel;
    	}

    	public int getsueldo() {
        	return sueldo;
    	}

    	public void setsueldo(int sueldo) {
        	this.sueldo = sueldo;
  	 }

        public void datosEmpleado(){

	       System.out.println("nEmpleado: "+numEmpleado+
		" Telefono: "+numTel+" Sueldo: "+sueldo);

	}

    //Metodos de la interface
    @Override
    public String PuestoEmpleado(String puesto) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      this.puesto = puesto;
      	return "Puesto: " + puesto;
    }

    @Override
    public int aniosLaborando(int aniosLaborando) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates

        return aniosLaborando;
     }

    public void aniosLaborando(){
        System.out.println("Anios Laborando: " + aniosLaborando);
    }
    private int aniosLaborando;

    private String puesto;
}
