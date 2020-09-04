import java.util.Scanner;

public class AddingNumberToSingleDigit {

	public static void main(String[] args) {
		System.out.println("Number :");
		Scanner s=new Scanner(System.in);
		Integer number=s.nextInt();
		System.out.println(findNumber(number));		
	}
	
	public static Integer findNumber(Integer number){
		int sum=0;
		if(number.toString().toCharArray().length>1){
		while(number>0){
			int r=number%10;
			sum=sum+r;
			number/=10;
		}
		}else{
			return number;
		}
		return findNumber(sum);
		
	}

}
