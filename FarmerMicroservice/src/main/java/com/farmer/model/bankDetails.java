package com.farmer.model;

public class bankDetails {
	
	private String account_number;
	private String bank_name;
	private String ifsc_Code;
	
	
	
	public bankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public bankDetails(String account_number, String bank_name, String ifsc_Code) {
		super();
		this.account_number = account_number;
		this.bank_name = bank_name;
		this.ifsc_Code = ifsc_Code;
	}



	public String getAccount_number() {
		return account_number;
	}



	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}



	public String getBank_name() {
		return bank_name;
	}



	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}



	public String getIfsc_Code() {
		return ifsc_Code;
	}



	public void setIfsc_Code(String ifsc_Code) {
		this.ifsc_Code = ifsc_Code;
	}
	
	
	
	
	
	

	
	

}
