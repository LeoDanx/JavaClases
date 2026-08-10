package angelehl.parte4;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {

    public void cuerpoSentenciaIfElse(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes 1 - 12");
        int mes =sc.nextInt();

        System.out.println("Ingrese el anio (YYYY)");
        int anio = sc.nextInt();

        int numeroDias =0;

        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            numeroDias=31;
        }else if(mes ==4|mes ==6||mes == 9||mes ==11){
            numeroDias =30;
        }else if(mes ==2){

            if(anio%400==0 || ((anio%4==0)&& !(anio%100==0))){
                numeroDias=29;
            }else{
                numeroDias=28;
            }
        }
        System.out.println("numeroDias = "+numeroDias);
    }
}
