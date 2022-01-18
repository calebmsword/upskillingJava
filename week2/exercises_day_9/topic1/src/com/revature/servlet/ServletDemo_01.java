package com.revature.servlet;

import java.io.PrintWriter;

@WebServlet(name = "ServletDemo_01", urlPatterns = "/sd1")
public class ServletDemo_01 {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>servlethome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Welcome to Servlet World!!!</h2>");
        out.println("Name: "+name);
        out.println("Email: "+email);
        out.println("Learning servlet is fun!");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
