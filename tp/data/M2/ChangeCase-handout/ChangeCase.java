import java.util.Scanner;  
public class ChangeCase {    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newSt = "";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch>=65 && ch<91)
            {
                newSt += Character.toLowerCase(ch);
                // ch = ((char)((int)ch+26))-'A';
            }
            else if (ch>=95 && ch<122)
            {
                newSt += Character.toUpperCase(ch);
            }
            else
            {
                newSt += ch; 
            }
        }  
        System.out.println(newSt);
    }    
}
