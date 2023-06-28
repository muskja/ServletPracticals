
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {
    //life cycle methods:
    
    ServletConfig conf;
    public void init(ServletConfig conf)throws  ServletException
    {
        this.conf=conf;
        System.out.println("creating object:...");
    }
    
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Servicing.......");
        //set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is my output from servlet method:</h1>");
        
        
    }
    
    public void destroy()
    {
        System.out.println("going to destroy servlet object");
    }
    
    //non-life cycle methods
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo(){
        return " this servlet is created by Muskan Jain";
    }
    
}
