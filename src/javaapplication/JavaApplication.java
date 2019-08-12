package javaapplication;
import java.util.Random;
public class JavaApplication {
    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco();
        conta1.setAgencia(1425);
        conta1.setNumero(85296);
        conta1.setDigito(5);
        conta1.setSaldo(50.00);
        conta1.Status();
    }
    
}
