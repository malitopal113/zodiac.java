package Burc;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int month, day;
		
		System.out.print("Doğduğunuz ay: ");
		month = inp.nextInt();
		
		
		System.out.print("Doğduğunuz gün: ");
		day = inp.nextInt();
		boolean isError = false;
		String burc = "";
		
		
		
		if ( (month >= 1 && month <= 12) && (day >= 1 && day <= 31)) 
		{
			if (month == 1) 
			{
				if (day < 22) 
				{
					burc = "Oğlak";
				}
				else 
				{
					burc = "Kova";
				}
			}
			if (month == 2) 
			{
				if (day < 19) 
				{
					burc = "Kova";
				}
				else 
				{
					burc = "Balık";
				}
			}
			if (month == 3) 
			{
				if (day < 21) 
				{
					burc = "Balık";
				}
				else 
				{
					burc = "Koç";
				}
			}
			if (month == 4) 
			{
				if (day < 21) 
				{
					burc = "Koç";
				}
				else 
				{
					burc = "Boğa";
				}
			}
			if (month == 5) 
			{
				if (day < 22) 
				{
					burc = "Boğa";
				}
				else 
				{
					burc = "İkizler";
				}
			}
			if (month == 6) 
			{
				if (day < 23) 
				{
					burc = "İkizler";
				}
				else 
				{
					burc = "Yengeç";
				}
			}
			if (month == 7) 
			{
				if (day < 23) 
				{
					burc = "Yengeç";
				}
				else 
				{
					burc = "Aslan";
				}
			}
			if (month == 8) 
			{
				if (day < 23) 
				{
					burc = "Yengeç";
				}
				else 
				{
					burc = "Başak";
				}
			}
			if (month == 9) 
			{
				if (day < 23) 
				{
					burc = "Başak";
				}
				else 
				{
					burc = "Terazi";
				}
			}
			if (month == 10) 
			{
				if (day < 23) 
				{
					burc = "Terazi";
				}
				else 
				{
					burc = "Akrep";
				}
			}
			if (month == 11) 
			{
				if (day < 22) 
				{
					burc = "Akrep";
				}
				else 
				{
					burc = "Yay";
				}
			}
			if (month == 12) 
			{
				if (day < 22) 
				{
					burc = "Yay";
				}
			
				else 
				{
					burc = "Oğlak";
				}
			}
		}
		else 
		{
			isError = true;
		}
		

			
		
		
		
		if (isError == true) 
		{
			System.out.println("Hatalı Giriş!!!");
		}
		else 
		{
			System.out.println("Merhaba, Burcunuz: " + burc + " :)");
		}
		
		
		
		
		
		
		
		
		/* 
		 * 
		 * 
		 * Koç Burcu : 21 Mart - 20 Nisan

			Boğa Burcu : 21 Nisan - 21 Mayıs
			
			İkizler Burcu : 22 Mayıs - 22 Haziran
			
			Yengeç Burcu : 23 Haziran - 22 Temmuz
			
			Aslan Burcu : 23 Temmuz - 22 Ağustos
			
			Başak Burcu : 23 Ağustos - 22 Eylül
			
			Terazi Burcu : 23 Eylül - 22 Ekim
			
			Akrep Burcu : 23 Ekim - 21 Kasım
			
			Yay Burcu : 22 Kasım - 21 Aralık
			
			Oğlak Burcu : 22 Aralık - 21 Ocak
			
			Kova Burcu : 22 Ocak - 19 Şubat
			
			Balık Burcu : 20 Şubat - 20 Mart
*/

	}

}
