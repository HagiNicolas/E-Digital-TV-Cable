import java.util.Map;
import javax.swing.JOptionPane;

public class ButtonActions {
    public static void f1_b1ActionPerformed(Fereastra1 f1, Fereastra2 f2) {
        f1.setVisible(false);
        f2.setVisible(true);
    }

    public static void f1_b2ActionPerformed(Fereastra1 f1, Fereastra3 f3) {
        f1.setVisible(false);
        f3.setVisible(true);
    }

    public static void f2_b2ActionPerformed(Fereastra2 f2, Fereastra1 f1) {
        f2.setVisible(false);
        f1.setVisible(true);
    }

    public static void f2_b1ActionPerformed(Fereastra2 f2, Fereastra1 f1) {
        String nume = f2.getT1().getText();
        String prenume = f2.getT2().getText();
        String adresa = f2.getT3().getText();
        String email = f2.getT4().getText();

        try {
            
        	if (nume.isEmpty() || prenume.isEmpty() || adresa.isEmpty() || email.isEmpty()) {
                throw new Exception("Toate câmpurile trebuie completate.");
            }
        	
            if (!nume.matches("[a-zA-Z]+") || !prenume.matches("[a-zA-Z]+")) {
                throw new Exception("Numele și prenumele pot conține doar litere.");
            }

            Persoana persoana = new Persoana(nume, prenume, adresa, email);

            String pachetNume = f2.getLs().getSelectedItem().toString();
            Pachet pachet = new Pachet(pachetNume);

            ServiciuInternet serviciuInternet = null;
            if (f2.getC2().isSelected()) {
                serviciuInternet = new ServiciuInternet(1.4);
            }

            Abonament abonament = new Abonament(persoana, pachet, serviciuInternet);
            ClientFileManager.adaugaClient(abonament);
            JOptionPane.showMessageDialog(null, "Abonament creat cu codul: " + abonament.getCod());
            f2.getT1().setText("");
            f2.getT2().setText("");
            f2.getT3().setText("");
            f2.getT4().setText("");
            f2.getLs().setSelectedIndex(0);
            f2.getC2().setSelected(false);
            f2.setVisible(false);
            f1.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void f3_b2ActionPerformed(Fereastra3 f3, Fereastra1 f1) {
        f3.setVisible(false);
        f1.setVisible(true);
    }

    public static void f3_b1ActionPerformed(Fereastra3 f3, Fereastra1 f1) {
        String cod = f3.getT1().getText();

        try {
            int codAbonament = Integer.parseInt(cod);

            Map<Integer, Abonament> abonamentMap = Abonament.getAbonamentMap();
            Abonament abonament = abonamentMap.get(codAbonament);

            if (abonament != null) {
                double costEuro = calculeazaAbonamentCost(abonament);
                double costRon = costEuro * 4.95; 

                String stringEuro = String.format("%.2f", costEuro); 
                String stringRon = String.format("%.2f", costRon);

                String message = "Costul abonamentului cu codul " + codAbonament + " este:\n";
                message += "EURO: " + stringEuro + "\n";
                message += "RON: " + stringRon;

                JOptionPane.showMessageDialog(null, message);
            } else {
                JOptionPane.showMessageDialog(null, "Abonamentul cu codul " + codAbonament + " nu a fost găsit.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Codul abonamentului trebuie să fie un număr întreg.");
        }

        f3.getT1().setText("");
        f3.setVisible(false);
        f1.setVisible(true);
    }


    private static double calculeazaAbonamentCost(Abonament abonament) {
        double cost = abonament.getPachet().getCost();

        if (abonament.getServiciuInternet() != null) {
            cost += abonament.getServiciuInternet().getCost();
        }

        return cost;
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            Map<Integer, Abonament> abonamentMap = Abonament.getAbonamentMap();
            ClientFileManager.adaugaAbonament(abonamentMap);
        }));
    }
}