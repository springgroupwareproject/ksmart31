package ksmart31.team01.accounting.domain;

public class Customer {

	public String customerCode;
	public String customerName;
	public String customerPhone;
	public String customerCorporateRegistrationNumber;
	public String customerAddress;	
	public String customerBank;
	public String customerAccountHolder;
	public String customerAccountNumber;	
	public String customerDate;
	public String memberId;
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerCorporateRegistrationNumber() {
		return customerCorporateRegistrationNumber;
	}
	public void setCustomerCorporateRegistrationNumber(String customerCorporateRegistrationNumber) {
		this.customerCorporateRegistrationNumber = customerCorporateRegistrationNumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerBank() {
		return customerBank;
	}
	public void setCustomerBank(String customerBank) {
		this.customerBank = customerBank;
	}
	public String getCustomerAccountHolder() {
		return customerAccountHolder;
	}
	public void setCustomerAccountHolder(String customerAccountHolder) {
		this.customerAccountHolder = customerAccountHolder;
	}
	public String getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(String customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public String getCustomerDate() {
		return customerDate;
	}
	public void setCustomerDate(String customerDate) {
		this.customerDate = customerDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customerCorporateRegistrationNumber=" + customerCorporateRegistrationNumber
				+ ", customerAddress=" + customerAddress + ", customerBank=" + customerBank + ", customerAccountHolder="
				+ customerAccountHolder + ", customerAccountNumber=" + customerAccountNumber + ", customerDate="
				+ customerDate + ", memberId=" + memberId + "]";
	}	
	
}
