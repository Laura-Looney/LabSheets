package Books;
import javax.swing.*;

public class TestBook
    {
        public static void main(String[] args)
            {
                String output="";

                Book B1 = new Book();
                output+="gibberish\n\n" + B1.toString();

                Book B2 = new Book("Harry Potter", "42069", 30.00, 1000);
                output+= "\n\njust putting in words\n\n" + B2.toString();

                JOptionPane.showMessageDialog(null, output, "Book data", JOptionPane.INFORMATION_MESSAGE);
            }
    }
