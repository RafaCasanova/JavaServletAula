package mananger;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;


/*
 * Servlet implementation class NewCompanyServlet
 */

@WebServlet("/NewCompany")
public class NewCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NewCompanyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void service(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		String nomeDaEmpresa = request.getParameter("nome");// ao colocar ?nome= e o nome que deseja, ele retorna no html
		PrintWriter out = response.getWriter();//envia resposta para requisição
		out.println("<html><body>subiu " + nomeDaEmpresa + " </body></html>");
	}

}
