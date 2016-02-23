package footballQBs;

// Paul Jureidini

import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class footballPasserRating {
	
	double a, b, c, d, passerRating, TD, YDS, INT, COMP, ATT;
	
	public void playerInfo()
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Pleases enter the player's number of passing attempts: ");
		ATT = scanner.nextInt();
		
		System.out.println("Pleases enter the player's number of completions: ");
		COMP = scanner.nextInt();
		
		System.out.println("Pleases enter the player's passing yards: ");
		YDS = scanner.nextInt();
		
		System.out.println("Pleases enter the player's touchdown passes: ");
		TD = scanner.nextInt();
		
		System.out.println("Pleases enter the player's number of interceptions: ");
		INT = scanner.nextInt();
	}
	
	public void equations()
	{
		a = ((COMP/ATT) - .3) * 5;
		b = ((YDS/ATT) - 3) * .25;
		c = (TD/ATT) * 20;
		d = 2.375 - (INT/ATT) * 25;
		
		passerRating = ((a + b + c + d)/6) * 100;
		double QB = Math.round(passerRating * 1.0) / 1.0;
				
		System.out.println("This QB's passing rate is: " + QB);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		footballPasserRating football = new footballPasserRating();
		football.playerInfo();
		football.equations();

	}

}
