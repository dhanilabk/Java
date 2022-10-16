package learningPackage;

import java.util.Locale;
import java.util.StringJoiner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello how are you";
System.out.println("substring(p) : "+s.substring(3));
System.out.println("substring(p,q) : "+s.substring(3,7));
System.out.println("contains() : "+s.contains("how"));
       
          
String joinString1=String.join("-","welcome","to","javatpoint");  
System.out.println(joinString1);

String joinString3 = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
System.out.println(joinString3);  

String m = "java";
String m2 = "java";
String n = new String("java");
String n2 = new String("java");
String p=new String();
String p2=new String();
System.out.println(m.equals(m2));
System.out.println(m.equals(n));
System.out.println(n2.equals(n));
System.out.println(p.equals(p2));
System.out.println(m.isEmpty());
System.out.println(p.isEmpty());
m.concat(s);
System.out.println(m);
m=m.concat(s);
System.out.println(m);
System.out.println(m.equals(m2));
String s3 = "JAVATPOINT HELLO stRIng";    
String eng = s3.toLowerCase(Locale.GERMAN);  
System.out.println(eng);


}}  

