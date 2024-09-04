package com.Servlet;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Doctor;
import com.model.Specialization;
import com.services.DoctorService;
import com.services.DoctorServiceImpl;
import com.services.SpecializationService;
import com.services.SpecializationServiceImpl;

@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DoctorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SpecializationService service=new SpecializationServiceImpl();
		HashSet<Specialization> specialization=service.getAll();
		request.setAttribute("list", specialization);
		request.getRequestDispatcher("Doctor.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Doctor doctor=new Doctor();
		DoctorService  doctorService=new DoctorServiceImpl();
		
		doctor.setName(request.getParameter("name"));
		doctor.setAddress(request.getParameter("address"));
		doctor.setEmialId(request.getParameter("email"));
		doctor.setGender(request.getParameter("Gender"));
		doctor.setMobile(request.getParameter("number"));
		doctor.setNote(request.getParameter("note"));
		doctor.setPhoto(request.getParameter("photo"));
		doctor.setSpecialization(request.getParameter("Speclialization"));
		
		doctorService.add(doctor);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	}

}
