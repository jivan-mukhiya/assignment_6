 package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Appointment;
import com.services.AppointmentService;
import com.services.AppointmentServiceImpl;

@WebServlet("/AppoientServlet")
public class AppoientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AppoientServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("Appointment.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Appointment appointment=new Appointment();
		AppointmentService appointmentService=new AppointmentServiceImpl();
		
		appointment.setConsultationFee(Double.parseDouble(request.getParameter("fee")));
		appointment.setDate(request.getParameter("date"));
		appointment.setDetails(request.getParameter("details"));
		appointment.setDoctor(Integer.parseInt(request.getParameter("doctor")));
		appointment.setSlot(Integer.parseInt(request.getParameter("slots")));
		
		appointmentService.addAppointment(appointment);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
