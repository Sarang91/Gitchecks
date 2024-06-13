import java.util.HashSet;
import java.util.Set;

public class YogitaProblem {
	public static void main(String[] args) {
		Set mainset = new HashSet<String>();
	
		mainset.add("Apple");
		mainset.add("Application");
		mainset.add("Apply");
		mainset.add("Approach");
		
		String compare = "Applaud";
		
		returnlongest(mainset, compare);
	}
	
	public static int returnlongest(Set<String> mainset , String compare) {
		
		int comparelength = compare.length();
		int i = 1;
		
		while(i <= comparelength) {
				
			Set newset = new HashSet<String>();
			String newstring = compare.substring(0, i);
			
			for(String temp : mainset) {
				if(temp.substring(0,i).equals(newstring)) {
					newset.add(temp);
				}
			}
			System.out.println(newset);

			i++;
		}
		
		
		return 1;
	}
}

/*

leng = len(search)
print(leng)
i = 1
while i < leng:
    newstring = search[0:i]
    newlist = []
  #  print(newstring)
    for j in devicelist:
        if newstring == j[0:i]:
            newlist.append(j)
    print(newlist)        
    if len(newlist) == 1:
        return newlist
        break
    i = i + 1 
return newlist
*/