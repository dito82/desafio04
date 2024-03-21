package com.devsuperior.dsmeta.dto;

import java.time.LocalDate;

import com.devsuperior.dsmeta.entities.Sale;

public class SaleMinDTO {

	private Long id;
	private LocalDate date;
	private Double amount;
	private String seller;

	public SaleMinDTO(Long id, LocalDate date, Double amount, String sellerName) {
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.setSeller(sellerName);
	}

	public SaleMinDTO(Sale entity) {
		id = entity.getId();
		amount = entity.getAmount();
		date = entity.getDate();
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}
}
