
public class WordCount {
	
	private String word;
	private int frequency;
	
	//Konstruktor
	public WordCount (String word, int frequency){
		this.word = word;
		this.frequency = frequency;
	}

	public String getWord() {
		return word;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int incrementCount(){
		frequency++;
		return frequency;
	}
	public int incrementCount(int n){
		if(n<0){
			return frequency;
		}else{
			frequency += n;
		return frequency;	
		}
	}
}
