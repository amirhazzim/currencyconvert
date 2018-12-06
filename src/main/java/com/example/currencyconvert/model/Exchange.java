package com.example.currencyconvert.model;


public class Exchange {
	private String nation;
	private Double rate;
	
	public Exchange (String nation, Double rate) {
		this.nation = nation;
		this.rate = rate;	
	}
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
}