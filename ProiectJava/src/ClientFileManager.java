import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Map;

public class ClientFileManager {
    private static final String CLIENT = "clienti.txt";
    private static final String ABONAMENT = "abonamente.txt";
    private static final String DATA = "yyyy-MM-dd";
    private static final SimpleDateFormat Data = new SimpleDateFormat(DATA);

    public static void adaugaClient(Abonament abonament) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cod: ");
        sb.append(abonament.getCod())
        		.append("\nNume: ")
                .append(abonament.getPersoana().getNume())
                .append("\nPrenume: ")
                .append(abonament.getPersoana().getPrenume())
                .append("\nAdresa: ")
                .append(abonament.getPersoana().getAdresa())
                .append("\nEmail: ")
                .append(abonament.getPersoana().getEmail())
                .append("\nData abonare: ")
                .append(Data.format(abonament.getDataAbonare().getTime()))
        		.append("\n");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CLIENT, true))) {
            writer.write(sb.toString());
            writer.newLine();
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void adaugaAbonament(Map<Integer, Abonament> abonamentMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ABONAMENT, true))) {
            for (Abonament abonament : abonamentMap.values()) {
                writer.write("Cod abonament: " + abonament.getCod());
                writer.newLine();
                writer.write("Nume: " + abonament.getPersoana().getNume());
                writer.newLine();
                writer.write("Prenume: " + abonament.getPersoana().getPrenume());
                writer.newLine();
                writer.write("Pachet: " + abonament.getPachet().getNume());
                writer.newLine();
                writer.write("Serviciu internet: ");
                if(abonament.getServiciuInternet() != null)
                	writer.write("DA");
                else
                	writer.write("NU");
                writer.newLine();
                if(abonament.getServiciuInternet() == null) 
                	writer.write("Cost pachet: " + abonament.getPachet().getCost());
                else {
                    double costTotal = abonament.getPachet().getCost() + abonament.getServiciuInternet().getCost();
                    
                    writer.write("Cost pachet: " + costTotal);
                    writer.newLine();
                }
                writer.newLine();
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
