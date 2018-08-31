package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete extends HttpServlet{

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("empId");
		int empId = Integer.parseInt(id);
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Employee em = new Employee();
		em.setEmployeeId(empId);
		Query query = session.createQuery("delete from employee where employeeId = 'empId'");
	    session.beginTransaction();
	    session.delete(em);
	    PrintWriter pw = resp.getWriter();
	    pw.println("New Employee Record Deleted with Employee Id" + empId );
	    session.getTransaction().commit();
	    session.close();
	    sf.close();
	}
	    
}
