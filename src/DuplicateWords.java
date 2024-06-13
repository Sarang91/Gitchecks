import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class DuplicateWords {

	public static void main(String[] args) {
		String duplicate = Duplicate_Words("sa sa sa asd asfasf sad");
	}
	
	public static String Duplicate_Words(String original) {
		StringTokenizer st = new StringTokenizer(original);
		
		Set<String> hs = new HashSet();
		
		while(st.hasMoreElements()) {
	//		System.out.println(st.nextToken());
		      String word = st.nextToken();

			while(!hs.contains(word)) {
				hs.add(word);
			}
			
		}
		String w = "";
		for(String i : hs)
		{
			w = w +" "+ i;
		}		
		System.out.println(w);
		return "asfs";
		
	}

}
