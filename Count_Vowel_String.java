
package Exam;


public class Count_Vowel_String {
    public static void main(String[] args) {
        int vowel = 0;
        int consonent =0;
        String name = "Abu jakaria Md Numan";
        name = name.toLowerCase();
        
        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' ){
                vowel++;
            }else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
                consonent++;
            }
                
         
            
        }
        System.out.println("Total Vowel is: "+vowel);
        System.out.println("Total Consonent is: "+consonent);
        
        
        
    }
}
