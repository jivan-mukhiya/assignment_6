package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Specialization;
import com.services.SpecializationService;
import com.services.SpecializationServiceImpl;

@WebServlet("/Specialization")
public class SpecializationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SpecializationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("speclialization.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Specialization specialization=new Specialization();
		
		specialization.setCode(request.getParameter("code"));
		specialization.setName(request.getParameter("name"));
		specialization.setNote(request.getParameter("note"));

		SpecializationService  service=new SpecializationServiceImpl();
		service.add(specialization);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
