/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selvnet;

import generated.Alumno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author pauva
 */
@WebServlet(name = "xmlpost", urlPatterns = {"/xmlpost"})
public class xmlpost extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet xmlpost</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet xmlpost at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextpath = getServletContext().getRealPath("/");
        String xmlpath = contextpath + "xml.xml";
        File archivo = new File(xmlpath);
        StringWriter sw = new StringWriter();
        try {
            //
            int codi;
            codi = Integer.parseInt(request.getParameter("boton"));
            response.setContentType("text/html;charset=UTF-8");
            //se crea un objeto SQLConnection
            SQLConnection con = new SQLConnection();
            //se crea un objeto connection con los datos del SQLConnection
            Connection conn = con.conectar();
            //se genera una consulta  y se guarda en el resultset
            ResultSet rs = con.executequery("select alumne.nom as nombre,alumne.codi as codigo,tutoria.nom as nomtutoria, assignatura.nom as nomassignatura"
                    + " from alumne inner join tutoriaalumne on tutoriaalumne.codiAlumne= alumne.codi INNER join tutoria on tutoria.codi=tutoriaalumne.codiTutoria"
                    + " INNER join assignatura on assignatura.codi=tutoria.codiAssignatura where alumne.codi=" + codi + " group by assignatura.codi", conn);
            Alumne al = new Alumne();
            while (rs.next()) {
                al.setNom(rs.getString("nombre"));
                al.setCodi(rs.getInt("codigo"));
                al.setAssignatures(rs.getString("nomassignatura"));
                al.setTutories(rs.getString("nomtutoria"));

            }
            Alumno alumjax = new Alumno();
            alumjax.setNombre(al.getNom());
            alumjax.setCodi(al.getCodi());
            alumjax.setAsignaturas(al.getAssignatures());
            alumjax.setTutorias(al.getTutories());
            objectToXml(alumjax, archivo, sw);
            rs.beforeFirst();

       

            
            RequestDispatcher a = request.getRequestDispatcher("/xmlfile.jsp");
            a.forward(request, response);

            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(xmlpost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void objectToXml(Alumno al, File archivo, StringWriter sw) {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Optional
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Do the job
            jaxbMarshaller.marshal(al, archivo);
            jaxbMarshaller.marshal(al, sw);
            //Optional: output pretty printed
            jaxbMarshaller.marshal(al, System.out);
        } catch (JAXBException e) {
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
