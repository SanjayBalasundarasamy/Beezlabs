
public class CalculateAverage {

	public static void main(String[] args) {
		Student quartelys1=new Student(100,50,100,50,100);
		Student quartelys2=new Student(100,50,100,50,100);
		Student halfs1=new Student(100,50,100,50,100);
		Student halfs2=new Student(100,50,100,50,100);
		Student avgS1=calculateAverage(quartelys1,halfs1);
		System.out.println("Average of 1 Student :");
		print(avgS1);
		Student avgS2=calculateAverage(quartelys2,halfs2);
		System.out.println("Average of 2 Student :");
		print(avgS2);
	}
	public static void print(Student s){
		System.out.println("English"+s.getEnglish());
		System.out.println("Tamil"+s.getTamil());
		System.out.println("Maths"+s.getMaths());
		System.out.println("Science"+s.getScience());
		System.out.println("SocialScience"+s.getSocialScience());
		
	}
	private static Student calculateAverage(Student q1, Student h1) {
		Student avg = new Student();
		avg.setEnglish((q1.getEnglish()+h1.getEnglish())/2);
		avg.setTamil((q1.getTamil()+h1.getTamil())/2);
		avg.setMaths((q1.getMaths()+h1.getMaths())/2);
		avg.setScience((q1.getScience()+h1.getScience())/2);
		avg.setSocialScience((q1.getSocialScience()+h1.getSocialScience())/2);
		
		return avg;
		
	}

}
