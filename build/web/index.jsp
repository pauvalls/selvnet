

<%@page import="Selvnet.Alumne"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%
        ArrayList lista= (ArrayList)request.getAttribute("Arraylist"); 
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>informacion del alumno</h1>
        <form method="POST" action="" >    
            <select id="selector" name="selector">
                
        <%
            Alumne alaux;
        for(int i=0;i<lista.size();i++){
            alaux=(Alumne)lista.get(i);
        %><option  value="<%=alaux.getCodi()%>"><% out.println(lista.get(i).toString());%></option><%   }

        %>
       </select>
       
       <input type="submit" value="enviar"/>
        </form >
     
    </body>
</html>
