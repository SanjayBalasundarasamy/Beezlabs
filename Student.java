
public class Student {
	private int english;
	private int tamil;
	private int maths;
	private int science;
	private int socialScience;
	public Student(int english, int tamil, int maths, int science, int socialScience) {		
		this.english = english;
		this.tamil = tamil;
		this.maths = maths;
		this.science = science;
		this.socialScience = socialScience;
	}
	public Student() {
		
	}
	public int getEnglish() {
		return english;
	}
	public int getTamil() {
		return tamil;
	}
	public int getMaths() {
		return maths;
	}
	public int getScience() {
		return science;
	}
	public int getSocialScience() {
		return socialScience;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public void setSocialScience(int socialScience) {
		this.socialScience = socialScience;
	}
	
	

}
