package servletlifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifecycle")
public class Sample implements Servlet
{
 public Sample()
 {
	 System.out.println("servlet instance/object is created");
 }
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() method is invoked,establish db connection");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() method invoked, request handled & responseis sint");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("destroy method is invoked & servlet instance is destrouyed");
		
	}

}
