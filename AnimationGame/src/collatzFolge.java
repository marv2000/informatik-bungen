
public class collatzFolge {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long n;
int i;    //Zahl
int j=0;
int z=1;
		for (i=1; i<1000000000;i++ ){
			n=i	;
	
		while(n>1 ){					//gerade Zahlen
			if ( n % 2==0) {
			n= n/2;
			}			
			else{						//Ungerade  ZAhlen
			n =3*n+1;
			}
		j++;    //Schritte
         }
		//System.out.println("Anzahl der Schritte von "+i +" :"+ j );		
		
		if (j>z){					//Mximum an Schriten
			System.out.println(i+"neus Maximum bei "+ j+" Schritten" );
			z=j;
		}
		
		j=0;

		}
		
		
		
		
		
}
	
	
	
}
