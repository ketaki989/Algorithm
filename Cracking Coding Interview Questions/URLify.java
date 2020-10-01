package CCI;
import java.util.*;
public class URLify {
	public static void replaceString(String str){
		str = str.trim();
		str = str.replaceAll(" ", "%20");
		System.out.println("String: "+str);
	}
	//Brute Force Solution
	public static void replaceStringWithDS(String str){
		char[] ch = str.toCharArray();
		char[] replaceCh = new char[100]; 
		str = str.trim();
		int k = 0;
		for(int i = 0 ; i < ch.length; i++,k++){
			System.out.println("Ch :"+ch[i]);
			if(ch[i] == ' '){
				replaceCh[k] = '%';
				replaceCh[k+1] = '2';
				replaceCh[k+2] = '0';
				k += 2;
				System.out.println("k"+k);
			}else{
				replaceCh[k] = ch[i];
				System.out.println("Ai"+i);
			}
		}
		
		for(char words: replaceCh){
				System.out.print(words);
		}
	}
	public static void main(String[] args) {
		System.out.println("********URLify********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Length of string:(Before) "+str.length());
		replaceString(str);
		System.out.println("Length of string:(After) "+str.length());
		replaceStringWithDS(str);
	}

}
