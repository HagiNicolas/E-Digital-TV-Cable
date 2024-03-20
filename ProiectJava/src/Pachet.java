
public class Pachet {
	

    private String nume;
    
    public Pachet(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }


    public double getCost() {
        switch (nume) {
            case "BAZA":
                return 0.7;
            case "BAZA + HBO":
                return 0.75;
            case "BAZA + CINEMAX":
                return 0.8;
            case "BAZA+":
                return 1.12;
            case "EXTRA":
                return 0.8;
            case "EXTRA + HBO":
                return 1;
            case "EXTRA + CINEMAX":
                return 0.94;
            case "EXTRA+":
                return 1.25;
            default:
                return 0;
        }
    }
}
