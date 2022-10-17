package learningPackage;

public class SplitString {

	 
			public static void main(String args[]){  
				/**/
			String s1="welcome to split world";  
			for(String w:s1.split("\\s")){  
				System.out.println(w);  
				} 
			System.out.println("returning words:0");  
			
			
			
			for(String w:s1.split("\\s",0)){  
			System.out.println(w);  
			}  
			System.out.println("returning words:1");  
			for(String w:s1.split("\\s",1)){  
			System.out.println(w);  
			}  
			System.out.println("returning words:2");  
			for(String w:s1.split("\\s",2)){  
			System.out.println(w);  
			} 
			System.out.println("returning words:3");  
			for(String w:s1.split("\\s",3)){  
			System.out.println(w);  
			}  
			  
			  
			}
	}


