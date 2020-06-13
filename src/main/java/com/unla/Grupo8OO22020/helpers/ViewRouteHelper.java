package com.unla.Grupo8OO22020.helpers;

public class ViewRouteHelper {
	
	/**** Views ****/
	
	//   HOME
	public final static String HOME_INDEX = "home/index";
	
	
	//  PRODUCT
	public final static String PRODUCT_INDEX = "product/index";
	public final static String PRODUCT_NEW = "product/new";
	public final static String PRODUCT_UPDATE = "product/update";
	
	//  BATCH
	public final static String BATCH_INDEX = "batch/index";
	public final static String BATCH_NEW = "batch/new";
	public final static String BATCH_UPDATE = "batch/update";
	
	// STORE
	public final static String STORE_INDEX="store/index";
	public final static String STORE_NEW="store/new";
	public final static String STORE_UPDATE="store/update";
	public final static String STORE_DISTANCE="store/distance";
	public final static String STORE_CALCULATEDISTANCE="store/calculatedistance";
	public final static String STORE_NEAR="store/near";
	
	// PERSON
	
    public final static String PERSON_INDEX = "person/index";
	public final static String PERSON_NEW = "person/new";
	public final static String PERSON_UPDATE = "person/update";
		
	// CLIENT
		
	public final static String CLIENT_INDEX = "client/index";
	public final static String CLIENT_NEW = "client/new";
	public final static String CLIENT_UPDATE = "client/update";
	
	// EMPLOYEE
	
	public final static String EMPLOYEE_INDEX = "employee/index";
	public final static String EMPLOYEE_NEW = "employee/new";
	public final static String EMPLOYEE_UPDATE = "employee/update";
	
	// PEDIDO
	
	public final static String PEDIDO_INDEX = "pedido/index";
	public final static String PEDIDO_NEW = "pedido/new";
	public final static String PEDIDO_UPDATE = "pedido/update";
	public final static String PEDIDO_PRODUCT_BETWEEN_DATES = "pedido/productbetweendates";
	public final static String PEDIDO_INDEX_BETWEEN_DATES = "pedido/getproductbetweendates";
	public final static String PEDIDO_COLLABORATOR = "pedido/collaborator";
	
	// RANKING
	
	public final static String RANKING_INDEX = "ranking/index";
	
	//USER
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";
	
	/**** Redirects ****/
	public final static String PRODUCT_ROOT = "/product";
	public final static String BATCH_ROOT = "/batch";
	public final static String STORE_ROOT="/store";
	public final static String PERSON_ROOT="/person";
	public final static String CLIENT_ROOT="/client";
	public final static String EMPLOYE_ROOT="/employee";
	public final static String PEDIDO_ROOT="/pedido";
}
