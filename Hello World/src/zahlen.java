
public class zahlen {
static int x1=12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int n = 5;

	
	
	for (int i = 2; i <= n; i++) {
		boolean isPrimzahl = true;
			for (int j = 2; j < i && isPrimzahl; j++) {
				if ((i % j) == 0) {
					isPrimzahl = false;
					}
				}

	
			
	if (isPrimzahl) {
		System.out.println(i + " ist eine Primzahl!");
				}

		}
	
	}
	
}
