import java.util.scanner;
public class Encryption
{
    public static void main(String []args)
    {
        System.out.print("Enter Plain Text : ");
        Scanner input=new Scanner(System.in);
        String plain_text =input.nextLine();
        System.out.print("\n Enter Key (Positive Number) : ");
        int Key= input.nextInt();
          if(Key>0)
              System.out.print("\n Cipher Text : ");
          else
			         System.out.print("\n...Retry...");
		
		      for(int i=0;i<plain_text.length();i++)
		        {
			        char chr=plain_text.charAt(i);
		        	int ascii=(int)chr;
		        	int ascii_increase=(int)chr+key;
		        	if((ascii_increase>90 && ascii_increase<97)||(ascii_increase>122))
		      	    	ascii_increase-=26;
		        	System.out.print((char)ascii_increase);
              }
          }
}
    
    
    }


}
