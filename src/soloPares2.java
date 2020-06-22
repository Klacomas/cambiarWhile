import java.util.Scanner;

public class soloPares2 {

	public static void main(String[] args) {
		//Declaración de variables
		int n, i,cont;
		Scanner sc = new Scanner (System.in);

		//solicita valor para n
		System.out.println("Ingrese valor para n==>");
		n = sc.nextInt();
		cont=0;//inicializa contador en 0
		i=0;
		while (cont<=n) {
			if( i%2==0&&i!=0) {//Si 
				System.out.println(i);
			}
			cont++;
			i=i+2;
		}
	}

	}
