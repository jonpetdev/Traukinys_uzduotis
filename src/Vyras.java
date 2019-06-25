public class Vyras extends Keleiviai{
    String lytis;
    int faloDydis;

    Vyras(String vardas, String pavarde, int metai,String lytis,int faloDydis){
        super(vardas,pavarde,metai);
        this.lytis=lytis;
        this.faloDydis=faloDydis;

    }

    public String getLytis() {
        return lytis;
    }

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    public int getFaloDydis() {
        return faloDydis;
    }

    public void setFaloDydis(int faloDydis) {
        this.faloDydis = faloDydis;
    }

    @Override
    public String toString() {

        return " Vardas" + this.getVardas() + " Pavarde:" + this.getPavarde() + " Metai:" + this.getMetai()
                + " Lytis:" + this.getLytis() + " Krutines dydis:" + this.getFaloDydis();
    }
}
