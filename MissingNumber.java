import java.util.ArrayList;

public class MissingNumber {

	public static void main(String[] args) {		
		int arr[]={1,2,3,4,5,7,8,9};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1 !=arr[i+1]){
				list.add(arr[i]+1);
			}
		}
for(Integer a:list){
	System.out.println(a);
}
	}

}
