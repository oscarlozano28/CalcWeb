/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmal
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    @EJB
    

    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String t1 = request.getParameter("t1");
            String t2 = request.getParameter("t2");
            int a = Integer.parseInt(t1);
            int b = Integer.parseInt(t2);
            String btnSuma = request.getParameter("btnSuma");
            String btnResta = request.getParameter("btnResta");
            String btnMultiplicacion = request.getParameter("btnMultiplicacion");
            String btnDividir = request.getParameter("btnDividir");
            String btnModulo = request.getParameter("btnModulo");
            String btnPotencia = request.getParameter("btnPotencia");
            
            if(btnSuma != null){
                out.println("<h1>Suma = " + calcBean.suma(a, b) + "</h1>");
            }
            if(btnResta != null){
                out.println("<h1>Resta = " + calcBean.resta(a, b) + "</h1>");
            }
            if(btnMultiplicacion != null){
                out.println("<h1>Multiplicación = " + calcBean.multiplicacion(a, b) + "</h1>");
            }
            if(btnDividir != null){
                out.println("<h1>División = " + calcBean.division(a, b) + "</h1>");
            }
            if(btnModulo != null){
                out.println("<h1>Módulo = " + calcBean.modulo(a, b) + "</h1>");
            }
            if(btnPotencia != null){
                out.println("<h1>Cuadrado = " + calcBean.potencia(a) + "</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
