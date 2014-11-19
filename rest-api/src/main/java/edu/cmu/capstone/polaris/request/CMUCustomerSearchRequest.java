package edu.cmu.capstone.polaris.request;

import com.seec.insurance.plm.customersearch.model.CustomerSearchRequest;

import edu.cmu.capstone.polaris.search.SortCondition;

public class CMUCustomerSearchRequest extends CustomerSearchRequest{
	private SortCondition sort;
	private int limit;
	private int offset;

	public SortCondition getSortCondition() {
		return sort;
	}
	public void setSortCondition(SortCondition sort) {
		this.sort = sort;
	}
	
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

}
