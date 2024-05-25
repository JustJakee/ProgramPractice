import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a string value: ");
         // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        String s = reader.readLine();

        //busString s = "geeksforgeeks";
        System.out.print("Here is the encrypted string: ");
        polybiusCipher(s);
    }

    static void polybiusCipher(String s) 
    {
        int row, col;
        
        for (int i = 0;i < s.length(); i++) 
        {
        
            row = (int)Math.ceil((s.charAt(i) - 'a') / 5) + 1;
        
            col = ((s.charAt(i) - 'a') % 5) + 1;
        
            if (s.charAt(i) == 'k') 
            {
                row = row - 1;
                col = 5 - col + 1;
            }
        
            else if (s.charAt(i) >= 'j')
            {
                if (col == 1) 
                {
                    col = 6;
                    row = row - 1;
                }
                col = col - 1;
            }
            System.out.print(row +""+ col);
        }
        
        System.out.println();
    }
}
