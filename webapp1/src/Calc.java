

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1 align= 'center'>Output of Calculator</h1>");
		out.println("<body bgcolor='pink'></body>");
		String n1= request.getParameter("n1");
		String n2= request.getParameter("n2");
		String ch= request.getParameter("ch");
		
		int a= Integer.parseInt(n1);
		int b= Integer.parseInt(n2);
		
		switch(ch)
		{
			case "ADD":
				out.println("Add is :"+(a+b));
				break;
			case "SUB":
				out.println("Sub is :"+(a-b));
				break;
			case "MUL":
				out.println("Mul is :"+(a*b));
				break;
			case "DIV":
				try{
				out.println("Div is :"+(a/b));
				}
				catch(Exception e)
				{
					out.println("Can't divide by zero");
				}
				break;
				
		}		
					
		}
}


