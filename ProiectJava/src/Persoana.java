public class Persoana {
    private String nume;
    private String prenume;
    private String adresa;
    private String email;

    public Persoana(String nume, String prenume, String adresa, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }
 
    public String getPrenume() {
        return prenume;
    }
    public String getAdresa() {
        return adresa;
    }

    public String getEmail() {
        return email;
    }

}
