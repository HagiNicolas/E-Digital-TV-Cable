import javax.swing.*;
import java.awt.*;

public class Fereastra2 extends JFrame{
	
	private JLabel l1,l2,l3,l4,l5;
	private JTextField t1,t2,t3,t4;
	private JButton b1,b2;
	private JComboBox ls;
	private JCheckBox c2;
	

	public Fereastra2() {
		super("Abonament nou");
	l1 = new JLabel("Nume");
	l2 = new JLabel("Prenume");
	l3 = new JLabel("Adresa");
	l4 = new JLabel("Adresa e-mail");
	l5 = new JLabel("Programs Package");
	c2 = new JCheckBox("Internet service");
	t1 = new JTextField(20);
	t2 = new JTextField(20);
	t3 = new JTextField(30);
	t4 = new JTextField(30);
	b1 = new JButton("Creare abonament");
	b2 = new JButton("Inapoi");
	String[] lista = {"BAZA","BAZA + HBO","BAZA + CINEMAX","BAZA+","EXTRA","EXTRA + HBO","EXTRA + CINEMAX","EXTRA+"};
	ls = new JComboBox(lista);
	
		JPanel p1 = new JPanel(new GridLayout(4,2,10,10));
			p1.add(l1);p1.add(t1);
			p1.add(l2);p1.add(t2);
			p1.add(l3);p1.add(t3);
			p1.add(l4);p1.add(t4);
			add(p1,BorderLayout.NORTH);
			
		JPanel p2 = new JPanel(new GridBagLayout());
			GridBagConstraints lungime = new GridBagConstraints();
			lungime.anchor = GridBagConstraints.WEST;
			lungime.insets = new Insets(0, 10, 0, 0); 
			p2.add(l5, lungime);p2.add(ls); 
			lungime.gridx = 1; p2.add(c2,lungime);
			add(p2,BorderLayout.CENTER);
		
		JPanel p3 = new JPanel(new GridLayout(1,2,5,5));
			p3.add(b1); p3.add(b2); add(p3,BorderLayout.SOUTH);
		
	}
	public JTextField getT1() {
	    return t1;
	}

	public JTextField getT2() {
	    return t2;
	}

	public JTextField getT3() {
	    return t3;
	}

	public JTextField getT4() {
	    return t4;
	}
	public JComboBox getLs() {
	    return ls;
	}

	public JCheckBox getC2() {
	    return c2;
	}
	public JButton getB1() {
 		return b1;
 	}
 	public JButton getB2() {
 		return b2;
 	}
	
}
