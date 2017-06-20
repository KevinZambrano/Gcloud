package cl.kevinzambrano.app.core;

import java.sql.Date;

public class Producto {

	private int id_producto;
	private String nombre;
	private int precio;
	private Date fecha_elaboracion;
	private Date fecha_vencimiento;
	private String estado;

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Date getFecha_elaboracion() {
		return fecha_elaboracion;
	}

	public void setFecha_elaboracion(Date fecha_elaboracion) {
		this.fecha_elaboracion = fecha_elaboracion;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Producto() {
		super();
	}

	public Producto(int id_producto, String nombre, int precio, Date fecha_elaboracion, Date fecha_vencimiento,
			String estado) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_elaboracion = fecha_elaboracion;
		this.fecha_vencimiento = fecha_vencimiento;
		this.estado = estado;
	}

}
