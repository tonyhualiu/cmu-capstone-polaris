package com.seec.insurance.plm.customersearch.dataaccess;


import java.util.ArrayList;
import java.util.List;

import com.seec.insurance.plm.customersearch.interfaces.ICustomerSearch;
import com.seec.insurance.plm.customersearch.model.CustomerSearchRequest;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResponse;
import com.seec.insurance.plm.customersearch.model.CustomerSearchResult;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.cmu.capstone.polaris.dbcon.DatabaseConnection;

public class CustomerSearchDA implements ICustomerSearch{
	
	private static CustomerSearchResponse response = null;

	public CustomerSearchResponse searchCustomer(CustomerSearchRequest rqObj){

		//CustomerSearchResponse response = null;
		//TODO
		return response;
	}

	// fieldName{ LASTNAME, PHONE, EMAIL, SSN, ZIP }
	public CustomerSearchResponse searchCustomerbyFieldName(String fieldName, String value){
		
		//CustomerSearchResponse response = null;
		//TODO
		return response;
	}
	public CustomerSearchResponse searchCustomerbyFirstAndLastName(String firstName, String lastName) throws ClassNotFoundException, SQLException{
		
		Connection conn = DatabaseConnection.getInstance();
		String sql = "select * from customers where first_name like ? and last_name like ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		if(firstName == null){
			ps.setString(1,"%");
			ps.setString(2, lastName);
		}
		else if(lastName == null){
			ps.setString(1, firstName+"%");
			ps.setString(2, "%");
		}
		else{
			ps.setString(1, firstName+"%");
			ps.setString(2, lastName);
		}
		CustomerSearchResponse response = new CustomerSearchResponse();
		ResultSet rs = ps.executeQuery();
		CustomerSearchResult result = null;
		List<CustomerSearchResult> searchList = new ArrayList<CustomerSearchResult>();
		while(rs.next()){
			result = new CustomerSearchResult();
			result.setFullname(rs.getString(DatabaseConnection.FIRST_NAME)+" "+rs.getString(DatabaseConnection.LAST_NAME));
			result.setLeadStage("N/A");
			result.setPartyKey(rs.getString(DatabaseConnection.PARTY_KEY));
			result.setPrimaryAddress("N/A");
			result.setPrimaryPhone("N/A");
			result.setSsn("N/A");
			
			searchList.add(result);
			
		}
		
			response.setConfirmationId("confirmed");
			response.setResultCode("1");
			response.setResultMessage("RESULT_SUCCESS");
			response.setResultStatus("SUCCESS");
			response.setResultType("SUCCESS");
			response.setSearchList(searchList);
			response.setTotalRecordsFound(searchList.size());

		return response;
	}
	
	public CustomerSearchResponse searchCustomerbyCityAndZip(String city, String zip) throws ClassNotFoundException, SQLException{
		
		Connection conn = DatabaseConnection.getInstance();
		String sql = "select * from customers where city like ? and zip like ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		if(city == null){
			ps.setString(1, "%");
			ps.setString(2, zip);
		}
		else if(zip == null){
			ps.setString(2, "%");
			ps.setString(1,city);
		}
		else{
			ps.setString(1, city);
			ps.setString(2, zip);
		}
		
		CustomerSearchResponse response = new CustomerSearchResponse();
		ResultSet rs = ps.executeQuery();
		CustomerSearchResult result = null;
		List<CustomerSearchResult> searchList = new ArrayList<CustomerSearchResult>();
		while(rs.next()){
			result = new CustomerSearchResult();
			result.setFullname(rs.getString(DatabaseConnection.FIRST_NAME)+" "+rs.getString(DatabaseConnection.LAST_NAME));
			result.setLeadStage("N/A");
			result.setPartyKey(rs.getString(DatabaseConnection.PARTY_KEY));
			result.setPrimaryAddress("N/A");
			result.setPrimaryPhone("N/A");
			result.setSsn("N/A");
			
			searchList.add(result);
			
		}
		
			response.setConfirmationId("confirmed");
			response.setResultCode("1");
			response.setResultMessage("RESULT_SUCCESS");
			response.setResultStatus("SUCCESS");
			response.setResultType("SUCCESS");
			response.setSearchList(searchList);
			response.setTotalRecordsFound(searchList.size());

		return response;
	}
	
	public static void main(String[] args){
		CustomerSearchDA cs = new CustomerSearchDA();
		try {
			cs.searchCustomerbyCityAndZip(null, "15213");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
