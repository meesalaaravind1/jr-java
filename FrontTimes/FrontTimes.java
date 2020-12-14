import java.util.*;

class FrontTimes{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int n=Integer.parseInt(sc.nextLine());
        String sub="";
        if (s.length()<3){
            sub=s;
        }
        else{
        sub=s.substring(0,3);}

        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            sb.append(sub);
        }
        System.out.println(sb);
    }
}