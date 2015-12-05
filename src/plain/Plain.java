package plain;

public class Plain {

	public static boolean isNice(int[] a){
		boolean flag = true;
		int four = 0; 
		int three = 0;
		for(int i=0; i< a.length; i++){
			if(a[i] == 4) four = 4;
			if(a[i] == 3) three = 3;
		}
		if(four == 4 && three != 3){
			flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{4, 4, 3, 1, 2};
		int[] b = new int[]{4, 5, 6, 1, 6,5,4};
		int[] c = new int[]{1,5,4,3};
		System.out.println(isNice(a));
		System.out.println(isNice(b));
		System.out.println(isNice(c));

	}

}
