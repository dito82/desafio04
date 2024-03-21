package com.devsuperior.dsmeta.dto;

public class SellerMinDTO {

	private String name;
	private Double amount;

	public SellerMinDTO(String name, Double amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
