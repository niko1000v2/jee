package com.itcrowd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SesjaLicznik
 */
@WebServlet("/SesjaLicznik")
public class SesjaLicznik extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SesjaLicznik() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8"); 
		HttpSession sesja = request.getSession();  
		
		if (sesja.isNew()) {
			response.getWriter().println("NOWA SESJA");			
		}
		 response.getWriter().println("<A HREF='SesjaLicznik?kasuj=tak'><BR>KASUJ SESJĘ</a><br>");	 
		 response.getWriter().println("<A HREF='SesjaLicznik'><BR>ODŚWIEŻ BEZ KASOWANIA SESJI</a><br>");
	
		 if (request.getParameter("kasuj")!=null )
				// if (request.getParameter("kasuj").equals("tak"))
				{
					sesja.invalidate(); //kasujemy sesję
					response.getWriter().println("SESJA SKASOWANA !");											
				}
		else { 
		Object atrybutLicznik = sesja.getAttribute("licznik");  
		
		int licznik = 0;  if (atrybutLicznik != null)   
			licznik = Integer.parseInt(atrybutLicznik.toString());  
		sesja.setAttribute("licznik", ++licznik); 
		
		
		response.getWriter().println("Licznik odwiedzin: " + licznik); 
	 }
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

