package com.turbine;





public class Customer {
	
	private long id;
	private String name;
	private double ballance;
	public Customer(long id, String name, double ballance) {
		super();
		this.id = id;
		this.name = name;
		this.ballance = ballance;
	}
	public Customer() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBallance() {
		return ballance;
	}
	public void setBallance(double ballance) {
		this.ballance = ballance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", ballance=" + ballance + "]";
	}

	
	
}
