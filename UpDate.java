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

public class UpDate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("empId");
		String name = req.getParameter("empname");
		String salary = req.getParameter("empsalary");
		int empId = Integer.parseInt(id);
		int empSalary = Integer.parseInt(salary);
       Configuration c = new Configuration();
       c.configure();
       SessionFactory sf = c.buildSessionFactory();
       Session session = sf.openSession();
       Employee em = new Employee();
       em.setEmployeeId(empId);
       em.setEmployeeName(name);
       em.setEmployeesalary(empSalary);
       session.beginTransaction();
       session.update(em);
       PrintWriter pw = resp.getWriter();
       pw.println("New Emplolyee Record Updated with Employee Id" + empId);
       session.getTransaction().commit();
       session.close();
       sf.close();
       
		
		
		
	}
	
    }
 

