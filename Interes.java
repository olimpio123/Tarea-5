package Clase01;

public class Interes {
   
    public Double numero1;
    public Double numero2;
    public Double numero3;
    public double M;
 
    
    

    //constructor  
    Interes(double capital, Double inte, Double tiempo)
    {
      establecerNumero1(capital);
      establecerNumero2(inte);
      establecerNumero3(tiempo);
    }



    void establecerNumero1(Double capital)
    {
        numero1 = capital;
    }
    Double obtenerNumero1()
    {
        return numero1;
    }
    void establecerNumero2(Double inte)
    {
       numero2 = inte;
         
    }
    double obtenerNumero2()
    {
        return numero2;
    }
  
    void establecerNumero3 (Double tiempo)
    {
        numero3 = tiempo;
    }
     Double obtenerNumero3()
    {
        return numero3;
    }
    
   
    
    void calcularMontoAcumulado()
    {
        M = Math.pow((obtenerNumero2()+1), obtenerNumero3()) * obtenerNumero1();
        System.out.println("el monto acumulado seria: "+M);
    }   

}