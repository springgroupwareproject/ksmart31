package ksmart31.team01.accounting.domain;

public class Account {

	public String accountCode;
	public String accountName;	
	public String accountDate;
	public String memberId;
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "Account [accountCode=" + accountCode + ", accountName=" + accountName + ", accountDate=" + accountDate
				+ ", memberId=" + memberId + "]";
	}
	
	
}
