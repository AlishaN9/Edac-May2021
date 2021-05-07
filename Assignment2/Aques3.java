class Aques3
 {
   public static void main(String args[])
	int al=64;
	for(int i=1;i<=4;i++)
	 {
	  for(int j=1;j<=i;j++)
	  {
	  if(j>i)	
	  System.out.print(" ");
	  else
	  System.out.print((char)(al+j));
	  }
	System.out.println();
	}
	
}