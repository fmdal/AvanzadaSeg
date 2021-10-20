package cotrollers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import negocio.dao.iDAO;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public UsersController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String destino;

		if (request.getParameter("accion") != null) {

			iDAO<Clientes> clienteDAO = ClientesFactory.getImplementation("BD");

			if (request.getParameter("accion").equals("alta")) {
			} else if (request.getParameter("accion").equals("baja")) {
			} else if (request.getParameter("accion").equals("modif")) {
			} else if (request.getParameter("accion").equals("busca")) {
			} else {
				request.getSession().setAttribute("Error", "Tipo de accion incorrecta");
				destino = "error.jsp";
			}

		} else {
			request.getSession().setAttribute("Error", "Se requiere que haya una accion");
			destino = "error.jsp";
		}

		request.getRequestDispatcher(destino).forward(request, response);
	}

}
