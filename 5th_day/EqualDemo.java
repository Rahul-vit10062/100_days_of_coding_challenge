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

    public void sort1() {
        int j=0;
        int temp=0;
        for(int i=1;i<n;i++) {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp) {
                a[j+1]=a[j];
                j--;
            }
            a[++j]=temp;
        }
    }

    public void sort2() {
        int j=0;
        int temp=0;
        for(int i=1;i<n;i++) {
            temp=b[i];
            j=i-1;
            while(j>=0 && b[j]>temp) {
                b[j+1]=b[j];
                j--;
            }
            b[++j]=temp;
        }
    }

    public void equal() {
        int found=0;
        for(int i=0;i<n;i++) {
            if(a[i]==b[i]) {
                found =1;
            }else {
                found=0;
                break;
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
        e.read();
        e.reads();
        e.sort1();
        e.sort2();
        e.equal();

    }
}
