
public class big{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,6,10,5,4,3};
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
				
			}
		
		}
		System.out.println("The Highest value"+" "+big);		
	}

}