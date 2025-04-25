package com.xworkz.playo.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class PlayoServlet extends HttpServlet {

    public PlayoServlet() {
        System.out.println("Playo Servlet created. Now it can handle the requested responses");

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doGet method invoked");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doPost method invoked");

        String userName = req.getParameter("username");
        String email = req.getParameter("email");
        String number = req.getParameter("number");
        String numPlay = req.getParameter("num_play");
        String costStr = req.getParameter("cost");

        int plays = 0;
        double cost = 0.0;
        double totalAmount = 0.0;

        try {
            plays = Integer.parseInt(numPlay);
            cost = Double.parseDouble(costStr);
            totalAmount = plays * cost;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in input: " + e.getMessage());
        }

        resp.setContentType("text/html");
        PrintWriter write = resp.getWriter();

        write.println("<html>");
        write.println("<head><title>Playo</title></head>");
        write.println("<body>");
        write.println("<h1>Entered details are:</h1>");
        write.println("<h2>Username: " + userName + "</h2>");
        write.println("<h2>Email: " + email + "</h2>");
        write.println("<h2>Phone Number: " + number + "</h2>");
        write.println("<h2>Number of Players: " + numPlay + "</h2>");
        write.println("<h2>Total Amount: " + totalAmount + "</h2>");
        write.println("</body>");
        write.println("</html>");
    }
}
