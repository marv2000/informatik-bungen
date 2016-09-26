
public class zahlen {
static int grenze =100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	for (int i = 2; i <= grenze; i++) {
		boolean isPrim = true;
			
			for (int teiler = 2; teiler < i && isPrim; teiler++) {
				if ((i % teiler) == 0) {
					isPrim = false;
					}
			}
	if (isPrim) {
		System.out.println(i + " ist eine Primzahl!");
				}

		}
	
	
	}
	
}
