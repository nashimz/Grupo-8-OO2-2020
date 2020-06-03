package com.unla.Grupo8OO22020.models;

public class PedidoModel {
	
	private long idPedido;
	private int quantity;
	private ProductModel product;
	private StoreModel store;
	private boolean aceptado;
	
	
	public PedidoModel() {}

	public PedidoModel(long idPedido, int quantity, ProductModel product,StoreModel store,boolean aceptado) {
		this.idPedido = idPedido;
		this.quantity = quantity;
		this.product = product;
		this.store=store;
		this.aceptado=aceptado;
	
	}
	

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
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

	public StoreModel getStore() {
		return store;
	}

	public void setStore(StoreModel store) {
		this.store = store;
	}
}
