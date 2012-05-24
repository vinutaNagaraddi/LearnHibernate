<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Hello World!</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<p><a href="<s:url action='basicPackage/populateMessages'/>">Populate Messages</a></p>
<p><a href="<s:url action='basicPackage/populateUsers'/>">Populate Users</a></p>
<p><a href="<s:url action='basicPackage/populateCategories'/>">Populate Categories</a></p>
<p><a href="<s:url action='basicPackage/populateAdverts'/>">Populate Adverts</a></p>
<p><a href="<s:url action='basicPackage/populateCustomers'/>">Populate Customers</a></p>
<p><a href="<s:url action='basicPackage/getCustomer'/>">Get customer</a></p>
<p><a href="<s:url action='basicPackage/populateAddresses'/>">Populate Addresses</a></p>
<p><a href="<s:url action='basicPackage/populateOrders'/>">Populate Orders</a></p>
</body>
</html>