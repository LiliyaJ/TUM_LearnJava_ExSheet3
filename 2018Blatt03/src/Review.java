
public class Review {
	
	private String content;
	private Author author;
	private Document reviewedDocument;
	private String language;
	private Date releaseDate;
	private int rating;

	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Author getAurthor() {
		return author;
	}

	public void setAurthor(Author author) {
		this.author = author;
	}

	public Document getReviewedDocument() {
		return reviewedDocument;
	}

	public void setReviewedDocument(Document reviewedDocument) {
		this.reviewedDocument = reviewedDocument;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		if (rating > 0 && rating < 11)
		this.rating = rating;
	}
	
	//Konstruktor
	public Review (Author author, Document reviewDocument, String language, Date releaseDate, int rating, String content){
		
		this.author = author;
		this.reviewedDocument = reviewDocument;
		this.language = language;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.content = content;
	}
	
	public String toString(){
		return this.reviewedDocument.toString() + " is rated " + this.rating + " by " + this.author.toString();
		  }
	
	public int getAgeAt(Date today) {
		return releaseDate.getAgeInDaysAt(today);
	}
	public static void main (String[] args){
		Date rdA1 = new Date();
		Date rdR1 = new Date(); 
		Author a1 = new Author("content", "content", rdA1, "content", "content");
		Document d1 = new Document("content", "content", "content", rdR1, a1, "content");
		Review r1 = new Review (a1, d1, "content", rdR1, 15, "content");
		System.out.println(r1);
	
	}
}
