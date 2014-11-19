package edu.cmu.capstone.polaris.search;

public class SortCondition {
	private String sortOnField;
	private SortType order;
	
	public String getSortOnField() {
		return sortOnField;
	}
	public void setSortOnField(String sortOnField) {
		this.sortOnField = sortOnField;
	}
	public SortType getOrder() {
		return order;
	}
	public void setOrder(SortType order) {
		this.order = order;
	}
	
	
}
