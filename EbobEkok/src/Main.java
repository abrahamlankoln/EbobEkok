import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2,ekok, ebob = 0;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen ilk sayiyi giriniz: ");
		num1 = deger.nextInt();
		System.out.print("lutfen ikinci sayiyi giriniz: ");
		num2 = deger.nextInt();
		if (num1 > num2) {
			for (int i = 1; i <= num2; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					ebob = i;
				}
			}
		} else {
			for (int i = 1; i <= num2; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					ebob = i;
				}
			}

		}
		 ekok=num1*num2/ebob;
		 System.out.println(ekok);
		 System.out.println(ebob);
	}

}
