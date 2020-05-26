package com.unla.Grupo8OO22020.models;

import com.unla.Grupo8OO22020.entities.Employee;
import com.unla.Grupo8OO22020.entities.Product;
import com.unla.Grupo8OO22020.entities.Store;

public class StockRequestModel {
	private long idStockRequest;
	private int quantity;
	private ProductModel product;
	private StoreModel store1;
	private StoreModel store2;
	private EmployeeModel employee;
	private EmployeeModel colaborador;

	public StockRequestModel() {}

	public StockRequestModel(long idStockRequest, int quantity,ProductModel product,StoreModel store1,StoreModel store2, EmployeeModel employee, EmployeeModel colaborador) {
		this.idStockRequest=idStockRequest;
		this.quantity=quantity;
		this.product=product;
		this.store1= store1;
		this.store2=store2;
		this.employee=employee;
		this.colaborador=colaborador; 
	}

	public long getIdStockRequest() {
		return idStockRequest;
	}

	public void setIdStockRequest(long idStockRequest) {
		this.idStockRequest = idStockRequest;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public StoreModel getStore1() {
		return store1;
	}

	public void setStore1(StoreModel store1) {
		this.store1 = store1;
	}

	public StoreModel getStore2() {
		return store2;
	}

	public void setStore2(StoreModel store2) {
		this.store2 = store2;
	}

	public EmployeeModel getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeModel employee) {
		this.employee = employee;
	}

	public EmployeeModel getColaborador() {
		return colaborador;
	}

	public void setColaborador(EmployeeModel colaborador) {
		this.colaborador = colaborador;
	}
	
	
}

