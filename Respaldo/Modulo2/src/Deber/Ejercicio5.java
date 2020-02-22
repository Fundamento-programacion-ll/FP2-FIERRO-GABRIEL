
package Deber;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        int op1=0;
        int n1=0;
        String op2 ="";
        int tam, num;
        double respuesta = 0;
        int ej1 []=new int[5];
        int i;
        double ej3[] =new double [4];
        int n;
        int op;
        int j;
        int aux;
        int min;
        int num2;
        double acum=0;
        double mayor;
        double prom;
        double cont;
        Scanner sc=new Scanner (System.in);
        DecimalFormat Df=new DecimalFormat("#.00");
        
        do{
            menu();
            op1=sc.nextInt();
            switch (op1){
                case 1:
                    System.out.println("Escogio la opcion 1");
                    for (i=0;i<4;i++){
                    System.out.println("Ingrese la nota "+(i+1)+": ");
                    ej3[i]=sc.nextDouble();
                    }
                    for (i=0;i<1;i++){
                        if(ej3[i]>=0 && ej3[i]<=20){
                            respuesta=(ej3[0]+ej3[1]+ej3[2]+ej3[3])/4;
                            System.out.println(""+respuesta);
                            if(respuesta>=10 && respuesta<=14.5){
                                System.out.println("SUPLETORIO");
                            }else if(respuesta>14.5 && respuesta<=20){
                                System.out.println("APROBADO");
                            }else{
                                System.out.println("PERDIO EL AÑO");
                            }
                        }
                    }
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                case 2:
                    System.out.println("Escogio la opcion 2");
                    int ej2 []=new int[1];
                  
                System.out.println("Cantidad de numeros que desea ingresar");
                n1=sc.nextInt();
                
                System.out.println("Los numeros contenidos en el "+n1+" son:");
                for (i=1;i<=n1;i++){
                    System.out.println("numero "+i);
                }
            cont = 0;

                for(i = 1; i <= n1; i++){
                if(n1 % i== 0){
                cont++;
                }
                }       
               if(cont <= 2){
               System.out.println("El numero "+n1+" es primo");
               }else{
               System.out.println("El numero "+n1+" no es primo");
               }
                if(n1%2==0){
                for (i=1;i<=n1;i++){
                    if (i%2==0  ){
                    System.out.println("Par::"+Df.format(i)); 
                    }
                }
                }
                if (n1%2!=0){
                for (i=1;i<=n1;i++){    
                    if (i%2!=0 ){
                    System.out.println("Impar::"+Df.format(i));
                    }
                }
                } 
                System.out.println("Desea hacerlo nuevamente(s/n)");
                op2=sc.next();
            break;
                case 3:
                    System.out.println("Escogio la opcion 3");
                   
                    int num3[]= new int[5];
       
                       
                    for(i=0;i<5;i++){
                       System.out.println("Ingrese los numeros :"  );
                       num3[i]=sc.nextInt();
                    }

                    for(i=0;i<5-1;i++){
                            min=i;
                    for( j=i+1;j<5;j++){
                        if(num3[j]>num3[min]){
                        min=j;}
                    }
                    if(i!=min){
                       aux =num3[i];
                       num3[i]=num3[min];
                       num3[min] = aux;}
                    }
                    System.out.println(""); 
                    System.out.println("Los numeros de mayor a menor son:");
                    for(int k=0; k<5;k++){
                    System.out.print(Df.format(num3[k])+" " );
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
        System.out.println("1.Promedio de 4 notas");
        System.out.println("2.Almacerna y mostrar valores pares, impares y primos de un numero");
        System.out.println("3.Ingresar 5 numeros y mostrar de mayor a menor");
    }   
}