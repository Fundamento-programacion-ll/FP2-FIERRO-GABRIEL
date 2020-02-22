
package Deber;


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String letra;
        int op1=0;
        int pares = 0;
        int impares=0;
        int n1=1;
        String op2 ="";
        int tam, num;
        double respuesta = 0;
        String ej1 []=new String[1];
        int i;
        int ej3[] =new int [1];
        Scanner sc=new Scanner (System.in);
        
        do{
            menu();
            op1=sc.nextInt();
            switch (op1){
                case 1:
                    System.out.println("Escogio la opcion 1");
                    for (i=0;i<1;i++){
                    System.out.println("Ingrese la letra que desee");
                    ej1[i]=sc.next();
                    }
                    for (i=0;i<1;i++){
                    if(ej1[i].equals("a") || ej1[i].equals("e") || ej1[i].equals("i") || ej1[i].equals("o") || ej1[i].equals("u")){
                
                        System.out.println("La letra "+ej1[i]+" es vocal" );
                    }else{
                        System.out.println("La letra "+ej1[i]+" no es vocal");
                    }
                    }
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                case 2:
                    System.out.println("Escogio la opcion 2");
                    int ej2 []=new int[2];
                    
                    for (i=0;i<2;i++){
                    System.out.println("Ingrese el numero "+(i+1)+": ");
                    ej2[i]=sc.nextInt();
                    }
                    for (i=0;i<2;i++){
                        if (ej2[i]%2==0){
                            if(ej2[i]>10 && ej2[i]<150){
                                pares=ej2[i];
                            }else{
                                System.out.println("Los numeros no estan entre 10 y 150");
                            }
                            System.out.println("Los pares son: "+pares);
                        }else if(ej2[i]!=0) {
                            if(ej2[i]>10 && ej2[i]<150){
                                impares=ej2[i];
                            }else{
                                System.out.println("Los numeros no estan entre 10 y 150");
                            }
                            System.out.println("Los impares son: "+impares);
                        }    
                    }  
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                case 3:
                    System.out.println("Escogio la opcion 3");
                    System.out.println("Ingrese el numero");
                    num=sc.nextInt();
                    
                    for(i=1 ;i<=num;i++){
                            respuesta=(i)+=2;
                        if(respuesta<=num){
                            System.out.println("El numero incrementado en 3 es: "+respuesta);
                        }
                    }
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                    default:
                    break;      
            }    
        }while(op2.equals("S") || op2.equals("s"));
    }
        public static void menu(){
        System.out.println("Escoja la opcion que desee");
        System.out.println("1.Ingresar una letra");
        System.out.println("2.Ingresar dos numeros para saber si es par o impar");
        System.out.println("3.Ingresar cantidad de datos y aumentarlos en 3");
    }    
}
