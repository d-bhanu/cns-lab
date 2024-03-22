import java.util.*;
class Warman{
    public static String xoring(String a, String b){
        String ans="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i))
                ans+='0';
            else
                ans+="1";
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plaintext");
        String s=sc.nextLine();
        System.out.println("Enter the key");
        String k=sc.nextLine();
        while(s.length() > k.length()){
            k += k;
        }
        k = k.substring(0, s.length());
        String ciphertext="";
        for(int i=0;i<s.length();i++){
            String a=Integer.toBinaryString(s.charAt(i));
            String b=Integer.toBinaryString(k.charAt(i));
            ciphertext += xoring(a, b) + " ";
        }
        System.out.println("Ciphertext:"+ciphertext.trim());
        String[] words=ciphertext.split(" ");
        String plain="";
        for(int i=0;i<words.length;i++){
            String a=Integer.toBinaryString(k.charAt(i));
            String c=xoring(a,words[i]);
            int asciiValue=Integer.parseInt(c,2);
            char character=(char)asciiValue;
            plain +=character;
        }
        System.out.println("Plaintext:"+plain);
    }
}
