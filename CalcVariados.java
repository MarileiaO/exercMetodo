package exerciciosMetodos;

import java.util.Scanner;

public class CalcVariados {
	 public static int calcSoma( int soma,int num){
		 return (soma+num );
		
	}
	 public static int calcQuant( int cont,int quantidade){
		 return (quantidade + cont);
	 }
	 public static float calcMedia( float soma,float quantidade ){
		 return (soma+quantidade/2);
	 }
	 public static int calcMaior(int maior,int numero) {
		 return Math.max(maior, numero);
	 }
	 public static int calcMenor(int menor,int numero) {
		 return Math.min(menor, numero);
	 }
	
	 
	 

	public static void main(String[] args) {
		/* Faça um código Java que receba vários números (até que seja digitado -1) calcule e mostre: 
			 Um método para a calcular a soma dos números digitados 
			 Um método para exibir a quantidade de números digitados 
			 Um método para exibir a média dos números digitados 
			 Um método para exibir o maior número digitado 
			 Um método para exibir o menor número digitado*/
		
		int numero=0,Menor=0 ,Maior=0,soma = 0 ,par, impar,num = 0 ,quantidade=0, cont=0 ,maior=0,menor=0;
		float media ;
		Scanner lerTeclado = new Scanner(System.in);
	     System .out.print("digite o primeiro numero");
	     numero=lerTeclado .nextInt();
	     System .out.print("digite o segundo numero");
	     numero=lerTeclado .nextInt();
	     
	     
	     
	     while (numero == -1);
	     
	     System.out.println ("digite um numero ou ( -1 para sair_ ");
	     
	     if (numero!=-1);
	     System .out.print("digite o primeiro numero");
	     numero=lerTeclado .nextInt();
	     System .out.print("digite o segundo numero");
	     numero=lerTeclado .nextInt();
	     
	     
	     
	     
	     soma = calcSoma (soma,num);
	     quantidade= calcQuant(quantidade,cont);
	     media= calcMedia (soma,quantidade);
	     Maior=calcMaior(numero,maior);
	     Menor=calcMenor(numero,menor);
	     
	     
	     
	     System.out.println("a soma dos numero he"+soma);
	     System.out.println("a quantidade dos numero he"+quantidade);
	     System.out.println("a media dos numero he"+media);
	     System.out.println("o Maior dos numero he"+Maior);
	     System.out.println("o Menor dos numero he"+Menor);
	    
	     
	     
	     
	

		

	}

}
