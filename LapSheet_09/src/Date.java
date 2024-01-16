
public class Date {
	private int year;
	private int mouth;
	private int day;
	
	Date(int year,int mouth,int day) {
		this.year = year;
		this.mouth = mouth;
		this.day = day;
	}
	
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.mouth;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int mouth) {
		this.mouth = mouth;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toString() {
		return String.format("%02d/%02d/%02d",mouth,day,year);
	}
	public void setDate(int year,int mouth,int day) {
		this.year = year;
		this.mouth =mouth;
		this.day = day;
	}
}
