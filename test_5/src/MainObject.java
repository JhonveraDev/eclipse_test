import javax.swing.JOptionPane;

public class MainObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null,"Welcome to AMAZON MOVIE");
		JOptionPane.showMessageDialog(null,"Type a number that want ");
		
		JOptionPane.showMessageDialog(null,"(1) Movies "+" (2)Series "+//Como crear en forma- de lista averiguar
		" (3)Books "+" (4)Magazines "+" (0)Exit");
		
		int facts;
		
		facts=Integer.parseInt(JOptionPane.showInputDialog("Type your Selection"));
		
		switch(facts) {
		
		case 1:
			JOptionPane.showMessageDialog(null,"Movies");
			break;
		case 2:
			JOptionPane.showMessageDialog(null,"Series");
			break;
		case 3:
			JOptionPane.showMessageDialog(null,"Books");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,"Magazines");
			break;
		case 0:
			JOptionPane.showMessageDialog(null,"Exit");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Default");;
		}
		
		
		
		
		
		
	}

}
