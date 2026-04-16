import java.util.*;
class CaserCipher
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); // adding keyboard to program
String text,ctext="",dtext="";
int shift;
System.out.println("Enter text:");
text = sc.nextLine(); // Hello
System.out.println("Enter shift value:");
shift = sc.nextInt(); //3
for(int i=0;i<text.length();i++) // 0 to 4
{
char ch;
ch = text.charAt(i); // H
if(ch>='A'&&ch<='Z') //
{
ctext = ctext+ (char)((ch-'A'+shift)%26+'A'); // ""+(72-
65+3)%26 +65 = 10+65 = 75
}
else if(ch>='a'&&ch<='z') 
{
ctext = ctext+ (char)((ch-'a'+shift)%26+'a'); }
else
{
ctext = ctext+ch;
}
}
for(int i=0;i<ctext.length();i++) // 0 to 4
{
char ch;
ch = ctext.charAt(i); // H
if(ch>='A'&&ch<='Z') //
{
dtext = dtext+ (char)((ch-'A'+26-shift)%26+'A');
// ""+(72-65+3)%26 +65 = 10+65 = 75
}
else if(ch>='a'&&ch<='z') //
{
dtext = dtext+ (char)((ch-'a'+26-shift)%26+'a');
}
else
{
dtext = dtext+ch;
}
}
System.out.println("Encrypted text :"+ctext);
System.out.println("Decrypted text :"+dtext);
}
}