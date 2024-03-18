import java.Util.*;
class Warman{
public static string xoring(string a, string b){
       string ans="";
       for(int i=0;i<a.length();i++){
          if(a.charAt(i)==b.charAt(i))
             ans+='0';
          else
             ans+="1";
      }
      return ans;
}
public static void main(String[] args){
   Scanner sc=new scanner(System.in);
   System.out.println("enter the key");
   String k=sc.nextLine();
   if(s.length()!=k.length()){
      int ind=s.length()-k.length();
      int ki=k.length();
      for(int i=0;i<ind;i++){
        if(s.length()!=k.length()){
          k=k+k.charAt(i%ki);
        }
         else{
           break;
          }
      }
  }
  String ciphertext="";
  for(int i=0;i<s.length();i++){
    String a=Integer.toBinaryString(S.charAt(i));
    String b=Integer.toBinaryString(k-charAt(i));
    ciphertext t="";
  }
  System.out.println("ciphertext:"+ciphertext);
  String[] words=ciphertext.split("//s");
  String plain="";
  for(int i=0;i<words.length;i++){
  String a=Integer.toBinaryString(k.charAt(i));
  String c=xoring(a,words [i]);
  int asciivalue=Integer.parseInt(c,2);
  char character=(char)asciivalue;
  plain t=charcter;
 }
 System.out.println("Plaintext"+plain);
}
}

   
