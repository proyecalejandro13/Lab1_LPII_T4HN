package controllers;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import models.Empleado;

public class EmpleadoController {
	
	public String CrearEmpleado(String Apellidos,String Nombres,int Edad,String Sexo,double Salario) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			Empleado empleado = new Empleado(Apellidos,Nombres,Edad,Sexo,Salario);
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();			
			return "Empleado creado,¡Excelente¡¡";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Empleado no creado,corregir";
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	
	public String EliminarEmpleado(int idEmpleado) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class,idEmpleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "EL empleado se eliminó correctamente";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "El empleado no se eliminó,corriga el error del sistema";
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String ActualizarEmpleado(int idEmpleado,String Apellidos,String Sexo) {
		SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {			
			Empleado empleado = session.get(Empleado.class,idEmpleado);
			session.beginTransaction();
			empleado.setApellidos(Apellidos);
			empleado.setSexo(Sexo);
			
			session.update(empleado);
			session.getTransaction().commit();;
			
			session.close();
			
			return "El empleado se actualizó satisfactoriamente";
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Empleado no se actualizo,verificar el error";
	}
	
		
	//////////////////////////////////////////////////////////////////////////////////////
	
	public String ObtenerEmpleado(int idEmpleado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado=session.get(Empleado.class, idEmpleado);
			
			session.getTransaction().commit();
			sessionFactory.close();
			
			return empleado.toString();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Error al leer o listar los datos del Empleado";
	}
	
	
	
	
	
	
	
	
	
	
}
