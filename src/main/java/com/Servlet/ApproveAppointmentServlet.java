package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.ApproveAppointmentService;
import com.services.ApproveAppointmentServiceImpl;

@WebServlet("/ApproveAppointment")
public class ApproveAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ApproveAppointmentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ApproveAppointmentService appointmentService=new ApproveAppointmentServiceImpl();
		request.setAttribute("list", appointmentService.getApproveAppointments());
		request.getRequestDispatcher("approveAppoientment.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
