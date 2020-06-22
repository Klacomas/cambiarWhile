import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		//Declaración de variables
		int i,nro1, nro2,temp,suma, nMax;
		Scanner sc = new Scanner (System.in);
	
		//solicita valor
		System.out.println("Ingrese valor==>");
		nMax = sc.nextInt();
	
		nro1=0;//inicializa nro1 en 0
		nro2=1;
		System.out.println(nro1);			
		System.out.println(nro2);			

		suma=0;//Inicializa suma en 0
		i=0;
		while (i<=nMax) {
			suma=nro1 + nro2;//0+1
			System.out.println(suma);	//0-1		
			temp=nro2;//1
			nro2=suma;//1
			nro1=temp;//1
			i++;
		}
		}

	}
