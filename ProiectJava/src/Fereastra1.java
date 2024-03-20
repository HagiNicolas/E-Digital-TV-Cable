import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Fereastra1 extends JFrame {
	
		private JButton b1,b2;
 	

 	public Fereastra1() {
 		super("Digital TV Cable");
 		b1 = new JButton("Creare abonament nou");
 		b2 = new JButton("Afisare cost abonament");
 
 		JPanel p1 = new JPanel(new GridLayout(1,2,10,0));
 		p1.add(b1);
 		p1.add(b2);
 		add(p1,BorderLayout.NORTH);
 	}
 	
 	public JButton getB1() {
 		return b1;
 	}
 	public JButton getB2() {
 		return b2;
 	}
}
