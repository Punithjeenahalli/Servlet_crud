package servletcrud1.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_crud.dao.StudentDao;
import servlet_crud.dto.StudentDto;

@WebServlet("/insert")
public class Create implements Servlet
{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    String id= req.getParameter("sid");
    String name=req.getParameter("sname");
    String dob=req.getParameter("sdob");
    String email=req.getParameter("semail");
    String gender=req.getParameter("gender");
    String country=req.getParameter("scountry");
    String number=req.getParameter("snumber");
    
//    res.getWriter().print(id+"  "+name);
    
    StudentDto studentDto=new StudentDto();
    int cid=Integer.parseInt(id);
    long cnumber=Long.parseLong(number);
    
    studentDto.setId(cid);
    studentDto.setName(name);
    studentDto.setDob(dob);
    studentDto.setEmail(email);
    studentDto.setGender(gender);
    studentDto.setCountry(country);
    studentDto.setNumber(cnumber);
    
    System.out.println(studentDto);
    
    StudentDao studentDao=new StudentDao();
    String msg=studentDao.insertData(studentDto);
    res.getWriter().print(msg);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
