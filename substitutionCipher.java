import java.util.*;

class SubstitutionCipher
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String text,ctext="",dtext="";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key ="QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.print("Enter plain text:");
        text = sc.nextLine().toUpperCase();

        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);

            for(int j=0;j<26;j++)
            {
                if(ch==alphabet.charAt(j))
                {
                    ctext += key.charAt(j);
                    break;
                }
            }
            if(ch==' ')
                ctext += " ";
        }

        System.out.println("Cipher text :"+ctext);

        for(int i=0;i<ctext.length();i++)
        {
            char ch = ctext.charAt(i);

            for(int j=0;j<26;j++)
            {
                if(ch==key.charAt(j))
                {
                    dtext += alphabet.charAt(j);
                    break;
                }
            }
            if(ch==' ')
                dtext += " ";
        }

        System.out.println("Decrypted text :"+dtext);
    }
}