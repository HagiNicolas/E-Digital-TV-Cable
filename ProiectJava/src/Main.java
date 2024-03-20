import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fereastra1 f1 = new Fereastra1();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400, 70);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

        Fereastra2 f2 = new Fereastra2();
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(500, 300);
        f2.setResizable(false);
        f2.setLocationRelativeTo(null);
        f2.setVisible(false);

        Fereastra3 f3 = new Fereastra3();
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setResizable(false);
        f3.setSize(300, 100);
        f3.setLocationRelativeTo(null);
        f3.setVisible(false);

      
        f1.getB1().addActionListener(e -> ButtonActions.f1_b1ActionPerformed(f1, f2));
        f1.getB2().addActionListener(e -> ButtonActions.f1_b2ActionPerformed(f1, f3));
        f2.getB2().addActionListener(e -> ButtonActions.f2_b2ActionPerformed(f2, f1));
        f2.getB1().addActionListener(e -> ButtonActions.f2_b1ActionPerformed(f2, f1));
        f3.getB2().addActionListener(e -> ButtonActions.f3_b2ActionPerformed(f3, f1));
        f3.getB1().addActionListener(e -> ButtonActions.f3_b1ActionPerformed(f3, f1));
    }
}