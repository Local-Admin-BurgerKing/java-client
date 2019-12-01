package com.localadmin.model;

import java.util.ArrayList;

public class DailyFormulas1 {

	private String value1;
	private String value2;
	private Dailyoperators operator;
	private Boolean percent;
	private String name;
	private ArrayList<String> others;

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public Dailyoperators getOperator() {
		return operator;
	}

	public void setOperator(Dailyoperators operator) {
		this.operator = operator;
	}

	public Boolean isPercent() {
		return percent;
	}

	public void setPercent(Boolean percent) {
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getOthers() {
		return others;
	}

	public void setOthers(ArrayList<String> others) {
		this.others = others;
	}
	
	public void addOther(String other) {
		this.others.add(other);
	}
}
