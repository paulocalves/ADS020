/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 18114290041
 */
@WebServlet(name="MeuServlet", urlPatterns = "/meuservlet")
public class MeuServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sessao = req.getSession();
        System.out.println("Variavel na Sessão: " + sessao.getAttribute("nome"));
        System.out.println("Chamou o doGet()");
        sessao.setAttribute("nome", "Paulo Cezar");
        
        PrintWriter out = resp.getWriter();
        out.print("Olá: " + sessao.getAttribute("nome"));
        
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Chamou o init()");
    }

    @Override
    public void destroy() {
        System.out.println("Chamou o destroy()");

    }
    
    
    
    
    
}
