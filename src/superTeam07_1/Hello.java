package superTeam07_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().println("Sina lisa siia rida success! ");
		response.getWriter().println("Minu success rida !!!");

		
		response.getWriter().println("Sina lisa siia rida success!2222 ");

		response.getWriter().println("Hetkel minu viimane katse");

		response.getWriter().println("OK");

		
	}

}
