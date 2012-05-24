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
<p><a href="<s:url action='basicPackage/populateVideoDiscs'/>">Populate  VideoDiscs</a></p>
<p><a href="<s:url action='basicPackage/populateAudioDiscs'/>">Populate  AudioDiscs</a></p>
<p><a href="<s:url action='basicPackage/getDiscs'/>">Get Discs</a></p>
<p><a href="<s:url action='basicPackage/populateBooks'/>">Populate Books</a></p>
<p><a href="<s:url action='basicPackage/getBooks'/>">Get Books</a></p>
</body>
</html>