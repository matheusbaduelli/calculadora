package calcsimples;

import java.util.Scanner;
public class Calcsimples {

   
    public static void main(String[] args) {
        double n1,n2;
        int op;
        double soma, subtracao, multiplicacao, divisao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o primeiro valor: ");
        n1 = entrada.nextDouble();
        System.out.println("informe o segundo valor: ");
        n2 = entrada.nextDouble();
        
        System.out.println("selecione uma operação");
        System.out.println("[1] soma ");
        System.out.println("[2] subtração ");
        System.out.println("[3] multiplicação ");
        System.out.println("[4] divisão ");
        System.out.println(" Digite sua opção: ");
        op = entrada.nextInt();
        
        switch(op){
            case 1:
                soma = n1 + n2;
                System.out.println("A soma e: " +soma);
                break;
            case 2:
                subtracao = n1-n2;
                System.out.println("A subtração e:" +subtracao);
                break;
            case 3:
                multiplicacao = n1*n2;
                System.out.println("A subtração e: " +multiplicacao);
                break;
            case 4:
                if(n1<n2){
                    System.out.println("inpossivel realizar o calculo");
                }
                else{
                    divisao = n1/n2;
                    System.out.println("A divisão e: "+divisao );
                    

                    
                
                }
                break;
                
            default:
                System.out.println("falha na execução." );

               

               
                
                        
                
        
        
        
        }
        
        
        
       
    }
    
}
