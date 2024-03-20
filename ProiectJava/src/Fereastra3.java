import javax.swing.*;
import java.awt.*;
public class Fereastra3 extends JFrame{
	
	private JLabel l1;
	private JTextField t1;
	private JButton b1,b2;
	
	public Fereastra3()
	{
		super("Cost abonament");
		l1 = new JLabel("Cod abonament");
		t1 = new JTextField(10);
		b1 = new JButton("Afisare cost abonament");
		b2 = new JButton("Inapoi");
			JPanel p1 = new JPanel (new GridLayout(1,2,10,0));
			p1.add(l1); p1.add(t1);
			add(p1,BorderLayout.NORTH);
			JPanel p2 = new JPanel (new GridLayout(1,2,10,0));
			p2.add(b1); p2.add(b2);
			add(p2, BorderLayout.SOUTH);
	}
	public JTextField getT1() {
	    return t1;
	}
	public JButton getB1() {
 		return b1;
 	}
 	public JButton getB2() {
 		return b2;
 	}
}
