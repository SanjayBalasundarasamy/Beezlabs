import java.util.Scanner;

public class OnesPresentInGivenRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the start range :");
		int x=s.nextInt();		
		System.out.println("Enter the end range :");
		int y=s.nextInt();
		int count=0;
		for(Integer i=x;i<=y;i++){
			char[] ch=i.toString().toCharArray();
			for(char c: ch){
				if(c=='1'){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
