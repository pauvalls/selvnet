

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Selvnet.Alumne"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%
        ResultSet al= (ResultSet)request.getAttribute("alumno"); 
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>informacion del alumno:</h1>
        <%
            Alumne alu=new Alumne();
            try{
              while (al.next()) {
               
                alu.setNom(al.getString("nombre"));
                alu.setCodi(al.getInt("codigo"));
                alu.setAssignatures(al.getString("nomassignatura"));
                alu.setTutories(al.getString("nomtutoria"));

            }}catch (SQLException e){}
          %>  
     
          
          Alumno:  <%out.println( alu.getNom() );%><br>
      codigo:  <%out.println( alu.getCodi() ); %><br>
      Asignaturas:  <%out.println( alu.getAssignatures() ); %><br>
      tutorias:  <%out.println( alu.getTutories() ); %><br>
      
      
     
      <form method="POST" action="${pageContext.request.contextPath}/xmlpost" >
          
          <input  Style="display: none" name="boton"  value="<%=alu.getCodi()%>"/><input type="submit" value="xml" /></form>
    </body>
    
</html>
