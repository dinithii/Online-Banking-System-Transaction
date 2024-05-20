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
import javax.servlet.http.HttpSession;

//servlet and map it to the url pattern.
@WebServlet("/editFAQ")
public class editFAQstaff extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		String myquestion = req.getParameter("question");
		String myanswer = req.getParameter("answer");
		String myfaqid = req.getParameter("faqid");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb","root","senithpete104");
			
			//update SQL statement
			PreparedStatement ps = con.prepareStatement("update manage_faq set fQuestion=?,fAnswer=? where fid='"+myfaqid+"'");
			
			ps.setString(1, myquestion);
			ps.setString(2, myanswer);
			 
			
			int count = ps.executeUpdate();
			if(count > 0) {
				
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'> Update has been successful </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/updateSuccess.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'> Update has been cancelled due to an error </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/faqValidation.jsp");
				rd.include(req, resp);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
			//exception handling.
			
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception occurred : "+e.getMessage()+" </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/faqValidation.jsp");
			rd.include(req, resp);
			
		}
}
	
}

