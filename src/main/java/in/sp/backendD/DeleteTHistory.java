package in.sp.backendD; //my package

//java libraries.
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

//servlet and map it to a url pattern.
@WebServlet("/deleteTForm")
public class DeleteTHistory extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get a PrintWriter for send responses to the bank customer.
		PrintWriter out = resp.getWriter();
		
		//get tid parameter from the request.
		String mytid = req.getParameter("tid");

		try {
			
			//load MYSQL jdbc driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb","root","senithpete104");
			
			//prepare SQL statement to delete transaction history by entering the specific tid.
			PreparedStatement ps = con.prepareStatement("delete from transactiondetails where tid=?");
			ps.setString(1, mytid);
			 
			//execute the SQL statement and get the number of affected rows.
			int count = ps.executeUpdate();
			if(count > 0) {
				
				//if the deletion was successful, display a success message.
				resp.setContentType("text/html");
				
				//forward request to transactionReceipt,jsp page.
				RequestDispatcher rd = req.getRequestDispatcher("/deleteSuccess.jsp");
				rd.include(req, resp);
			}
			else {
				//if the deletion failed display an error message.
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'> Deletion has been cancelled due to an error </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/transactionReceipt.jsp");
				rd.include(req, resp);
			}
		}
		
		catch(Exception e) {
			//handle any exceptions that may occur, display an error message
			e.printStackTrace();
			
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception occurred : "+e.getMessage()+" </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/transactionReceipt.jsp");
			rd.include(req, resp);
			
		}
}
	
}
