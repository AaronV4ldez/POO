public class Vacuna {
    private String nomvacuna;
    private String marcavacuna;
    private int ndosis;

    public Vacuna(String nomvacuna, String marcavacuna, int ndosis) {
        this.nomvacuna = nomvacuna;
        this.marcavacuna = marcavacuna;
        this.ndosis = ndosis;
    }

    public String getNomvacuna() {
        return nomvacuna;
    }

    public void setNomvacuna(String nomvacuna) {
        this.nomvacuna = nomvacuna;
    }

    public String getMarcavacuna() {
        return marcavacuna;
    }

    public void setMarcavacuna(String marcavacuna) {
        this.marcavacuna = marcavacuna;
    }

    public int getNdosis() {
        return ndosis;
    }

    public void setNdosis(int ndosis) {
        this.ndosis = ndosis;
    }
}
