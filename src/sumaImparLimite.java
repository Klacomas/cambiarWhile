import java.util.Scanner;

public class sumaImparLimite {

	public static void main(String[] args) {
		//Declaraci�n de variables
		int nMin, nMax, i,suma;
		Scanner sc = new Scanner (System.in);

		//solicita valores
		System.out.println("Ingrese valor m�nimo==>");
		nMin = sc.nextInt();
		System.out.println("Ingrese valor m�ximo==>");
		nMax = sc.nextInt();

		i=nMin;//asigna valor de inicio a i
		suma=0;//Inicializa suma en 0
		while (i<=nMax) {
			if( i%2!=0) {//Si es impar
				suma=suma+i;
			}
			i++;
		}
		System.out.println(suma);
	}

}
