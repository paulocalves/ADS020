
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 18114290041
 */
public class CalculadoraClient {

    public static void main(String[] args) {

        try {
            CalculadoraRemota calc = (CalculadoraRemota) Naming.lookup("//127.0.0.1:1099/CalculadoraServer");
            System.out.println("2 +2 é igual a: " + calc.somar(2, 2));
            System.out.println("2 - 2 é igual a " + calc.subtrair(2, 2));
            System.out.println("2 x 2 é igual a " + calc.multiplicar(2, 2));
            System.out.println("2 / 2 é igual a " + calc.dividir(2, 2));

        } catch (Exception ex) {
            System.err.println("Erro: " + ex.getMessage());
        }

    }

}
