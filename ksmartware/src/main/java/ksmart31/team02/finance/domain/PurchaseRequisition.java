package ksmart31.team02.finance.domain;

public class PurchaseRequisition {

	private String purchaseRequisitionCode; //구매요청서 코드(PK) 
	private String  draftDocumentCode;

	//- 1 -
	private String departmentName;
	private String memberName;
	private String memberId;
	private String memberEmployeeCode;
	private String memberPositionName;
	private String purchaseRequisitionDate;
	private String purchaseRequisitionPayDay;
	private String totalPrice; // 총요청금액(총 금액 합계)
	
	//- N -
	private String purchaseRequisitionItemCategory;
	private String purchaseRequisitionItem;
	private String purchaseRequisitionItemUnit;
	private int purchaseRequisitionItemCount;
	private int purchaseRequisitionItemPrice;
	private int purchaseRequisitionTotalPrice;
	private String purchaseRequisitionEtc;

	private String draftDocumentFinalApprovalDate; //최종승인일자
	private int sumPurchaseRequisitionPrice; // 품목별 합산금액
	
	public String getPurchaseRequisitionCode() {
		return purchaseRequisitionCode;
	}
	public void setPurchaseRequisitionCode(String purchaseRequisitionCode) {
		this.purchaseRequisitionCode = purchaseRequisitionCode;
	}
	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}
	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberEmployeeCode() {
		return memberEmployeeCode;
	}
	public void setMemberEmployeeCode(String memberEmployeeCode) {
		this.memberEmployeeCode = memberEmployeeCode;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public String getPurchaseRequisitionDate() {
		return purchaseRequisitionDate;
	}
	public void setPurchaseRequisitionDate(String purchaseRequisitionDate) {
		this.purchaseRequisitionDate = purchaseRequisitionDate;
	}
	public String getPurchaseRequisitionPayDay() {
		return purchaseRequisitionPayDay;
	}
	public void setPurchaseRequisitionPayDay(String purchaseRequisitionPayDay) {
		this.purchaseRequisitionPayDay = purchaseRequisitionPayDay;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPurchaseRequisitionItemCategory() {
		return purchaseRequisitionItemCategory;
	}
	public void setPurchaseRequisitionItemCategory(String purchaseRequisitionItemCategory) {
		this.purchaseRequisitionItemCategory = purchaseRequisitionItemCategory;
	}
	public String getPurchaseRequisitionItem() {
		return purchaseRequisitionItem;
	}
	public void setPurchaseRequisitionItem(String purchaseRequisitionItem) {
		this.purchaseRequisitionItem = purchaseRequisitionItem;
	}
	public String getPurchaseRequisitionItemUnit() {
		return purchaseRequisitionItemUnit;
	}
	public void setPurchaseRequisitionItemUnit(String purchaseRequisitionItemUnit) {
		this.purchaseRequisitionItemUnit = purchaseRequisitionItemUnit;
	}
	public int getPurchaseRequisitionItemCount() {
		return purchaseRequisitionItemCount;
	}
	public void setPurchaseRequisitionItemCount(int purchaseRequisitionItemCount) {
		this.purchaseRequisitionItemCount = purchaseRequisitionItemCount;
	}
	public int getPurchaseRequisitionItemPrice() {
		return purchaseRequisitionItemPrice;
	}
	public void setPurchaseRequisitionItemPrice(int purchaseRequisitionItemPrice) {
		this.purchaseRequisitionItemPrice = purchaseRequisitionItemPrice;
	}
	public int getPurchaseRequisitionTotalPrice() {
		return purchaseRequisitionTotalPrice;
	}
	public void setPurchaseRequisitionTotalPrice(int purchaseRequisitionTotalPrice) {
		this.purchaseRequisitionTotalPrice = purchaseRequisitionTotalPrice;
	}
	public String getPurchaseRequisitionEtc() {
		return purchaseRequisitionEtc;
	}
	public void setPurchaseRequisitionEtc(String purchaseRequisitionEtc) {
		this.purchaseRequisitionEtc = purchaseRequisitionEtc;
	}
	public String getDraftDocumentFinalApprovalDate() {
		return draftDocumentFinalApprovalDate;
	}
	public void setDraftDocumentFinalApprovalDate(String draftDocumentFinalApprovalDate) {
		this.draftDocumentFinalApprovalDate = draftDocumentFinalApprovalDate;
	}
	public int getSumPurchaseRequisitionPrice() {
		return sumPurchaseRequisitionPrice;
	}
	public void setSumPurchaseRequisitionPrice(int sumPurchaseRequisitionPrice) {
		this.sumPurchaseRequisitionPrice = sumPurchaseRequisitionPrice;
	}
	
	
	
	
	
	
	
}


/*

[ 구매 요청서 ]

구매요청서 코드(PK) purchase_requisition_code
기안 문서코드(FK) draft_document_code 

- 1 -

부서명(소속) (FK) department_name
기안자명(신청자명) member_name
기안자ID(신청자ID) ID(FK) member_id
사번(신청자사번) (FK) member_employee_code
직위/직책 (FK) member_position_name
작성일 purchase_requisition_date
지급요청일 purchase_requisition_pay_day
총요청금액 // totalPrice

- N -
* 품목 purchase_requisition_item_category	
* 품명 purchase_requisition_item	
단위 purchase_requisition_item_unit
* 수량 purchase_requisition_item_count
* 단가 purchase_requisition_item_price
* 금액 purchase_requisition_total_price
비고 purchase_requisition_etc

*/