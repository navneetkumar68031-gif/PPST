import java.util.Scanner;
public class Febo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        
        Scanner in = new Scanner(System.in);
        System.out.print("give num of digits - ");
        int n = in.nextInt();
        int c=0;
        // System.out.print("here is your febo series upto "+n+" place - ");
        for(int count = 3;count<=n;count=count+1) {
            c=b;
            b=b+a;
            a=c;
            
            // System.out.print(b+".");
        }
        System.out.println(b);

    }
    
}
