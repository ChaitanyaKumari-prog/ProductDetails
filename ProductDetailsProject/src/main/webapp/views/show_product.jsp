<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.nareshit.entity.ProductEntity" %>
 <%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<%List<ProductEntity> products=(List<ProductEntity>)request.getAttribute("allproducts");
if(products.size()==0){%>
 No More Products here...
<%} 
%>
<tr>
 <th>Product Id</th>
 <th>Product Name</th>
 <th>Price</th>
 <th>Quantity</th>
</tr>
<%for(ProductEntity product:products){ %>
<tr>
  <td><%=product.getId() %></td>
  <td><%=product.getName() %></td>
  <td><%=product.getPrice() %></td>
  <td><%=product.getQuantity() %></td>
</tr>
<%} 
%>

</table>
</body>
</html>