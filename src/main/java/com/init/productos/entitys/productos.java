package com.init.productos.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="productos")
public class productos {
	@Id
	@Column(name="Cliente_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Cliente_ID;
	@Column(name="Nombre_Usuario", nullable=false, length=50)
	private String Nombre_Usuario;
	@Column(name="Contraseña", length=50)
	private String Contraseña;
	@Column(name="Nombre", length=50)
	private String Nombre;
	@Column(name="Apellidos", length=50)
	private String Apellidos;
	@Column(name="Correo_Electronico", nullable=false, length=50)
	private String Correo_Electronico;
	@Column(name="Edad")
	private int Edad;
	@Column(name="Estatura")
	private double Estatura;
	@Column(name="Peso")
	private double Peso;
	@Column(name="IMC")
	private double IMC;
	@Column(name="GEB")
	private double GEB;
	@Column(name="ETA")
	private double ETA;
	@Column(name="Fecha_Creacion", length=50)
	private String Fecha_Creacion;
	@Column(name="Fecha_Actualizacion", length=50)
	private String Fecha_Actualizacion;
	
	
	
	public Long getCliente_ID() {
		return Cliente_ID;
	}
	public void setCliente_ID(Long cliente_ID) {
		Cliente_ID = cliente_ID;
	}
	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}
	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}
	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public double getEstatura() {
		return Estatura;
	}
	public void setEstatura(double estatura) {
		Estatura = estatura;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getIMC() {
		return IMC;
	}
	public void setIMC(double iMC) {
		IMC = iMC;
	}
	public double getGEB() {
		return GEB;
	}
	public void setGEB(double gEB) {
		GEB = gEB;
	}
	public double getETA() {
		return ETA;
	}
	public void setETA(double eTA) {
		ETA = eTA;
	}
	public String getFecha_Creacion() {
		return Fecha_Creacion;
	}
	public void setFecha_Creacion(String fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}
	public String getFecha_Actualizacion() {
		return Fecha_Actualizacion;
	}
	public void setFecha_Actualizacion(String fecha_Actualizacion) {
		Fecha_Actualizacion = fecha_Actualizacion;
	}

}
