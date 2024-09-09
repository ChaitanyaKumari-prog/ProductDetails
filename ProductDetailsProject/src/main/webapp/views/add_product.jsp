<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Product</h1>
<form:form action="saveProduct" method="post" modelAttribute="product">
<table>
 <tr>
   <td>Enter Product Name:</td>
   <td><form:input path="name"/></td>
 </tr>
 <tr>
   <td>Enter Price:</td>
   <td><form:input path="price" /></td>
 </tr>
 <tr>
   <td>Enter quantity</td>
   <td><form:input path="quantity"/></td>
 </tr>
 <tr>
 <td colspan="3"> <input type="submit" value="save"></td>
 </tr>
 </table>
</form:form>
</body>
</html>