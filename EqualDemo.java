//Check Two array are equall or not

import java.util.Scanner;

class Equall {
    private static int n=6;
    private int[] a=new int[n];
    private int[] b=new int[n];

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++) {
            System.out.print("Enter Elements of an array :-");
            a[i]=sc.nextInt();
        }
    }

    public void reads() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++) {
            System.out.print("Enter Element of 2nd Matrix :-");
            b[i]=sc.nextInt();
        }
    }

    public void equal() {
        int found=0;
        for(int i=0;i<n;i++) {
            j:
            for(int k=0;k<n;k++) {

                if(a[i]==b[k]) {
                    found=1;
                    break;
                }else {
                    found=0;
                }
            }
        }

        if(found==1) {
            System.out.println("Equall");
        }else {
            System.out.println("Not equall");
        }
    }
}

public class EqualDemo {
    public static void main(String[] args) {
        Equall e=new Equall();
        e.read();e.reads();
        e.equal();
    }
}
