package ems.erp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ems.erp.util.CBEView;


public class Dept_Emp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Dept_Emp() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String dname = request.getParameter("dname");
		request.setAttribute("dname", dname);
		
		request.getRequestDispatcher(CBEView.Dept_Emp_JSP).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
