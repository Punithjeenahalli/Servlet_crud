package servletcrud1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud.dao.StudentDao;

@WebServlet("/dall")
public class DeleteAll extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	 
	StudentDao studentDao = new StudentDao();
	String msg=studentDao.deleteAll();
	resp.getWriter().print(msg);
}
}
