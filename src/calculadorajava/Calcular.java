
package calculadorajava;
class Calcular {
    
    private static int num1;
    private static int num2;
    private static int num3;
    private static int resultado;
    
 
    public Calcular(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        Status();
    }
    public static int getresultado(){
        switch(num3){
            case 1:
                resultado = getsoma(num1,num2);
                break;
            case 2:
                resultado = getsubtracao(num1,num2);
                break;
            case 3:
                resultado = getmultiplicacao(num1,num2);
                break;
            case 4:
                resultado = getdivisao(num1,num2);
                break;
            default:
                System.out.println("indisponivel");
        }
        return resultado;
    }
    public static int getnum2(){
        return num2;
    }    
    public static int getnum1(){
        return num1;
    } 
//    metédos para Calcular;
    public static int getsoma(int x , int y){
        int resultado =  x + y ;
        return resultado;
    }
    public static int getsubtracao(int x , int y){
        int resultado =  x - y ;
        return resultado;
    }
    public static int getmultiplicacao(int x , int y){
        int resultado =  x * y ;
        return resultado;
    }
    public static int getdivisao(int x , int y){
        int resultado =  x / y ;
        return resultado;
    }
    
    public static void Status(){
        System.out.printf("Primeiro Numero: %d  \nSegundo  Numero: %d\nResultado: %d    ", getnum1(),getnum2(),getresultado());
       
    }
    
}
