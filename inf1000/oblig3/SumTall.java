import java.util.Scanner;

public class SumTall {

    static int Sum() {
        Scanner tastatur = new Scanner (System.in);
	int tall=1;
	int sum =0;
        while(tall !=0){
            tall = Integer.parseInt(tastatur.nextLine());
	    sum+=tall;
        }
        return sum;
    }


    public static void main (String [] args){
       int tall = Sum();
       System.out.println("Summen av alle tall du skrev inn ble '"+tall+"'.");
    }
}
