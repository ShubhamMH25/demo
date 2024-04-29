package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServer
 */
@WebServlet("/welcome")
public class WelcomeServer extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
	  response.setContentType("Text/Html");	
	  PrintWriter out=response.getWriter();
	  out.println("<html>");
	  out.println("<body>");
	  out.println("<font colour='red' size='7'>");
	  out.println("<b>");
	  out.println("Welcome to coding World");
	  out.println("</b> <hr> </font> </body> </html>");
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
}

	
	
	


