import java.util.Scanner;

class CaesarCipher
{
    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message to encrypt: ");
        String message = input.nextLine();
        System.out.println("Enter a key: ");
        int key = input.nextInt();

        System.out.println("Text : " + message);
        System.out.println("Shift : " + key);
        System.out.println("Cipher: " + encrypt(message, key));
    }
}
