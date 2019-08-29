/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

/**
 *
 * @author 18114290041
 */
@WebServlet(name = "IncluirAlunoServlet", urlPatterns = {"/aluno/incluir"})
public class IncluirAlunoServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de Alunos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Incluir Aluno</h1>");
        out.println("<form action=" + response.encodeURL("/Atividade05/aluno/incluir ") + " method='post'>");
        out.println("<div>");
        out.println("<label>Matrícula:</label>");
        out.println("<input type='text' name='matricula' size='15'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label>Nome:</label>");
        out.println("<input type='text' name='nome' size='30'>");
        out.println("</div>");
        out.println("<input type='submit' value='Salvar'/>");
        out.println("<a href=" + response.encodeURL("/Atividade05/aluno") + ">Desistir</a>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

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
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
        aluno.setNome(request.getParameter("nome"));
        
        AlunoBO bo = new AlunoBO();
              
            try {
                bo.incluir(aluno);
            } catch (NegocioException ex) {
                throw new ServletException("Erro ao Incluir", ex);
            }
      
           response.sendRedirect(request.getContextPath()+"/aluno");

        
      
        
        
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
