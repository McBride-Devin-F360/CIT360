import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class EchoServlet extends HttpServlet {

 @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {

    response.setContentType("text/html; charset=UTF-8");

 Try{   

String name = request.getParameter("name");
         
         if (username == null
               || (username = htmlFilter(username.trim())).length() == 0) {
            out.println("<p>Name: MISSING</p>");
         } else {
            out.println("<p>Name: " + name + "</p>");
         }

String username = request.getParameter("username");
         
         if (username == null
               || (username = htmlFilter(username.trim())).length() == 0) {
            out.println("<p>Name: MISSING</p>");
         } else {
            out.println("<p>Username: " + username + "</p>");
         }

String password = request.getParameter("password");
         if (password == null
               || (password = htmlFilter(password.trim())).length() == 0) {
            out.println("<p>Password: MISSING</p>");
         } else {
            out.println("<p>Password: " + password + "</p>");
         }

}
}
}