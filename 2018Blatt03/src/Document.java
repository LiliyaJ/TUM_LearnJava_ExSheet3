
public class Document {

	private String content;
	private String titel;
	private String language;
	private String summary;
	private Date releaseDate;
	private Author author;

	public String getText() {
		return content;
	}

	public void setText(String content) {
		this.content = content;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Document(String title, String language, String summary, Date releaseDate, Author author, String content) {
		this.titel = title;
		this.language = language;
		this.summary = summary;
		this.releaseDate = releaseDate;
		this.author = author;
		this.content = content;
	}

	public String toString() {
		return this.titel + " by " + this.author.toString();

	}

	public int getAgeAt(Date today) {
		return releaseDate.getAgeInDaysAt(today);
	}

}
