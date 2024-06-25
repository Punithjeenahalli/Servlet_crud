package servletcrud1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;
import servlet_crud.dto.StudentDto;

@WebServlet("/fall")
public class FetchAll extends HttpServlet
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	
//	StudentDao studentDao=new StudentDao();
//	List<StudentDto> list = studentDao.fetchAll();
//	resp.getWriter().print(list);
//	
	
	// to fetch record in table formate
	
	StudentDao studentDao=new StudentDao();
	List<StudentDto> list = studentDao.fetchAll();
	
	 req.setAttribute("abc", list);
	
	RequestDispatcher rd=req.getRequestDispatcher("fetchall.jsp");
	 rd.forward(req, resp);
}
}
