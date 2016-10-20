
public class ÜbungFisBas {
	public static void main(String[] args) {
// TODO Auto-generated method stub
	
	FisBas();
	//Fibonacci();
	
	}		
	public static void FisBas(){ 	
int i;
int n;
		
		for (i=1;i<=100;i++){
			n=i;
			if(n%5==0 && n%3==0){
				System.out.println("Fis Bas");
			}
			if (n%3==0){
				System.out.println("Fis");
			}
			if(n%5==0){
				System.out.println("Bas");
			}
			
			if (n%5!=0 && n%3!=0){
				System.out.println(n);
			}
		}						
	}
	
	
	
	public static void Fibonacci(){
		double a=0;
		double b=1;
		double c=0;

			while (c<1.3E308){
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	
}
