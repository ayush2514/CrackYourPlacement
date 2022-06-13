import java.util.*;
class PrintAllPermutationsStr {
    static int fact(int n) {
        int fac=1;
        for(int i=2;i<=n;i++)
        fac*=i;
        return fac;
    }
    static void printPermut(String str) {
         int factorial=fact(str.length());
        for(int i=0;i<factorial;i++) {
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=str.length();div>=1;div--) {
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scr.nextLine();
        printPermut(str);
    }

}