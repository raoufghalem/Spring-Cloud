package com.frontEnd;


public class Review {
	
	private Integer id;
	private String comment;
	private int productId;
	public Review(Integer id, String comment, int productId) {
		this.id = id;
		this.comment = comment;
		this.productId = productId;
	}
	public Review() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	

}
