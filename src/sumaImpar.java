import java.util.Scanner;

public class sumaImpar {

	public static void main(String[] args) {
		//Declaración de variables
		int n, i,cont,suma;
		Scanner sc = new Scanner (System.in);

		//solicita valor para n
		System.out.println("Ingrese valor para n==>");
		n = sc.nextInt();
		cont=0;//inicializa contador en 0
		i=0;
		suma=0;
		while (cont<=n) {
			if( i%2!=0) {//Si es impar
				suma=suma+i;
			}
			cont++;
			i++;
		}
		System.out.println(suma);
	}

	}
