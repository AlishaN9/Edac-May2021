class Division
{
    public static void main(String args[])

	{
	String s1= args[0];
	String s2= args[1];

	int i=Integer.parseInt(s1);
	int j=Integer.parseInt(s2);
	
	System.out.println("Test Data :" +i+ " / " +j);
 	System.out.println("Output :" +(i/j));
	}
}