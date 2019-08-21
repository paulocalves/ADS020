<%-- 
    Document   : meujsp
    Created on : 14/08/2019, 20:19:10
    Author     : 18114290041
--%>

<%@page import="sun.tools.jar.resources.jar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% java.util.Date dataAtual = new java.util.Date(); 
            String nome = "José";
            
            meupacote.MinhaClasse classe = new meupacote.MinhaClasse();
            int x = classe.getAtributo();
        %>
        <%=dataAtual%>
    </body>
</html>
