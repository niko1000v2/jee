package com.itcrowd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WybierzAuto
 */
@WebServlet("/WybierzAutora")
public class WybierzAutora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WybierzAutora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String autor = request.getParameter("autor");
		String[] godzina = request.getParameterValues("godzina");
		
		StringBuffer temp = new StringBuffer();
		
		System.out.println(autor);
		for ( String element : godzina) {
		System.out.println(element);
		temp.append("<div class=\"paragraph\"><p>"+element+"</p></div>");
		
		}
				
		request.setAttribute("autor", autor);
		request.setAttribute("godzina", temp);
		request.getRequestDispatcher("wybor.jsp").forward(request, response);
		//request.set
	}

}
