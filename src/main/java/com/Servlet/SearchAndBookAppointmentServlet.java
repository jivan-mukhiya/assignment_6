package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.DoctorService;
import com.services.DoctorServiceImpl;

@WebServlet("/SearchAndBookAppointment")
public class SearchAndBookAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SearchAndBookAppointmentServlet() {
        super();
 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoctorService doctorService=new DoctorServiceImpl();
		
		request.setAttribute("doctor", doctorService.getDoctorList());
			request.getRequestDispatcher("searchAndBookAppointment.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DoctorService doctorService=new DoctorServiceImpl();
		request.setAttribute("doctorList", doctorService.search(request.getParameter("doctor"),
				request.getParameter("Speclialization")));

		request.getRequestDispatcher("searchAndBookAppointment.jsp").forward(request, response);
	}

}
