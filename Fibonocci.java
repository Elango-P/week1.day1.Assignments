package Week1.day1;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c=0, range=10;
for(int i=1;i<range;i++) {
	System.out.println(" "+a);
	c=a+b;
	a=b;
	b=c;
}
		
	}

}
