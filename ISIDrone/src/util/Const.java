package util;

import javax.naming.InitialContext;

public class Const {
	
	public static String COMP_NAME = "Isi Drone";
	
	/*********
	 * Paths *
	 *********/
	
	// Private
	public static String PATH_PRIVATE = "/WEB-INF/";
	
	private static String PATH_INCLUDES = PATH_PRIVATE +  "includes/";
	
	private static String PATH_GLOBAL_INCLUDES = PATH_INCLUDES +  "_global/";
	private static String PATH_INDEX_INCLUDES = PATH_INCLUDES +  "index/";
	
	// Public
	
	// Global
	public static String PATH_IMG = "images/";
	public static String PATH_IMG_PRODUCT ="images/products/";
	
	public static String PATH_HEAD_JSP = PATH_GLOBAL_INCLUDES + "head.jsp";			// <head>
	public static String PATH_FOOTER_JSP = PATH_GLOBAL_INCLUDES + "footer.jsp";		// Footer
	public static String PATH_MENU_JSP = PATH_GLOBAL_INCLUDES + "menu.jsp";			// Menu
	public static String PATH_CART_DROPDOWN_JSP = PATH_GLOBAL_INCLUDES + "cart_dropdown.jsp";			// Menu
	public static String PATH_CATEGORY_JSP = PATH_GLOBAL_INCLUDES + "category.jsp";
	
	public static String PATH_PAGE_HOME = PATH_PRIVATE + "index.jsp";
	public static String PATH_PAGE_403 = PATH_PRIVATE + "403.jsp";
	public static String PATH_PAGE_ITEMS = PATH_PRIVATE + "items.jsp";
	public static String PATH_PAGE_ABOUT = PATH_PRIVATE + "about.jsp";
	public static String PATH_PAGE_CONTACT = PATH_PRIVATE + "contact.jsp";
	public static String PATH_PAGE_ITEM = PATH_PRIVATE + "item.jsp";
	public static String PATH_PAGE_LOGIN = PATH_PRIVATE + "login.jsp";
	public static String PATH_PAGE_SIGNUP = PATH_PRIVATE + "signUp.jsp";
	public static String PATH_PAGE_SIGNUP_COMPLETE = PATH_PRIVATE + "signUpComplete.jsp";
	public static String PATH_PAGE_PRODUCT_ADD_COMPLETE = PATH_PRIVATE + "productAddComplete.jsp";
	public static String PATH_PAGE_CART = PATH_PRIVATE + "cart.jsp";
	public static String PATH_PAGE_INVOICE = PATH_PRIVATE + "invoice.jsp";
	public static String PATH_PAGE_SUMMARY = PATH_PRIVATE + "summary.jsp";
	public static String PATH_PAGE_CARTUSER = PATH_PRIVATE + "cartuser.jsp";
	public static String PATH_PAGE_ORDERHISTORY = PATH_PRIVATE + "order-history.jsp";
	public static String PATH_PAGE_SERVICE = PATH_PRIVATE + "service.jsp";
	public static String PATH_PAGE_LIST_PRODUCT = PATH_PRIVATE + "listProduct.jsp?category=1";
	public static String PATH_PAGE_LIST_CATEGORIES = PATH_PRIVATE + "listCategories.jsp";
	public static String PATH_PAGE_LIST_ORDERS = PATH_PRIVATE + "listorders.jsp";
	public static String PATH_PAGE_ADD_PRODUCT = PATH_PRIVATE + "add-product.jsp";
	public static String PATH_PAGE_ADD_CATEGORY = PATH_PRIVATE + "add-category.jsp";
	// Index
	public static String PATH_MENU_BANNER = PATH_INDEX_INCLUDES + "banner.jsp";		// Banner
	
	//public static String PATH_MENU_PRODUCT = PATH_IMG + "product.png";	// Place Holder Product
}
