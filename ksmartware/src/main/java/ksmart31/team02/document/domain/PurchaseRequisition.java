package ksmart31.team02.document.domain;

/*구매요청서*/
public class PurchaseRequisition {
	private String draftDocumentCode;
	private String memberName; 						//기안자
	private String memberEmployeeCode; 				//사번
	private String memberPositionName; 				//직책 
	private String departmentName;					//부서
	private String purchaseRequisitionDate;  		//기안일
	private String purchaseRequisitionPayDay;		//지급요청일
	private int purchaseRequisitionTotalPrice; 		//합계금액
	private String purchaseRequisitionItemCategory; //품목
	private String purchaseRequisitionItem; 		//품명
	private int purchaseRequisitionItemUnit; 		//단위
	private int purchaseRequisitionItemCount;		//수량
	private int purchaseRequisitionItemPrice;		//단가
	private String purchaseRequisitionEtc;			//비고
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getDraftDocumentCode() {
		return draftDocumentCode;
	}
	public void setDraftDocumentCode(String draftDocumentCode) {
		this.draftDocumentCode = draftDocumentCode;
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
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	public int getPurchaseRequisitionTotalPrice() {
		return purchaseRequisitionTotalPrice;
	}
	public void setPurchaseRequisitionTotalPrice(int purchaseRequisitionTotalPrice) {
		this.purchaseRequisitionTotalPrice = purchaseRequisitionTotalPrice;
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
	public int getPurchaseRequisitionItemUnit() {
		return purchaseRequisitionItemUnit;
	}
	public void setPurchaseRequisitionItemUnit(int purchaseRequisitionItemUnit) {
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
	public String getPurchaseRequisitionEtc() {
		return purchaseRequisitionEtc;
	}
	public void setPurchaseRequisitionEtc(String purchaseRequisitionEtc) {
		this.purchaseRequisitionEtc = purchaseRequisitionEtc;
	}
	@Override
	public String toString() {
		return "PurchaseRequisition [draftDocumentCode=" + draftDocumentCode + ", memberName=" + memberName
				+ ", memberEmployeeCode=" + memberEmployeeCode + ", memberPositionName=" + memberPositionName
				+ ", departmentName=" + departmentName + ", purchaseRequisitionDate=" + purchaseRequisitionDate
				+ ", purchaseRequisitionPayDay=" + purchaseRequisitionPayDay + ", purchaseRequisitionTotalPrice="
				+ purchaseRequisitionTotalPrice + ", purchaseRequisitionItemCategory=" + purchaseRequisitionItemCategory
				+ ", purchaseRequisitionItem=" + purchaseRequisitionItem + ", purchaseRequisitionItemUnit="
				+ purchaseRequisitionItemUnit + ", purchaseRequisitionItemCount=" + purchaseRequisitionItemCount
				+ ", purchaseRequisitionItemPrice=" + purchaseRequisitionItemPrice + ", purchaseRequisitionEtc="
				+ purchaseRequisitionEtc + "]";
	}
	
	
	
	
}
