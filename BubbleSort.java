import java.util.Scanner;

class Bubble {
    static int max=5;
    private int[] a=new int[5];

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<max;i++) {
            System.out.print("Enter Element of an Array :-");
            a[i]=sc.nextInt();
        }
    }

    public void bubble() {
        int temp = 0;  
        for(int i=0; i<max-1; i++){  
            for(int j=1; j <max; j++){  
                if(a[j-1] > a[j]){  
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
    }

    public void print() {
        for(int i=0;i<max;i++) {
            System.out.println(a[i]);
        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        Bubble b=new Bubble();
        b.read();
        b.bubble();
        b.print();
    }
}
