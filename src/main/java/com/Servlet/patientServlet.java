package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Patient;
import com.services.PatientServices;
import com.services.PatientServicesImpl;

@WebServlet("/patientServlet")
public class patientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public patientServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("patient.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");

		Patient patient=new Patient();
		
		patient.setName(fname+" "+lname);
		patient.setGender(request.getParameter("Gender"));
		patient.setDob(request.getParameter("dob"));
		patient.setMarrialStatus(request.getParameter("married_status"));
		patient.setPresentAddress(request.getParameter("present_address"));
		patient.setCommunicationAddress(request.getParameter("communication_address"));
		patient.setPastMedicalHistory(request.getParameter("history"));
		patient.setOtherDeatils(request.getParameter("other"));
		patient.setPhone(request.getParameter("phone"));
		
		PatientServices patientServices=new PatientServicesImpl();
		patientServices.add(patient);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
