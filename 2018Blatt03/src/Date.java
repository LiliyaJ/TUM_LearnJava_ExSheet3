
public class Date {

	private int day;
	private int month;
	private int year;

	// Konstruktor 1
	public Date(int day, int month, int year) {
		setYear(year);	
		setMonth(month);
		setDay(day);	
	}

	// Konstruktor 2
	public Date() {
		day = Terminal.TODAYS_DAY;
		month = Terminal.TODAYS_MONTH;
		year = Terminal.TODAYS_YEAR;
	}

	public int getDay() {
		return day;
	}

	// 3.6
	public void setDay(int day) {
		if (day > 0 && day <= daysInMonth()) {
			this.day = day;
		}/*else{
		this.day = 1;
		}*/
	}

	// 3.6 Hilfsmethode für setDay();
	private int daysInMonth() {
		int days;
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		return days;
	}

	public int getMonth() {
		return month;
	}

	// 3.6
	public void setMonth(int month) {
		if (theMonthIsCorrect(month)) {
			this.month = month;
		} else {
			this.month = 1;
		}
	}

	// 3.6 Hilfsmethode für setMonth();
	private boolean theMonthIsCorrect(int month) {
		if (month > 0 && month < 13) {
			return true;
		}
		return false;
	}

	public int getYear() {
		return year;
	}

	// 3.6
	public void setYear(int year) {
		if (theYearIsCorrect(year)) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}

	// Hilfsmethode für setYear();
	private boolean theYearIsCorrect(int year) {
		if (year > 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		return day + "." + month + "." + year;
	}

	private int daysSince1970() {
		return (day - 1) + ((month - 1) * 30) + ((year - 1970) * 30 * 12);
	}

	public int getAgeInDaysAt(Date today) {
		return (today.day - day) + ((today.month - month) * 30) + ((today.year - year) * 30 * 12);
	}

	public int getAgeInYearsAt(Date today) {
		if (today.month < month || today.month == month && today.day < day)
			return today.year - year - 1;
		else
			return today.year - year;
	}

	public static void main(String[] args) {
		Date d = new Date(32, 1, 2018);
		System.out.println(d);

	}

}
