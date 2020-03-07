
public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
	    System.out.println(i3);
	    
	    
	    int i4 = ++i3; // i3 = i3+1;
	    System.out.println(i4);
	    System.out.println(i3);
	    
	    int i5 = i3++; // i3 = i3 + 1 ;
	    System.out.println(i5);
	    System.out.println(i3);
	    int i6 = ++i3;
	    		System.out.println(i6);
	    		System.out.println(i3);
	    int i7 = i3++;
	    System.out.println(i3); // 9
	    System.out.println(i7);
	    
	    int i = 5;
	    int j = 2;
	    
	    System.out.println(i + j);
	    System.out.println(i /(double) j);
	    System.out.println(i %(double) j);
	    
	    int x = 10;
	    int y = 4;
	    System.out.println(x % y);

	}

}
