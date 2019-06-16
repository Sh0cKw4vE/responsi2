/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectta;

/**
 *
 * @author Rama
 */
public class Responsi2 {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int i, j, num=1, a, b;
        for ( i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                do{
                    a =(int)(Math.random() * ((2 - 0) + 1)) + 0;
                    b =(int)(Math.random() * ((2 - 0) + 1)) + 0;
                } while(arr[a][b]!=0);
                arr[a][b]=num;
                num++;
            }
        }
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (k==1 && l==1) {
                    System.out.print("| "+"?"+" ");
                } else{
                    System.out.print("| "+arr[k][l]+" ");
                }
            } 
            System.out.print("|");
            System.out.println("");
        }
    }
}
