import java.io.* ;
class testing {
	public static void main (String args[]) {
		
		int Somme = 0 ; 
		for (int i = 1 ; i<11 ; i++)  {
			int a = (int)(Math.random()*20) ;
			//System.out.println(a) ;
			
			Somme = Somme + a ;
		}
		if (Somme >= 110 ) {
			System.out.println("Vous avez gagne");
			System.out.println("vous avez un score de " + Somme + " / 110") ;
		}
		
		else {
			System.out.println("Vous avez perdu");
			System.out.println("vous avez un score de " + Somme + " / 110") ;
		}
	}
}