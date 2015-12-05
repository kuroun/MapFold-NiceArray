package mapfold;

public class MapFold {
	public static void isNice(int[] a){
		int[] fx = new int[a.length];
		for(int i = 0; i < a.length; i++){
			fx[i] =f(a[i]);
		}
		System.out.println("Given array\n--------------------------------------------------------");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n--------------------------------------------------------");
		System.out.println("F(x)\n--------------------------------------------------------");
		for(int i = 0; i < fx.length; i++){
			System.out.print(fx[i] + "\t");
		}
		System.out.println("\n--------------------------------------------------------");
		System.out.println("G(x,y)\n--------------------------------------------------------");
		int initial = 0;
		for(int i = 0; i < fx.length; i++){
			System.out.print(g(initial, fx[i]) +"\t");
			initial = g(initial, fx[i]);
		}
	}
	private static int f(int x){
		return (x!=3 && x!=4) ? 0:x;
	}
	private static int g(int x, int y){
		return (x==4 && y==4) ? 4:(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{4, 4, 3, 1, 2};
		int[] b = new int[]{4, 5, 6, 1, 6,5,4};
		int[] c = new int[]{4,4,4,4,1};
		isNice(c);

	}

}
