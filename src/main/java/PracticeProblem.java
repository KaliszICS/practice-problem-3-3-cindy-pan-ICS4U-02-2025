import java.util.ArrayList;
import java.util.HashMap;
public class PracticeProblem {

	public static ArrayList<String> perms(String str){
		ArrayList<String> out = new ArrayList<String>();
		
		permHelper("", str, out);
		return out;
	}
	public static void permHelper(String pre, String str, ArrayList<String> arr){
		int n = str.length();
		
		if (n == 0) {
			arr.add(pre);
		}
		else {
			for (int i = 0; i < n; i++)
				permHelper(pre + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), arr);
		}
	}


	public static ArrayList<String> permsUnique(String str){
		HashMap<String,Integer> temp= new HashMap<String, Integer>();
		ArrayList<String> out = new ArrayList<String>();
		ArrayList<String> print = new ArrayList<String>();
		permHelper("", str, out);
		for (int i =0; i< out.size() ; i++){
			temp.put(out.get(i),(i));
		}
		for (int o : temp.values()){
			print.add(out.get(o));
		}
		return print;
	}
}
