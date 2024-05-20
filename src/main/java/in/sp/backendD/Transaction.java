package in.sp.backendD; //My Package.

//Import necessary Java libraries
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

//servlet and map it to the url pattern.
@WebServlet("/transForm")
public class Transaction extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out = resp.getWriter(); // get a PrintWriter for sending responses to the customer.

		// Retrieve form data from the http request.
		String mysnumber = req.getParameter("sNum");
		String myamount = req.getParameter("amount");
		String mydate = req.getParameter("tdate");
		String mypurpose = req.getParameter("purPay");
		String myremarks = req.getParameter("remarks");
		String mybnumber = req.getParameter("bNum");
		String mybankname = req.getParameter("bankName");
		String mybranch = req.getParameter("branch");
		String mybname = req.getParameter("bname");
		String myemail = req.getParameter("bemail");
	
		
		
		try {
			
			// Load the MySQL jdbc driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish a database connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb","root","senithpete104");
			
			// prepare a SQL statement for inserting data into a table.
			PreparedStatement ps = con.prepareStatement("INSERT INTO transactiondetails VALUES(0,?,?,?,?,?,?,?,?,?,?)");
			
			// set parameters for the SQL statement.
			ps.setString(1, mysnumber);
			ps.setString(2, myamount);
			ps.setString(3, mydate);
			ps.setString(4, mypurpose);
			ps.setString(5, myremarks);
			ps.setString(6, mybnumber);
			ps.setString(7, mybankname);
			ps.setString(8, mybranch);
			ps.setString(9, mybname);
			ps.setString(10, myemail); 
			
			
			// execute the SQL statement and get the number of affected rows.
			int count = ps.executeUpdate();
			if(count > 0) {
				
				resp.setContentType("text/html");
				
				// if the transaction was successful, forward to a success page.
				RequestDispatcher rd = req.getRequestDispatcher("/domesticTransSuccess.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'> Transaction has been cancelled due to an error </h3>");
				
				// if the transaction failed, display an error message and redirect back to the trasaction.jsp page.
				RequestDispatcher rd = req.getRequestDispatcher("/transaction.jsp");
				rd.include(req, resp);
			}
		}
		
		catch(Exception e) {
			
			 // handle any exceptions that may occur, display an error message, and redirect back to the form.
			e.printStackTrace();
			
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception occurred : "+e.getMessage()+" </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/transaction.jsp");
			rd.include(req, resp);
			
		}
}
	
}
