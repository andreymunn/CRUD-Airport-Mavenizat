<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Andrei Muntean</title>
</head>
<body>
<h1>Airport - Zboruri Info</h1>
 <form:form action = "zboruri.do" method="POST" commandName="zboruri">
    <table>
         <tr>
             <td>ID zbor</td>
             <td><form:input path="id" /></td>
         </tr>
        
        <tr>
             <td>ORAS Plecare</td>
             <td><form:input path="orasPlecare" /></td>
         </tr>
         
         <tr>
             <td>ORAS Sosire</td>
             <td><form:input path="orasSosire" /></td>
         </tr>
         <tr>
             <td>Ora Plecare</td>
             <td><form:input path="oraPlecare" /></td>
         </tr>
         
         <tr>
             <td>Ora Sosire</td>
             <td><form:input path="oraSosire" /></td>
         </tr>
         <tr>
             <td>Nume Avion</td>
             <td><form:input path="numeAvion" /></td>
         </tr>
         
         <tr>
             <td>Data Plecare</td>
             <td><form:input path="dataPlecare" /></td>
         </tr>
         
         <tr>
             <td>Numar Ruta</td>
             <td><form:input path="numarRuta" /></td>
         </tr>
         
         <tr>
            <td colspan="2">
                <input type="submit" name="action" value="Add">
                <input type="submit" name="action" value="Edit">
                <input type="submit" name="action" value="Delete">
                <input type="submit" name="action" value="Search">
            
            </td>
         
         </tr>
    
    </table>
 
 </form:form>
 <br>
    <table border="1">
         
          <th> ID </th>
          <th> Oras Plecare</th>
          <th> Oras Sosire</th>
          <th> Ora Plecare</th>
          <th> Ora Sosire</th>
          <th> Nume Avion</th>
          <th> Data Plecare </th>
          <th> Numarul Rutei</th>
          <c:forEach items="${zboruriList}" var="zboruri">
              <tr>
                   <td>${zboruri.id}</td>
                   <td>${zboruri.orasPlecare}</td>
                   <td>${zboruri.orasSosire}</td>
                   <td>${zboruri.oraPlecare}</td>
                   <td>${zboruri.oraSosire}</td>
                   <td>${zboruri.numeAvion}</td>
                   <td>${zboruri.dataPlecare}</td>
                   <td>${zboruri.numarRuta}</td>
              </tr>
          </c:forEach>
    </table>
</body>
</html>