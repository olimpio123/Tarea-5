package Clase01;

public class Main1 {
    public static void main(String[] args) {
        
        Interes interes1 = new Interes(20000.00,0.05,20.00);
        
       
       
        System.out.println("capital: "+interes1.obtenerNumero1());
        System.out.println("interes: "+interes1.obtenerNumero2());
        System.out.println("periodo en meses: "+interes1.obtenerNumero3());
        interes1.calcularMontoAcumulado();
       
    }
}