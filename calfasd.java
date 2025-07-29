import java.util.Scanner;

public class calfasd{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int calf;
		int calftotal=0;
		int total=0;
		do{
			System.out.print("Introduce sus calificaciones: ");
			calf =sc.nextInt();
			if (calf>=0 && calf<=10){
				calftotal++;
				total=calf+total;
				System.out.println(total);
			}
		} while(calf>=0);
		int promedio= total/calftotal;
		System.out.println("El promedio de su calificacion es de: "+promedio);
	}
}