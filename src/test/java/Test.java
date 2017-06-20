import java.sql.SQLException;

import cl.kevinzambrano.app.core.Producto;
import cl.kevinzambrano.app.dao.DaoProducto;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		DaoProducto daoProducto = new DaoProducto();
		
		for(Producto p: daoProducto.getProductos()){
			System.out.println(p.getNombre());
		}
	}

}
