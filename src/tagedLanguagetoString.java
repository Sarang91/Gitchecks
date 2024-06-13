import java.util.StringTokenizer;

public class tagedLanguagetoString {

	public static void main(String[] args) {
		
		String s = "<h1>Nayeem loves counseling</h1>\r\n"
				+ "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\r\n"
				+ "<Amee>safat codes like a ninja</amee>\r\n"
				+ "<SA premium>Imtiaz has a secret crush</SA premium>";
		jsontostring(s);
	}
	
	public static void jsontostring(String ori) {
		
		StringTokenizer st = new StringTokenizer(ori);
		
		while(st.hasMoreElements()) {
	//		System.out.println(st.nextElement());
			String temp = (String) st.nextElement();
	
			
			
		}
		//
	}
	

}
