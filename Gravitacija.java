import java.util.Scanner;

public class Gravitacija {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double nadmorskaVisina = sc.nextDouble();
        double masaZemlje = 5972000000000000000000000.0;
        double polmerZemlje = 6371000.0;
        double gravitacijskaKonstanta = 0.00000000006674;
        double visinaPlusPolmer = nadmorskaVisina + polmerZemlje;

        double gravitacijskiPospesek = (gravitacijskaKonstanta * masaZemlje) / Math.pow(visinaPlusPolmer, 2);
		
        System.out.println("OIS je zakon!");
    }
}