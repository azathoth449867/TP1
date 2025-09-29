package packagetp1;

public class Employe {
    // données
    private String nom;
    private String numero;
    private double salaireHoraire;
    private double nbreHeuresSemaine;
    private int anciennete;
    public static final double ASSURANCE_EMPLOI = 0.111;
    public static final double FOND_DE_PENSION = 0.0136;
    public static final double COTISATION_SYNDICALE = 20;
    public static final double IMPOT_FEDERAL = 0.19;
    public static final double IMPOT_PROVINCIAL = 0.20;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    public double getNbreHeuresSemaine() {
        return nbreHeuresSemaine;
    }

    public void setNbreHeuresSemaine(double nbreHeuresSemaine) {
        this.nbreHeuresSemaine = nbreHeuresSemaine;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    // méthode constructeur
    public Employe(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        this.nom = nom;
        this.numero = numero;
        this.salaireHoraire = salaireHoraire;
        this.nbreHeuresSemaine = nbreHeuresSemaine;
        this.anciennete = anciennete;
    }


    public double salaireBrut(){
        return this.salaireHoraire * this.nbreHeuresSemaine > 0 ? this.salaireHoraire * this.nbreHeuresSemaine : 0;
    }

    public double salaireNetAvantImpot(){
        double brut = this.salaireBrut();
        double salaire = brut - (brut * ASSURANCE_EMPLOI) - (brut * FOND_DE_PENSION) - COTISATION_SYNDICALE;
        return salaire > 0 ?  salaire : 0;
    }

    public double impotFederal(){
        return this.salaireNetAvantImpot() * IMPOT_FEDERAL;
    }

    public double impotProvincial() { return this.salaireNetAvantImpot() * IMPOT_PROVINCIAL; }

    public double salaireNetApresImpot() { return this.salaireNetAvantImpot() - impotFederal() - impotProvincial(); }

    public int joursVacances() {
        char classeEmployer = this.numero.charAt(0);

        switch (classeEmployer) {
            case '1': return 5 + this.anciennete;
            case '2': return 10 + this.anciennete;
            case '3': return 15 + this.anciennete;
            case '4': return 20 + this.anciennete;
            default: return 0;
        }
    }
    public void heuresSup(int heures){
        setNbreHeuresSemaine(this.nbreHeuresSemaine + (heures > 0 ? heures : 0));
    }



}