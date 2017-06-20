package cl.kevinzambrano.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import cl.kevinzambrano.app.conexion.ConexionBD;
import cl.kevinzambrano.app.core.Producto;

public class DaoProducto {
	
	public ConexionBD conn = ConexionBD.getInstancia();
	public PreparedStatement consulta;
	public ResultSet rst;
	
	public List<Producto> getProductos() throws SQLException{
		try{
			consulta = (PreparedStatement) conn.getConnection().prepareStatement("select * from producto");
			rst = consulta.executeQuery();
			List<Producto> productos = new ArrayList<Producto>();
			while(rst.next()){
				productos.add(parser(rst));
			}
			return productos;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return null;
		}finally{
			consulta.close();
			rst.close();
		}
	}
	
	private Producto parser(ResultSet rst) throws SQLException{
		Producto producto = new Producto();
		
		producto.setId_producto(rst.getInt("id_producto"));
		producto.setNombre(rst.getString("nombre"));
		producto.setPrecio(rst.getInt("precio"));
		producto.setFecha_elaboracion(rst.getDate("fecha_elaboracion"));
		producto.setFecha_vencimiento(rst.getDate("fecha_vencimiento"));
		producto.setEstado(rst.getString("estado"));
		
		return producto;
	}
}
