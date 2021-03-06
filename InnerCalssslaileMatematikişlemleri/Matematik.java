package InnerCalssslaileMatematikişlemleri;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matematik {
	
	public static class Toplama{
		
		private static double sayi1;
		private static double sayi2;
		
		public Toplama(){
			Scanner scanner = new Scanner(System.in);
			
			String a = JOptionPane.showInputDialog("Toplamak istediğiniz 1.sayi: ");
			double a_1 = Double.parseDouble(a);
			this.sayi1 = a_1;
			
			String b = JOptionPane.showInputDialog("Toplamak istediğiniz 2. sayi : ");
			double b_1 = Double.parseDouble(b);
			this.sayi2 = b_1;
			
		}
		
		
		public static void topla(){
			
			double toplam = sayi1 + sayi2;
			
			JOptionPane.showMessageDialog(null, "Toplam = " + toplam);
		}
	}
	
	public static class Cıkarma{
		
		private static double sayi1;
		private static double sayi2;
		
		public Cıkarma(){
			
			Scanner scanner = new Scanner(System.in);
			
			String a = JOptionPane.showInputDialog("Cikarmak istediğiniz 1.sayi: ");
			double a_1 = Double.parseDouble(a);
			this.sayi1 = a_1;
			
			String b = JOptionPane.showInputDialog("Cİkarmak istediğiniz 2. sayi : ");
			double b_1 = Double.parseDouble(b);
			this.sayi2 = b_1;
			
		}
		
		
		public static void cikar(){
			
			double cikar = sayi1 - sayi2;
			
			JOptionPane.showMessageDialog(null, "Toplam = " + cikar);
		}
	}
	
	public static class Alan{
		
		private static String sekil;
		
		public static void hesapla(){
			sekil = JOptionPane.showInputDialog("Hangi şeklin alanını bulmak istersiniz: ");
			if(sekil.equals("kare")) {
				
				String kenar = JOptionPane.showInputDialog("Karenin Kenar uzunluğunu giriniz: ");
				double kenar_1 = Double.parseDouble(kenar);
				
				JOptionPane.showMessageDialog(null, "Karenin Alanı = " + kenar_1*kenar_1);
			}
			
			else if (sekil.equals("dikdörtgen")){
				
				String kenar = JOptionPane.showInputDialog("Uzun Kenar: ");
				double kenar_1 = Double.parseDouble(kenar);
				
				String kenar2 = JOptionPane.showInputDialog("Kısa Kenar: ");
				double kenar_2 = Double.parseDouble(kenar2);
				
				JOptionPane.showMessageDialog(null, "Dikdörtgenin Alanı = " + kenar_2*kenar_1);
			}
			
			else if(sekil.equals("üçgen")) {
				
				String kenar = JOptionPane.showInputDialog("Kenar 1: ");
				double kenar_1 = Double.parseDouble(kenar);
				
				String kenar2 = JOptionPane.showInputDialog("Kenar 2: ");
				double kenar_2 = Double.parseDouble(kenar2);
				
				String kenar3 = JOptionPane.showInputDialog("Kenar 3 :");
				double kenar_3 = Double.parseDouble(kenar3);
				double u = (kenar_1 + kenar_2 + kenar_3)/2;
				
				JOptionPane.showMessageDialog(null, "Üçgenin Alanı = " + Math.sqrt(u*(u-kenar_1)*(u-kenar_2)*(u-kenar_3)));
						
			}
			
		}
	}
	
	
	public class Adim{
		
		private static int adim;
		
		public static void mesafe_hesapla() {
			
			String adim_1 = JOptionPane.showInputDialog("Kaç adım attınız ? ");
			
			int adim = Integer.parseInt(adim_1);
			
			String uzunluk_1 = JOptionPane.showInputDialog("Adım uzunlugunuz kaç metre ?");
			
			double uzunluk = Double.parseDouble(uzunluk_1); 
			
			
			JOptionPane.showMessageDialog(null, "Şu ana kadar " + uzunluk*adim + " metre kadar yürüdünüz.");
			
		}
	}
	
	
	
}
