import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your are " + height + " cm tall");
		
		calculator();
	}
	
	public static void calculator() {
		System.out.println("=-=-=-=-=-=-=-=-StartCalculatorSum=-=-=-=-=-=-=-");
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int sum = num1 + num;
		JOptionPane.showMessageDialog(null, "The sum is " + sum);
		System.out.println("=-=-=-=-=-=-=-=-EndCalculatorSum=-=-=-=-=-=-=-");
	}
}
