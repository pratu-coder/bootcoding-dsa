package main.java.com.bootcoding.java.String;

public class String2 {
    public static void main(String[] args){
        String S="Haldiram";
        int len=S.length();
        String S2="   Haldiram!";
        System.out.println(S2.length());
        String S3="!Haldiram      ";
        System.out.println(S3.length());
        String str="Programming";
        int le=str.length();
        char ch=str.charAt(le/2);
        System.out.println(ch);
        int r1=str.indexOf('r');
        System.out.println(r1);
        int r2=str.lastIndexOf('r');
        System.out.println(r2);
        String word="ram";
        if(str.contains(word)){
            System.out.println("ram exist");
        }
        //str.subString(begin,end);
        String sub=str.substring(0,8);
        System.out.println(sub);
        String sub2=str.substring(0,str.indexOf('m'));
        System.out.println(sub2);
        String stp="Java is platform indepedence";

        String[] tokens=str.split(" ");
        System.out.println(tokens.length);
        String skills="c ,c++,java,python";
        String[] tech=skills.split(" ,");
        System.out.println("The candidate knows "+tech.length+" languages");

        String a="Java";
        System.out.println(a.length());

        String stq="Java";
        char[] chars=stq.toCharArray();
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
    }
}
