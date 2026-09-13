import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Demo{
    
     public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        // int num=System.in.read();
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);
        // int num=Integer.parseInt(bf.readLine());
        //  System.out.println(num);
        //  bf.close();

        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // System.out.println(num);

        // int i=2;
        // int j=0;
        // try{
        //     j=18/i;
        //     System.out.println("Bye......");
        // }catch(Exception e){
        //     System.out.println("Something went wrong");
        // }finally{
        //     System.out.println("neeto..");
        // }

        int num=0;
        // BufferedReader br=null;
        // try{
        //   InputStreamReader in=new InputStreamReader(System.in);
        //   br=new BufferedReader(in);
        //   num=Integer.parseInt(br.readLine());
        //   System.out.println(num);
        // }
        // finally{
        //   br.close();
        // }

        try (BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))) {
            num=Integer.parseInt(bf.readLine());
            System.out.println(num);    
        } 
     }
}