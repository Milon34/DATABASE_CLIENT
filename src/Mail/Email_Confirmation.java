package Mail;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Asus on 2/21/2020.
 */
public class Email_Confirmation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String emailcode=request.getSession().getAttribute("Confirmation_code").toString();
        String code= request.getParameter("confirm_code");
        if (code.equalsIgnoreCase(emailcode)){
            //String message="Welcome ! Registration Successfully";
            //request.setAttribute("message",message);
            request.getRequestDispatcher("Success.jsp").forward(request,response);
        }
        else {
            //String message="Wrong code";
            //request.setAttribute("message",message);
            request.getRequestDispatcher("ConfirmationEmail.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
