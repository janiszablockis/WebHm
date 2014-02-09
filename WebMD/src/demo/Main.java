package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class Main  extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hellow!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Hellow WORLD! </h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
