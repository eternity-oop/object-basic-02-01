package org.eternity.reservation.domain;

import org.eternity.generic.Money;

public class Movie {
	private Long id;
	private String title;
	private Integer runningTime;
	private Money fee;

	public Movie() {
	}

	public Movie(String title, Integer runningTime, Money fee) {
		this(null, title, runningTime, fee);
	}

	public Movie(Long id, String title, Integer runningTime, Money fee) {
		this.id = id;
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(Integer runningTime) {
		this.runningTime = runningTime;
	}

	public Money getFee() {
		return fee;
	}

	public void setFee(Money fee) {
		this.fee = fee;
	}
}
