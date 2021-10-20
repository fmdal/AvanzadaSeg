package cotrollers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import negocio.dao.iDAO;
import negocio.dao.factory.AdminsFactory;
import negocio.dominio.Admins;

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

			iDAO<Admins> adminsDAO = AdminsFactory.getImplementation("DB"); 

			if (request.getParameter("accion").equals("alta")) {
				Admins admin = new Admins();

				admin.setUserID(request.getParameter("userID"));
				admin.setTelefono(Long.parseLong(request.getParameter("telefono")));
				admin.setContrasenia(request.getParameter("contrasenia"));
				admin.setNombre(request.getParameter("nombre"));
				admin.setApellido(request.getParameter("apellido"));
				admin.setFechaNac(request.getParameter("fechaNac"));
//				admin.setTelefono(Long.parseLong(request.getParameter("listaViajes")));

				adminsDAO.add(admin);

			} else if (request.getParameter("accion").equals("baja")) {

				adminsDAO.deleteById(request.getParameter("userID"));

			} else if (request.getParameter("accion").equals("modif")) {
				Admins admin = new Admins();

				admin.setUserID(request.getParameter("userID"));
				admin.setTelefono(Long.parseLong(request.getParameter("telefono")));
				admin.setContrasenia(request.getParameter("contrasenia"));
				admin.setNombre(request.getParameter("nombre"));
				admin.setApellido(request.getParameter("apellido"));
				admin.setFechaNac(request.getParameter("fechaNac"));
//				admin.setTelefono(Long.parseLong(request.getParameter("listaViajes")));

				adminsDAO.save(admin);

			} else if (request.getParameter("accion").equals("busca")) {

				Admins cli = (Admins) adminsDAO.findId(Long.parseLong(request.getParameter("userID")));

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
