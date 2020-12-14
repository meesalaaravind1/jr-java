/* Author:Santosh Kumar M
   Date:20-11-2020 */
import java.io.*;
import java.util.Scanner;

class CGL_Board {

    public void createBoard(int n) {
        int[][] arr = new int[n][n];
        arr[1][3] = 1;
        arr[1][4] = 1;
        arr[2][4] = 1;
        arr[4][4] = 1;
        arr[4][5] = 1;
        arr[5][4] = 1;
        arr[5][5] = 1;
        arr[5][6] = 1;
        int i = 0;
        int j = 0;
        for(i=0; i<n; i++)
        {
            String s1 = "";
            for(j=0; j<n; j++)
            {
                if(arr[i][j] == 0)
                    s1 += "."+" ";
                else
                    s1 += "*"+" ";
            }
            s1 = s1.trim();
            // s1 = s1+"\n";
            System.out.println(s1);
            // if(arr[i][j] == 0)
            //     System.out.println("."+" ");
            // else
            //     System.out.println("*"+" ");
        }
        // for(int k=i; k<n; k++)
        // {
        //     int l = 0;
        //     for(l = 0; l<n; l++)
        //     {
        //         if(arr[i][j] == 0)
        //             System.out.print("."+" ");
        //         else
        //             System.out.print("*"+" ");
        //     }
        //     // if(arr[i][j] == 0)
        //     //     System.out.print(".");
        //     // else
        //     //     System.out.print("*");
        // }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // file to be scanned
        int n = sc.nextInt();
        CGL_Board c=new CGL_Board();
        c.createBoard(n);
        sc.close();
    }
}
