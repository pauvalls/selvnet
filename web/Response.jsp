

<%@page import="Selvnet.Alumne"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%
        Alumne al= (Alumne)request.getAttribute("alumno"); 
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>informacion del alumno:</h1>
      Alumno:  <%out.println( al.getNom() );%><br>
      codigo:  <%out.println( al.getCodi() ); %><br>
      Asignaturas:  <%out.println( al.getAssignatures() ); %><br>
      tutorias:  <%out.println( al.getTutories() ); %>
            
     
    </body>
</html>
