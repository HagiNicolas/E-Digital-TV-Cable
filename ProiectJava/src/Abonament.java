import java.util.*;

public class Abonament {
    private static int id = 0;
    private int cod;
    private Persoana persoana;
    private Pachet pachet;
    private ServiciuInternet serviciuInternet;
    private Calendar dataAbonare;
    private static Map<Integer, Abonament> abonamentMap = new HashMap<>();

    public Abonament(Persoana persoana, Pachet pachet) {
        this.cod = ++id;
        this.persoana = persoana;
        this.pachet = pachet;
        this.dataAbonare = Calendar.getInstance();
        abonamentMap.put(this.cod, this); 
    }

    public Abonament(Persoana persoana, Pachet pachet, ServiciuInternet serviciuInternet) {
        this.cod = ++id;
        this.persoana = persoana;
        this.pachet = pachet;
        this.serviciuInternet = serviciuInternet;
        this.dataAbonare = Calendar.getInstance();
        abonamentMap.put(this.cod, this);
    }

    public int getCod() {
        return cod;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    public Pachet getPachet() {
        return pachet;
    }

    public void setPachet(Pachet pachet) {
        this.pachet = pachet;
    }

    public ServiciuInternet getServiciuInternet() {
        return serviciuInternet;
    }

    public void setServiciuInternet(ServiciuInternet serviciuInternet) {
        this.serviciuInternet = serviciuInternet;
    }

    public Calendar getDataAbonare() {
        return dataAbonare;
    }

    public void setDataAbonare(Calendar dataAbonare) {
        this.dataAbonare = dataAbonare;
    }

    public static Map<Integer, Abonament> getAbonamentMap() {
        return abonamentMap;
    }
}
