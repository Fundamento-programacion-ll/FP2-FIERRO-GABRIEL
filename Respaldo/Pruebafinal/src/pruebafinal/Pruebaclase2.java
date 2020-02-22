
package pruebafinal;

public class Pruebaclase2 {
    int suma;
    int multiplicacion;
    public void suma(int numero[][],int i,int j,int f,int c){
        if(f<=3 && c<=3){
            suma=numero[0][0]+numero[1][1]+numero[2][2];
            multiplicacion=numero[2][0]*numero[1][1]*numero[0][2];
        }else if(f==4 && c==4){
            suma=numero[0][0]+numero[1][1]+numero[2][2]+numero[3][3];
            multiplicacion=numero[3][0]*numero[2][1]*numero[1][2]*numero[0][3];
        }else if(f==5 && c==5){
            suma=numero[0][0]+numero[1][1]+numero[2][2]+numero[3][3]+numero[4][4];
            multiplicacion=numero[4][0]*numero[3][1]*numero[2][2]*numero[1][3]*numero[0][4];
        }else if(f==6 && c==6){
            suma=numero[0][0]+numero[1][1]+numero[2][2]+numero[3][3]+numero[4][4]+numero[5][5];
            multiplicacion=numero[5][0]*numero[4][1]*numero[3][2]*numero[2][3]*numero[1][4]*numero[0][5];
        }else if(f==7 && c==7){
            suma=numero[0][0]+numero[1][1]+numero[2][2]+numero[3][3]+numero[4][4]+numero[5][5]+numero[6][6];
            multiplicacion=numero[6][0]*numero[5][1]*numero[4][2]*numero[3][3]*numero[2][4]*numero[1][5]*numero[0][6];
        }else if(f==8 && c==8){
            suma=numero[0][0]+numero[1][1]+numero[2][2]+numero[3][3]+numero[4][4]+numero[5][5]+numero[6][6]+numero[7][7];
            multiplicacion=numero[7][0]*numero[6][1]*numero[5][2]*numero[4][3]*numero[3][4]*numero[2][5]*numero[1][6]*numero[0][7];
        }
    }
    public int resultado(){
        return suma;
    }
    public int resultadomultiolicacion(){
        return multiplicacion;
    }
}
