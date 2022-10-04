import java.util.Scanner;

import javafx.scene.control.Menu;

class Sparse {
    private static int max=4,min=5;
    private int[][] a=new int[max][min];
    private int[][] rowCol=new int[3][10];
    int r=0,size=0;

    public void read() {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<max;i++) {
            for(int j=0;j<min;j++) {
                System.out.print("Enter Elements of an array :-");
                a[i][j]=sc.nextInt();
            }
        }
    }

    public void SparseMatrix() {
        
        for(int i=0;i<max;i++) {
            for(int j=0;j<min;j++) {
                if(a[i][j]!=0) {
                    rowCol[0][r]=i;
                    rowCol[1][r]=j;
                    rowCol[2][r]=a[i][j];
                    r++;
                    size++;
                }
            }
        }
    }

    public void search(int x) {
       for(int i=0;i<size;i++) {
        if(rowCol[2][i]==x) {
            System.out.println(rowCol[0][i]);
            System.out.println(rowCol[1][i]);
            System.out.println(rowCol[2][i]);
        }
       }
       System.out.println("Not Found");
    }

    public void deletee(int x){
        for(int i=0;i<size;i++) {
            if(rowCol[2][i]==x) {
                rowCol[0][i]=rowCol[0][i+1];
                rowCol[1][i]=rowCol[1][i+1];
                rowCol[2][i]=rowCol[2][i+1];
            }
            size--;
           }
    }

    public void printSparx() {
            for(int j=0;j<size;j++) {
                System.out.print(rowCol[0][j]+" ");
            }System.out.println();
            for(int j=0;j<size;j++) {
                System.out.print(rowCol[1][j]+" ");
            }System.out.println();
            for(int j=0;j<size;j++) {
                System.out.print(rowCol[2][j]+" ");
            }
    }

    public int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Insert");
        System.out.println("2.Search");
        System.out.println("3.Delete");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        System.out.println("Enter Your Choice:-");
        int x=sc.nextInt();
        return x;
    }
}

public class SparseMatrix {
    public static void main(String[] args) {
        Sparse s=new Sparse();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            choice=s.menu();
            switch (choice) {
                case 1:
                    s.read();
                    break;
                case 2:
                int x=0;
                    //Scanner sc=new Scanner(System.in);
                    System.out.print("Enter Element which you want to search :-");
                    x=sc.nextInt();
                    s.search(x);
                    break;
                case 3:
                    int y=0;
                    //Scanner sc=new Scanner(System.in);
                    System.out.print("Enter Element which you want to search :-");
                    x=sc.nextInt();
                    s.deletee(x);
                    break;
                case 4:
                    s.printSparx();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please press valid choice");

            }
        }while(true);
    }
}
