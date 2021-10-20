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
import negocio.dao.factory.ClientesFactory;
import negocio.dominio.Admins;
import negocio.dominio.Clientes;
import negocio.dominio.Trayectos;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/DestinoController")
public class DestinoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DestinoController() {
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

		String trayecto;

		if (request.getParameter("accion") != null) {

			iDAO<Destino> destinoDAO = DestinoFactory.getImplementation("DB"); 

			if (request.getParameter("accion").equals("alta")) {
				Trayectos trayecto = new Trayectos();

				trayecto.setTrayectoID(request.getParameter("trayectoID"));
				trayecto.setOrigen(request.getParameter("origen"));
				trayecto.setDestino(request.getParameter("destino"));
				trayecto.setDistancia(Float.parseFloat(request.getParameter("distancia")));
		

				
//				admin.setTelefono(Long.parseLong(request.getParameter("listaViajes")));

				destinoDAO.add(destino);

			} else if (request.getParameter("accion").equals("baja")) {

				destinoDAO.deleteById(request.getParameter("userID"));

			} else if (request.getParameter("accion").equals("modif")) {
				Trayectos trayecto = new Trayectos();

				trayecto.setTrayectoID(request.getParameter("trayectoID"));
				trayecto.setOrigen(request.getParameter("origen"));
				trayecto.setDestino(request.getParameter("destino"));
				destino.setDistancia(Float.parseFloat(request.getParameter("distancia")));

				trayectosDAO.save(trayecto);

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
