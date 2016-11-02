<%@page import="java.sql.SQLException"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page XML</title>
    </head>
    <body> 
        <%
            try{
            ServletOutputStream stream = null;
            BufferedInputStream buf = null;
            String contextPath = getServletContext().getRealPath("/");
            String xmlFilePath = contextPath + "xml.xml";
            stream = response.getOutputStream();
            File xml = new File(xmlFilePath);
            response.setContentType("text/xml");
            FileInputStream input = new FileInputStream(xml);
            buf = new BufferedInputStream(input);
            int readBytes;
            //read from the file; write to the ServletOutputStream
            while ((readBytes = buf.read()) != -1) {
                stream.write(readBytes);
            }
            stream.close();
            buf.close();
            }catch(Exception e){
            
            }

        %>
    </body> 
</html>