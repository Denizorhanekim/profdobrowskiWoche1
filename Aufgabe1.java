package profDobrowksiAufgabe1;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aufgabe 1
		System.out.println("-----Aufgabe 1-----");
		System.out.printf("Hello World!\n\n\n");
		
		//Aufgabe 2
		System.out.println("-----Aufgabe 2-----");
		System.out.println("What a great day to be alive!");
		System.out.println("");
	    //Aufgabe 3
		System.out.println("-----Aufgabe 3-----");
		for(int n=0;n<4;n++)
		{
			for(int i=0;i<6;i++)
			{
				if(n%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//Aufgabe 4
		System.out.println("-----Aufgabe 4-----");
		
		
	for(int n=0;n<7;n++)
	{
	 for(int i=n;i<7;i++)
	 {
		 if(n==2)
		 {
				System.out.print(".");
		 }
		 else
		 {
				System.out.print("*");
		 }
	 }
		System.out.println("");
	}
	System.out.println();
// Aufgabe 5
	System.out.println();
	System.out.println("-----Aufgabe 5-----");
	int height = 5;
	
	//dreieck 1 , linksbündig oben kurz unten lang
	for(int i=1;i<=height;i++) {
		//inner loop
		for(int j=1;j<=i;j++) {
			System.out.print("*");

		}
	System.out.println();
	
	}
	



	//dreieck 2 linksbündig , oben  lang unten kurz
	for(int rows=1;rows<=height-1;rows++) {
		//inner loop
		for(int columns=rows;columns<=height-1;columns++) {
			System.out.print("*");
		}
	    System.out.println();
	
			
		}
	System.out.println(" ");


	
	System.out.println();
	//Aufgabe 6
	System.out.println();
	System.out.println("-----Aufgabe 6----- ");
	
	/*
	 * äußere Loop: schleife für die Zeilenanzahl
	 * inneres Loop: drucken zeichen entweder * oder .
	 * wenn gerade Nummer Zeile --> dann starte mit *
	 * wenn ungerade Nummer Zeile --> starte mit  .
	 * Anzahl der Zahlen:9
	 * Anzahl der Zeichen  für jede Zeile: 9
	 */


for(int rows =0;rows<9;rows++)
{
	for(int column=0;column<9;column++)
	{
		if((rows %2 == 0 && column %2 == 0 )|| (rows %2 != 0 && column %2 != 0))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(".");
			

		}
	}
	System.out.println();
}
			
	
	System.out.println();
	//Aufgabe 7 tests
	System.out.println();
	System.out.println("-----Aufgabe 7----- tests");
	 int maxWert = getMax(5, 22, 150);
     System.out.println("The maximum value is: " + maxWert);
	
System.out.println();
//Aufgabe 8 tests
System.out.println();
System.out.println("-----Aufgabe 8----- tests");
System.out.println(uppercaseChar('g')); 
System.out.println(uppercaseChar('K'));
System.out.println(uppercaseChar('@')); 

	}

	// Aufgabe 7 Methode 
	 public static int getMax(int a, int b, int c) {
	        int maximum = a;

	       
	        if (b > maximum) {
	            maximum = b;
	        }
	        if (c > maximum) {
	            maximum = c;
	        }

	        
	        if (maximum == a && maximum == b && maximum == c) {
	            System.out.println("All numbers are equal.");
	        } else if (maximum == a && maximum == b) {
	            System.out.println("Maximum numbers are a and b.");
	        } else if (maximum == a && maximum == c) {
	            System.out.println("Maximum numbers are a and c.");
	        } else if (maximum == b && maximum == c) {
	            System.out.println("Maximum numbers are b and c.");
	        } else if (maximum == a) {
	            System.out.println("Maximum number is a.");
	        } else if (maximum == b) {
	            System.out.println("Maximum number is b.");
	        } else {
	            System.out.println("Maximum number is c.");
	        }

	        return maximum;
	    }
	  public static char uppercaseChar(char c) {
	        
	        if (c >= 'a' && c <= 'z') {
	           
	            return (char) (c - ('a' - 'A'));
	        }
	        
	        else if (c >= 'A' && c <= 'Z') {
	            return c;
	        }
	       
	        else {
	            return 0;
	        }
	    }

}
	
	
