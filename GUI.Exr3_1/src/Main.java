import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {

        String name1 = JOptionPane.showInputDialog("Enter your first number:");

        int number1 = Integer.parseInt(name1);

        String name2 = JOptionPane.showInputDialog("Enter your second number:");

        int number2 = Integer.parseInt(name2);

        int sum = number1 + number2;
        String name = Integer.toString(sum);

        String message = String.format("Your result is: %s!", name);
        JOptionPane.showMessageDialog(null, message);

    }

}
