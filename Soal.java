/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectta;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class Soal {
    
    public static int Faktorial(int x){
        int result=1;
        return Faktorial2(x, result);
    }
    public static int Faktorial2(int y, int z){
        if(y<=1){
            return z;
        } else{
            z*=y;
            return Faktorial2(y-1, z);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tipe, diff = 0, jmlsoal = 0;
        int a;
        int tipesoal;
        int[] c=new int[4];
        Scanner inputan= new Scanner(System.in);
        int n, score=0, persentase;
        double prsn;
        int w,x,y,z = 0;
        int e,f,g = 0;
        
        do{
            System.out.println("----------");
            System.out.println("TEST ANGKA");
            System.out.println("----------");
            System.out.println("");
            System.out.println("1. a, a+1, a+2, ...");
            System.out.println("2. a = b");
            System.out.println("   c = d");
            System.out.println("   e = ..");
            System.out.println("3. ");
            System.out.println("x __ y");
            System.out.println("  \\/");
            System.out.println("   z");
            System.out.println("4. MIXED");
            System.out.println("5. How To Play");
            System.out.print("Inputkan tipe soal \t\t\t= ");
        tipe=input.nextInt();
            if (tipe>5 || tipe <=0) {
                System.out.println("SALAH INPUT");
            }
            if(tipe!=5){
                do{
                    System.out.print("Inputkan Jumlah soal \t\t\t= ");
                    jmlsoal=input.nextInt();
                    if(jmlsoal==0){
                        System.out.println("Salah Input");
                    }
                }while(jmlsoal==0);
        } else{
            System.out.println("--------------");
            System.out.println("HOW TO PLAY :");
            System.out.println("--------------");
                    System.out.println("1. Pilih tipe soal yang anda inginkan (1-4)");
                    System.out.println("2. Pilih tingkat kesulitan (1-3 ; 1 = Mudah , 2 =Sedang , 3=Sulit");
                    System.out.println("   (Pemilihan tingkat kesulitan tidak berlaku pada mode MIXED)");
                    System.out.println("3. Inputkan jumlah soal sesuai keinginan");
                    System.out.println("4. Jawaban yang benar akan mendapat nilai +10, jika salah maka +0");
                    
        }
        } while(tipe>4 || tipe <=0);
        if(tipe<4){
            
            do{
                System.out.print("Inputkan tingkat kesulitan (1-3)\t= ");
                diff=input.nextInt();
            if(diff>3 || diff<1){
                System.out.println("Salah Input");
            }
            }while(diff>3 || diff<1);
        }
        
        int ans[]=new int[jmlsoal];
        int b[][]= new int[jmlsoal][8];
        for ( n = 0; n < jmlsoal; n++) {
            System.out.println("-----------------------------");
            System.out.println((n+1)+". ");
            System.out.println("-----------------------------");
            switch(tipe){
                case 1:
                    switch(diff){
                    case 1:
                        b[n][0]=(int)(Math.random() * (5-0)+1) +0;
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
                        System.out.print("xxx= ");
                        ans[n]=inputan.nextInt();
                        if(ans[n]==b[n][7]){
                            score+=10;
                            System.out.println("BENAR!");
                        } else {
                            System.out.println("SALAH!");
                        }
                    break;
                    case 3 :
                        b[n][0]=(int)(Math.random() * (5-0)+1) +0;
                        b[n][1]=(int)(Math.random() * (5-0)+1) +0;
                        c[1]=(int)(Math.random() * (5-0)+1) +0;
                        c[2]=(int)(Math.random() * (5-0)+1) +0;
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
                        System.out.print("xxx= ");
                        ans[n]=inputan.nextInt();
                        if(ans[n]==b[n][7]){
                            score+=10;
                            System.out.println("BENAR!");
                        } else {
                            System.out.println("SALAH!");
                        }
                    break;
                    case 2 :
                        b[n][0]=(int)(Math.random() * (5-0)+1) +0;
                        c[3]=(int)(Math.random() * (3-0)+1) +0;
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
                        System.out.print("xxx= ");
                        ans[n]=inputan.nextInt();
                        if(ans[n]==b[n][4]){
                            score+=10;
                            System.out.println("BENAR!");
                        } else {
                            System.out.println("SALAH!");
                        }
                    break;
                    }
                break;
                case 2:
                    switch(diff){
                        case 1:
                            y=(int)(Math.random() * (10-0)+1) +0;
                            for (int i = 0; i < 3; i++) {
                                x=(int)(Math.random() * (10-0)+1) +0;
                                
                                z=x+y;
                                if(i!=2){
                                    System.out.print(x+" = "+z);
                                    System.out.println("");
                                } else{
                                    System.out.print(x+" = ");
                                }
                            }
                            ans[n]=inputan.nextInt();
                            if(ans[n]==z){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 2:
                            y=(int)(Math.random() * (5-0)+1) +0;
                            for (int i = 0; i < 3; i++) {
                                x=(int)(Math.random() * (7-0)+1) +0;
                                System.out.print((i+1)+". ");
                                z=x*y;
                                if(i!=2){
                                    System.out.print(x+" = "+z);
                                    System.out.println("");
                                } else {
                                    System.out.print(x+" = ");
                                }
                            }
                            ans[n]=inputan.nextInt();
                            if(ans[n]==z){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 3:
                            y=(int)(Math.random() * (10-0)+1) +0;
                            for (int i = 0; i < 3; i++) {
                                x=(int)(Math.random() * (10-0)+1) +0;
                                System.out.print((i+1)+". ");
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
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                    }
                break;
                case 3:
                    switch(diff){
                        case 1:
                            for (int i = 0; i < 2; i++) {
                            e= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            f= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            g=e+f;
                            System.out.println(e+" __ "+f);
                            System.out.println("  \\/");
                            if(i!=1){
                                System.out.println("  "+g);
                            } else{
                                System.out.println("  ??");
                            }
                            }
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==g){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 2:
                            for (int i = 0; i < 2; i++) {
                            e= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            f= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            g=e*f;
                            System.out.println(e+" __ "+f);
                            System.out.println("  \\/");
                            if(i!=1){
                                System.out.println("  "+g);
                            } else{
                                System.out.println("  ??");
                            }
                            }
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==g){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 3:
                            for (int i = 0; i < 2; i++) {
                                do{
                            e= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            f= (int)(Math.random() * ((10 - 2) + 1)) + 2;
                            
                            g=(e+f)/2;
                                }while((e+f)%2!=0);
                            System.out.println(e+" __ "+f);
                            System.out.println("  \\/");
                            if(i!=1){
                                System.out.println("  "+g);
                            } else{
                                System.out.println("  ??");
                            }
                            }
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==g){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                    }
                break;
                case 4:
                    tipesoal=(int)(Math.random() * (11 - (-1)) + 1) - 1;
                    switch(tipesoal){
                        case 0:
                            b[n][0]=(int)(Math.random() * (5-0)+1) +0;
                            c[0]=(int)(Math.random() * (5-0)+1) +0;
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
                            System.out.print("xxx= ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==b[n][7]){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 1 :
                            b[n][0]=(int)(Math.random() * (5-0)+1) +0;
                            b[n][1]=(int)(Math.random() * (5-0)+1) +0;
                            c[1]=(int)(Math.random() * (5-0)+1) +0;
                            c[2]=(int)(Math.random() * (5-0)+1) +0;
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
                            System.out.print("xxx= ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==b[n][7]){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 2 :
                            b[n][0]=(int)(Math.random() * (5-0)+1) +0;
                            c[3]=(int)(Math.random() * (5-0)+1) +0;
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
                            System.out.print("xxx= ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==b[n][4]){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 3:
                            for (int i = 0; i < 3; i++) {
                                x=(int)(Math.random() * (10-0)+1) +0;
                                y=(int)(Math.random() * (10-0)+1) +0;
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
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 4:
                            for (int i = 0; i < 3; i++) {
                                x=(int)(Math.random() * (7-0)+1) +0;
                                y=(int)(Math.random() * (5-0)+1) +0;
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
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 5:
                            for (int i = 0; i < 3; i++) {
                                x=(int)(Math.random() * (10-0)+1) +0;
                                y=(int)(Math.random() * (10-0)+1) +0;
                                z=x*y;
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
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 6:
                            for (int i = 0; i < 2; i++) {
                            e= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            f= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            g=e+f;
                            System.out.println(e+" __ "+f);
                            System.out.println("  \\/");
                            if(i!=1){
                                System.out.println("  "+g);
                            } else{
                                System.out.println("  ??");
                            }
                            }
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==g){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 7:
                            for (int i = 0; i < 2; i++) {
                            e= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            f= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                            g=e*f;
                            System.out.println(e+" __ "+f);
                            System.out.println("  \\/");
                            if(i!=1){
                                System.out.println("  "+g);
                            } else{
                                System.out.println("  ??");
                            }
                            }
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==g){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 8:
                            for (int i = 0; i < 2; i++) {
                                do{
                                    e= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                                    f= (int)(Math.random() * ((10 - 0) + 1)) + 0;
                                    g=(e*f)/2;
                                } while((e*f)%2!=0);
                            System.out.println(e+" __ "+f);
                            System.out.println("  \\/");
                            if(i!=1){
                                System.out.println("  "+g);
                            } else{
                                System.out.println("  ??");
                            }
                            }
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==g){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 9:
                            for (int k = 1; k < 6; k++) {
                                System.out.println(k+" ="+Faktorial(k));
                            }
                            System.out.println("6  = ??");
                            System.out.print("?? = ");
                            ans[n]=inputan.nextInt();
                            if(ans[n]==Faktorial(6)){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                        case 10:
                            for(int gambar=0;gambar<2;gambar++){
                                int res = 0;
                                int lim, incr;
                                lim=(int)(Math.random() * ((5 - 1) + 1)) + 1;
                                incr=3+(lim-1)*2;
                                    for (int i = 1; i <= (lim+1); i++) {
                                        for (int j = 1; j <= incr; j++) {
                                            if(i==1){
                                                if(j<=lim){
                                                    System.out.print(" _");
                                                }else{
                                                }
                                            }   else{
                                                if(j%2!=0){
                                                    System.out.print("|");
                                                }else{
                                                    System.out.print("_");
                                                }
                                            }
                                        }System.out.println("");
                                    }
                                for(int hitung=lim;hitung>0;hitung--){
                                    res+=hitung*hitung;
                                }
                                if(gambar==0){
                                    System.out.println("RESULT = "+res);
                                } else{
                                    System.out.print("???= "); 
                                    ans[n]=inputan.nextInt();
                                        if(ans[n]==res){
                                            score+=10;
                                            System.out.println("BENAR!");
                                        } else {
                                            System.out.println("SALAH!");
                                        }
                                }
                            }
                        break;
                        case 11:
                            int arr[][]=new int[3][3];
                            int i, j, num=1, o, p;
                            for ( i = 0; i < 3; i++) {
                                for (j = 0; j < 3; j++) {
                                    do{
                                        o =(int)(Math.random() * ((2 - 0) + 1)) + 0;
                                        p =(int)(Math.random() * ((2 - 0) + 1)) + 0;
                                    } while(arr[o][p]!=0);
                                    arr[o][p]=num;
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
                            System.out.print("?= "); 
                            ans[n]=inputan.nextInt();
                            if(ans[n]==arr[1][1]){
                                score+=10;
                                System.out.println("BENAR!");
                            } else {
                                System.out.println("SALAH!");
                            }
                        break;
                    }
                break;
            }
        }
        System.out.println("-----------------------------");
        prsn=score;
        System.out.println("Skor anda adalah "+ score);
        System.out.println("Persentase nilai ="+((prsn/(jmlsoal*10))*100)+"%");
    }
}

