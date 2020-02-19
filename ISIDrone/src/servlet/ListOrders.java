package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.ActionOrder;
import entities.User;
import manager.MSession;
import util.Const;

/**
 * Servlet implementation class ListOrders
 */
@WebServlet(name = "viewOrders", urlPatterns = { "/ListOrders" })
public class ListOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOrders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = MSession.getSession(request);
		User user=(User)session.getAttribute("user");
		System.out.println(user.getRole());
		if(user.getRole()!="admin") {
			
			response.sendError(403);
		}else {
		ActionOrder.getOrders(request,response);
		request.getRequestDispatcher(Const.PATH_PAGE_LIST_ORDERS).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
