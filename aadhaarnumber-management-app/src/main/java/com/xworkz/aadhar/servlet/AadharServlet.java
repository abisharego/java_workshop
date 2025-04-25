package com.xworkz.aadhar.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class AadharServlet extends HttpServlet {
    public AadharServlet(){
        System.out.println("Aadhaar Servlet created. Now it can handle the requested responses");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet method invoked");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doPost method invoked");
        String userName=req.getParameter("username");
        System.out.println("User name is: "+userName);
        String aadharNumber=req.getParameter("aadharnumber");
        System.out.println("Aadhaar Card number is: "+aadharNumber);

        PrintWriter write= resp.getWriter();
        resp.setContentType("text/html");
        write.println("<html>");
        write.println("<head>");
        write.println("<title>"+"Aadhar card"+"</title>");
        write.println("</head>");
        write.println("<body>");
        write.println("<h1>"+"Entered details are: "+"</h1>");
        write.println("<h2>"+userName+"</h2");
        write.println("<h2>"+aadharNumber+"</h2");
        write.println("</body>");
        write.println("</html>");
    }
}