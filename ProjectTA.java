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
public class ProjectTA {

    /**
     * @param x
     * @return 
     */
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
        int lim=1;
        int incr;
        int i,j;
        int res;
        for(int a=0;a<5;a++){
            res=0;
            incr=3+(lim-1)*2;
            for ( i = 1; i <= (lim+1); i++) {
                for ( j = 1; j <= incr; j++) {
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
            for(int x=lim;x>0;x--){
                res+=x*x;
            }
            System.out.println("RESULT ="+res);
            lim++;
            System.out.println("\n");
        }
        
//        1; 
//            +4
//        5;      +6
//            +10
//        14;     +6
//            +16
//        30;
//            +25
//        55;
        
        //System.out.println(" _ _ ");
        //System.out.println("|_|_|");
        //System.out.println("|_|_|");
        int a,b;
        do{
            a= (int)(Math.random() * ((100 - 1) + 1)) + 1;
            b= (int)(Math.random() * ((9 - 2) + 1)) + 2;
        } while(a%b!=0);
        System.out.println(b+" __ "+a);
        System.out.println("  \\/");
        System.out.println("  "+(a/b));
        int c,d;
        
        do{
            c= (int)(Math.random() * ((10 - 1) + 1)) + 1;
            d= (int)(Math.random() * ((100 - 1) + 1)) + 1;
        } while(d-c<=0);
        System.out.println(c+" __ "+d);
        System.out.println("  \\/");
        System.out.println("  "+(d-c));
        
        
        int e,f;
            e= (int)(Math.random() * ((10 - 1) + 1)) + 1;
            f= (int)(Math.random() * ((10 - 1) + 1)) + 1;
        System.out.println(e+" __ "+f);
        System.out.println("  \\/");
        System.out.println("  "+((e+f)/2));
//        System.out.println("   12");
//        System.out.println("");
//        System.out.println("     _");
//        System.out.println(" 5  / \\ 7");
//        System.out.println("10 |   | 14");
//        System.out.println("    \\ / ");
        for (int k = 1; k < 6; k++) {
           System.out.println(k+" ="+Faktorial(k));
        }
        System.out.println("6  = ??");
    }
}
