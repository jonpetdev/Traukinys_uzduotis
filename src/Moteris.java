public class Moteris extends Keleiviai{
    String lytis;
    String krutinesDydis;


    Moteris(String vardas, String pavarde, int metai,String lytis,String krutinesDydis){
        super(vardas,pavarde,metai);
        this.lytis=lytis;
        this.krutinesDydis=krutinesDydis;
    }

    public String getLytis() {
        return lytis;
    }

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    public String getKrutinesDydis() {
        return krutinesDydis;
    }

    public void setKrutinesDydis(String krutinesDydis) {
        this.krutinesDydis = krutinesDydis;
    }


    @Override
    public String toString() {

        return " Vardas:" + this.getVardas() + " Pavarde:" + this.getPavarde() + " Metai:" + this.getMetai()
                + " Lytis:" + this.getLytis() + " Krutines dydis:" + this.getKrutinesDydis();
    }

}
