package java2022_HW1;

public class SesliHarfler {

	public static void main(String[] args) {
		
		char harf = 'I';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		{	
			System.out.println("Kalın Sesli Harf");
			break;
		}
		default:
			System.out.println("İnce Sesli Harf");
		}

	}

}
