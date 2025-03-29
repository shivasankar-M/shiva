package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.dao.jobdao;
import com.model.jobrecord;

/**
 * Servlet implementation class Registerservlet
 */

@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name =request.getParameter("name");
         String email=request.getParameter("email");
         String mobile=request.getParameter("mobile");
    	 String collegename=request.getParameter("clgname");
    	 String degree=request.getParameter("degree");
    	 int yearofgraduation=Integer.parseInt(request.getParameter("yog"));
    	 String applyrole=request.getParameter("role");
    	 int experience=Integer.parseInt(request.getParameter("exp"));
    	 int currentctc=Integer.parseInt(request.getParameter("ctc"));
    	int expctc=Integer.parseInt(request.getParameter("expctc"));
    	 String noticeperiod=request.getParameter("nop");
    	 String skillset=request.getParameter("skill");
    	 String address=request.getParameter("add");
    	 String nativedist=request.getParameter("natd");
    	 String state=request.getParameter("stat");
    	String nationality=request.getParameter("nation");
    	
    	jobrecord jr=new jobrecord();
    	
    	jr.setName(name);
    	jr.setEmail(email);
    	jr.setMobile(mobile);
    	jr.setCollegename(collegename);
    	jr.setDegree(degree);
    	jr.setYearofgraduation(yearofgraduation);
    	jr.setApplyrole(applyrole);
    	jr.setExperience(experience);
    	jr.setCurrentctc(currentctc);
    	jr.setExpctc(expctc);
    	jr.setNoticeperiod(noticeperiod);
    	jr.setSkillset(skillset);
    	jr.setAddress(address);
    	jr.setNativedist(nativedist);
    	jr.setState(state);
    	jr.setNationality(nationality);
    	
    	jobdao jdao=new jobdao();
    	
    	int count=jdao.addUser(jr);
    	
    	
    	
    	
   	if (count != 0) {
    out.println("<h1 style='color:green'>" + count + " Record successfully inserted</h1>");
       } else {
           out.println("<h1 style='color:red'>Record Not inserted</h1>");
        }
       dispatcher = request.getRequestDispatcher("submit.jsp");
       dispatcher.forward(request, response);
        
	}

}
