package com.nit.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MirrageServlet extends HttpServlet
{

	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException {
		PrintWriter pw=null;
		String name=null,gender=null;
		int age =0;
		boolean status=false;
		
  pw=res.getWriter();
  res.setContentType("text/html");  //what type of res we want to generate that instructions giving by html
  	//read form data
  name=req.getParameter("pname");
  age=Integer.parseInt(req.getParameter("page"));
  gender=req.getParameter("gen");
   
  //write b. logic
  if(gender.equalsIgnoreCase("M"))
	  status=age>=21?true:false;
	  
	  else
	  status=age>=18?true:false;
	if(status)
	{
		 pw.println("<h1 style='color:green'>Mr/miss...."+name+"u r eligible to get mairrage bt think twice");
	     System.out.println(status);
	}
	     else
	     {
	pw.println("<h1 style='color:red'>Mr/miss...."+name+"u r not eligible to get mairrage.plz have patience");
	     }
	pw.println("<a href='Input.html'>Home</a>");
	
	//close stream
	pw.close();
		  
	  }
		}
 

