import java.util.Scanner;

public class Assignment2{
    public static void main(String[] args){
        //1. Prompt for a line of input to be URL encoded
        System.out.println("Enter a line of text to be URL encoded");
        //2. Read the line of text into a String (using the Scanner class nextLine method)
        //I forgot
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        //3. Print the line that was read.
        System.out.println("The string read is: " + input);
        //4. Print the number of characters in the line (using String.length);
        System.out.println("Length in chars is: " + input.length());
        //5. Create an output String that is the URL encoded version of the input line (see below for details on encoding).
        /*The ASCII characters 'a' through 'z', 'A' through 'Z',  '0' through '9', '_' (underscore), '-' (dash), '.' (dot), and '*' (asterisk) remain the same.
The space (blank) character ' ' is converted into a plus sign '+'.
All other characters are converted into the 3-character string "%xy", where xy is the two-digit hexadecimal representation of the lower 8-bits of the character.*/
//charAt() Opposit of indexOf()?
String encodedLine = "";
for(int i=0; i<input.length(); i++){
    int charCode = input.charAt(i);
    if((charCode >= 48 && charCode <= 57) || charCode == 42 || 
    charCode == 46 || charCode == 95 || (charCode >= 65 && charCode <=90) || (charCode >= 97 && charCode <=122) ) encodedLine +=input.charAt(i);
    else if(charCode == 32) encodedLine += '+';
    else {
        encodedLine +='%' + Integer.toHexString(charCode);
    }
}
//6. Print the URL encoded String
System.out.println("The encoded string: " + encodedLine);
//7. Print the number of characters in the encoded String. 
System.out.println("Length in chars is: " + encodedLine.length());

//space 32 (+)
//0 to 9 48 to 57 (same)
// * 42, . 46, - 45, _ 95 (same)
//ABC 65 to 90, abc 97 to 122 (same)
//else '%' + hexValue; Integer.toHexString(A);     

    }
}