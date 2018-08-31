package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayServ extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("empId");
		int empId = Integer.parseInt(id);
		
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee em = (Employee) session.get(Employee.class, empId);
		PrintWriter pwr = resp.getWriter();
		pwr.println("Employee Id =" + em.getEmployeeId());
		pwr.println("Employee Name =" + em.getEmployeeName());
		pwr.println("Employee Salary =" + em.getEmployeesalary());
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}
}
