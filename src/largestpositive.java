import java.util.Arrays;

public class largestpositive {

	public static void main(String[] args) {

		int[] A = {1,2,3,6,8};
		test(A);
	}
//fadfafasf
	//asfasfasf
	public static int test(int[] A) {
        int temp = 0;

		 for(int i = 1 ; i <= A.length; i++){
             Boolean b =  Arrays.asList(A).contains(i);
             System.out.println(b+" "+i);
             if(b==true){
                 temp = i;
                 System.out.println(b+"asfsafsafasf "+i);
                 break;
                 }
      
  }
		return 1;
	}
}
