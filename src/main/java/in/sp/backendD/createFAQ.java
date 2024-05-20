package in.sp.backendD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/faqForm")
public class createFAQ extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();

		String myquestion = req.getParameter("question");
		String myanswer = req.getParameter("answer");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb","root","senithpete104");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO manage_faq VALUES(0,?,?)");
			
			
			ps.setString(1, myquestion);
			ps.setString(2, myanswer);

			int count = ps.executeUpdate();
			if(count > 0) {
				
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>FAQ insertion has been successful</h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/manageFAQ.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'> FAQ insertion has been cancelled due to an error </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/manageFAQ.jsp");
				rd.include(req, resp);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception occurred : "+e.getMessage()+" </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/manageFAQ.jsp");
			rd.include(req, resp);
			
		}
}
	
}
