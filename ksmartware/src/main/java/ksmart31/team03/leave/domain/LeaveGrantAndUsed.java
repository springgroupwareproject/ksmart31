package ksmart31.team03.leave.domain;

public class LeaveGrantAndUsed {
	private int leaveTotalGrantHour;
	private int leaveTotalGrantDay;
	private int leaveTotalUsedHour;
	private int leaveTotalUsedDay;
	private int leaveTotalHour;
	private int leaveTotalDay;
	public int getLeaveTotalGrantHour() {
		return leaveTotalGrantHour;
	}
	public void setLeaveTotalGrantHour(int leaveTotalGrantHour) {
		this.leaveTotalGrantHour = leaveTotalGrantHour;
	}
	public int getLeaveTotalGrantDay() {
		return leaveTotalGrantDay;
	}
	public void setLeaveTotalGrantDay(int leaveTotalGrantDay) {
		this.leaveTotalGrantDay = leaveTotalGrantDay;
	}
	public int getLeaveTotalUsedHour() {
		return leaveTotalUsedHour;
	}
	public void setLeaveTotalUsedHour(int leaveTotalUsedHour) {
		this.leaveTotalUsedHour = leaveTotalUsedHour;
	}
	public int getLeaveTotalUsedDay() {
		return leaveTotalUsedDay;
	}
	public void setLeaveTotalUsedDay(int leaveTotalUsedDay) {
		this.leaveTotalUsedDay = leaveTotalUsedDay;
	}
	public int getLeaveTotalHour() {
		return leaveTotalHour;
	}
	public void setLeaveTotalHour(int leaveTotalHour) {
		this.leaveTotalHour = leaveTotalHour;
	}
	public int getLeaveTotalDay() {
		return leaveTotalDay;
	}
	public void setLeaveTotalDay(int leaveTotalDay) {
		this.leaveTotalDay = leaveTotalDay;
	}
	@Override
	public String toString() {
		return "LeaveGrantAndUsed [leaveTotalGrantHour=" + leaveTotalGrantHour + ", leaveTotalGrantDay="
				+ leaveTotalGrantDay + ", leaveTotalUsedHour=" + leaveTotalUsedHour + ", leaveTotalUsedDay="
				+ leaveTotalUsedDay + ", leaveTotalHour=" + leaveTotalHour + ", leaveTotalDay=" + leaveTotalDay + "]";
	}
	
}
