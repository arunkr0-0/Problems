import java.util.*;
import java.lang.*;
class Encode{
	public static void main(String args[]){
		String str2;

		Scanner sc = new Scanner(System.in);
		
		str2=sc.nextLine();
		
		String str3=str2.replaceAll("\\s","");
		
		int l= str3.length();
		
		StringBuilder str=new StringBuilder(str3);
		
		int max = (int)Math.ceil(Math.sqrt(l));
		

		ArrayList<String> al=new ArrayList<>();

		String temp = "";

		for(int i=0;i<l;i++){
			
			temp = "";
			
			for(int j=i;j<l;){

				if(str.charAt(j) !='0'){

					temp +=str.charAt(j);

					str.setCharAt(j,'0');
					
				j+=max;

				}
				else{
					j++;
				}

				
			}
			al.add(temp);
			
		}

for(int k=0;k<al.size();k++){
	
	System.out.print(al.get(k)+" ");
}}}
