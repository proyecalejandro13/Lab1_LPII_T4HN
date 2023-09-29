package Views;
import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		//creando un nuevo empleado
		//String empleado=new EmpleadoController().CrearEmpleado("Cabanillas","Marina",30,"Masculino",1500.00); 
		//String empleado=new EmpleadoController().CrearEmpleado("Rojas","Lucia",28,"Femenino",1300.00); 
		
		//actualizar empleado
		//String empleado=new EmpleadoController().ActualizarEmpleado(2,"Costa","Femenino"); 
		//String usuario = new UsuarioController().UpdateUsuario(1,"Antonio")
		
		
		//Leer empleado
		//String empleado=new EmpleadoController().ObtenerEmpleado(3); 
		
		
		//Elminiar empleado
		String empleado=new EmpleadoController().EliminarEmpleado(3);
		System.out.println(empleado);
		
		
	}
}
