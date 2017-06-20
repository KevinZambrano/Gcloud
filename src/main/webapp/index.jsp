<%@page import="cl.kevinzambrano.app.core.Producto"%>
<%@page import="cl.kevinzambrano.app.dao.DaoProducto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<th>Nombre</th>
			<th>Precio</th>
			<th>Fecha elaboracion</th>
			<th>fecha Vencimiento</th>
			<th>Estado</th>
		</thead>
		<%
			DaoProducto daoProducto = new DaoProducto();
			for (Producto p : daoProducto.getProductos()) {
		%>
		<tbody>
			<tr>
				<td><%=p.getNombre()%></td>
				<td><%=p.getPrecio()%></td>
				<td><%=p.getFecha_elaboracion()%></td>
				<td><%=p.getFecha_vencimiento()%></td>
				<td><%=p.getEstado()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>