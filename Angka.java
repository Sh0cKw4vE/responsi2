/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectta;
/* REVISI
1. Buat lebih jelas, dirapikan
2. Tambahkan opsi difficulty
3. Tambahkan opsi memilih soal
*/
import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class Angka {
    public static void main(String[] args) {
        int a;
        int b[][]= new int[3][8];
        int c[]=new int[4];
        int ans[]=new int[6];
        Scanner inputan= new Scanner(System.in);
        int n, score=0;
        int w,x,y,z = 0;
        for ( n = 0; n < 6; n++) {
            switch(n){
                case 0:
                    b[n][0]=(int)(Math.random() * (5-1)+1) +1;
                    c[0]=(int)(Math.random() * (5-1)+1) +1;
                    for (int i = 1; i < 8; i++) {
                        b[n][i]=b[n][(i-1)]+c[0];
                    }
                    for (int i = 0; i < 8; i++) {
                        if(i==7){
                            System.out.print("xxx");
                        }else {
                            System.out.print(b[n][i]+", ");
                        }
                    } System.out.println("");
                    System.out.print("xxx=");
                    ans[n]=inputan.nextInt();
                    if(ans[n]==b[n][7]){
                        score+=10;
                    }
                    break;
                case 1 :
                    b[n][0]=(int)(Math.random() * (5-1)+1) +1;
                    b[n][1]=(int)(Math.random() * (5-1)+1) +1;
                    c[1]=(int)(Math.random() * (5-1)+1) +1;
                    c[2]=(int)(Math.random() * (5-1)+1) +1;
                    for (int i = 2; i < 8; i++) {
                        if(i%2!=0){
                            b[n][i]=b[n][(i-2)]+c[1];
                        } else{
                            b[n][i]=b[n][(i-2)]+c[2];
                        }
                    }
                    for (int i = 0; i < 8; i++) {
                        if(i==7){
                            System.out.print("xxx");
                        }else {
                            System.out.print(b[n][i]+", ");
                        }
                    } System.out.println("");
                    System.out.print("xxx=");
                    ans[n]=inputan.nextInt();
                    if(ans[n]==b[n][7]){
                        score+=10;
                    }
                    break;
                case 2 :
                    b[n][0]=(int)(Math.random() * (5-1)+1) +1;
                    c[3]=(int)(Math.random() * (5-1)+1) +1;
                    for (int i = 1; i < 5; i++) {
                        b[n][i]=b[n][(i-1)]*c[3];
                    }
                    for (int i = 0; i < 5; i++) {
                        if(i==4){
                            System.out.print("xxx");
                        }else {
                            System.out.print(b[n][i]+", ");
                        }
                    } System.out.println("");
                    System.out.print("xxx=");
                    ans[n]=inputan.nextInt();
                    if(ans[n]==b[n][4]){
                        score+=10;
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        x=(int)(Math.random() * (10-1)+1) +1;
                        y=(int)(Math.random() * (10-1)+1) +1;
                        z=x*(y+1);
                        if(i!=2){
                            System.out.print(x+", "+y+"= "+z);
                            System.out.println("");
                        } else{
                            System.out.print(x+", "+y+"= ");
                        }
                        
                    }
                    
                    ans[n]=inputan.nextInt();
                    if(ans[n]==z){
                        score+=10;
                    }
                    break;
                case 4:
                    for (int i = 0; i < 3; i++) {
                        x=(int)(Math.random() * (7-1)+1) +1;
                        y=(int)(Math.random() * (5-1)+1) +1;
                        z=x+y;
                        z*=z;
                        if(i!=2){
                            System.out.print(x+", "+y+"= "+z);
                            System.out.println("");
                        } else {
                            System.out.print(x+", "+y+"= ");
                        }
                        
                    }
                    
                    ans[n]=inputan.nextInt();
                    if(ans[n]==z){
                        score+=10;
                    }
                    break;
                case 5:
                    for (int i = 0; i < 3; i++) {
                        x=(int)(Math.random() * (10-1)+1) +1;
                        y=(int)(Math.random() * (10-1)+1) +1;
                        z=x*y+4;
                        if(i!=2){
                            System.out.print(x+", "+y+"= "+z);
                            System.out.println("");
                        } else {
                            System.out.print(x+", "+y+"= ");
                        }
                    }
                    
                    ans[n]=inputan.nextInt();
                    if(ans[n]==z){
                        score+=10;
                    }
                    break;
            }
        }
        System.out.println(score);
    }
}