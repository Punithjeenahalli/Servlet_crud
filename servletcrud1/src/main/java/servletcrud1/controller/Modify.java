package servletcrud1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
import servlet_crud.dto.StudentDto;

@WebServlet("/update")
public class Modify extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	    String id= req.getParameter("sid");
	    String name=req.getParameter("sname");
	    String dob=req.getParameter("sdob");
	    String email=req.getParameter("semail");
	    String gender=req.getParameter("sgender");
	    String country=req.getParameter("scountry");
	    String number=req.getParameter("snumber");
	    
	    int cid=Integer.parseInt(id);
	    long cnumber=Long.parseLong(number);
	    
	    StudentDto studentDto=new StudentDto();
	    
	    studentDto.setId(cid);
	    studentDto.setName(name);
	    studentDto.setDob(dob);
	    studentDto.setEmail(email);
	    studentDto.setGender(gender);
	    studentDto.setCountry(country);
	    studentDto.setNumber(cnumber);
	    
	    
	    StudentDao studentDao=new StudentDao();
	    String msg=studentDao.updateData(studentDto);
	    resp.getWriter().print(msg);
}
}
