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
import negocio.dao.factory.CamionesFactory;
import negocio.dominio.Admins;
import negocio.dominio.Camiones;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/CamionesController")
public class CamionesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CamionesController() {
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

			iDAO<Camiones> camionesDAO = CamionesFactory.getImplementation("DB"); 

			if (request.getParameter("accion").equals("alta")) {
				Camiones camion = new Camiones();

				admin.setPatente(request.getParameter("patente"));
				admin.setContrasenia(request.getParameter("contrasenia"));
				admin.setTanqueNafta(Double.parseDouble(request.getParameter("telefono")));
				admin.setPesoMax(Double.parseDouble(request.getParameter("pesoMax")));
				admin.setLitrosxKm(Double.parseDouble(request.getParameter("listrosxKm")));

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
