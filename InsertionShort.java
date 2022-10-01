import java.util.Scanner;

class Insertion {
    private static int size=5;
    private int[] a=new int[size];

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++) {
            System.out.print("Enter Elements of an Array :-");
            a[i]=sc.nextInt();
        }
    }

    public void shorts() {
        int j=0;
        int temp=0;
        for(int i=1;i<size;i++) {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp) {
                a[j+1]=a[j];
                j--;
            }
            a[++j]=temp;
        }
    }

    public void print() {
        for(int i=0;i<size;i++) {
            System.out.println(a[i]);
        }
    }
}

public class InsertionShort {
    public static void main(String[] args) {
        Insertion i=new Insertion();
        i.read();
        i.shorts();
        i.print();
    }
}
