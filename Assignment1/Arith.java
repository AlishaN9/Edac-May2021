public class Arith
{
    public static void main(String args[])
	{
	String s1= args[0];
	String s2= args[1];
	
	int i= Integer.parseInt(s1);
	int j= Integer.parseInt(s2);
	
	//System.out.println("First Number :" +i);
	//System.out.println("Second Number :" +j);
	
	System.out.println("Expected Output :");
	System.out.println(i+" + "+j+ "=" +(i+j));
	System.out.println(i+" - "+j+ "=" +(i-j));
	System.out.println(i+" * "+j+ "=" +(i*j));
	System.out.println(i+" / "+j+ "=" +(i/j));
	System.out.println(i+" % "+j+ "=" +(i%j));
	}
}