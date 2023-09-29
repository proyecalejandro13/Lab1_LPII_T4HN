package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@Column(name="idEmpleado")
	private int idEmpleado;
	
	@Column(name="Apellidos")
	private String Apellidos;
	
	@Column(name="Nombres")
	private String Nombres; 
	
	@Column(name="Edad")
	private int Edad;
	
	@Column(name="Sexo")
	private String Sexo;
	
	@Column(name="Salario")	
	private double Salario;
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		this.Salario = salario;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}
	
	
	
	
	public Empleado() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Edad="
				+ Edad + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
	}
	public Empleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		this.Apellidos = apellidos;
		this.Nombres = nombres;
		this.Edad = edad;
		this.Sexo = sexo;
		this.Salario = salario;
	}
	
	
}

