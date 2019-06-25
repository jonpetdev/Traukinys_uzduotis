import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Traukinys implements Veiksmai{

    final static int MAXVIETOS=5;

    Scanner sc = new Scanner(System.in);

    ArrayList <Keleiviai> list = new ArrayList<>();

    String [] stotele={"Sauletekio st.", "Antakalnio st.","Daukšos st.", "Sapiegos st.","Balio Dvariono st."
            ,"Mindaugo tilto st.", "Stoties st."};

    int traukinioBusena;
    String sarasas="";
    int stotelesCount=0;
    int judejimoKryptis=0;

    public void islaipintiKeleivi(){
        if(traukinioBusena==1) {
            Random rand = new Random();
            int randomSk = rand.nextInt(list.size());
            list.remove(randomSk);
            System.out.println("Keleivis islipo");
        }else if(traukinioBusena==2){
            System.out.println("traukinys vaziuoja, negalima islaipinti keleiviu ");
        }

    }

    public void sustoti(){
        System.out.println(stotele[stotelesCount]);
        traukinioBusena = 1;
        System.out.println("traukinys sustojo !");
        if (judejimoKryptis==0 ) {
            if(stotelesCount<stotele.length-1){
                stotelesCount++;
            }else{
                judejimoKryptis=1;
            }
        }else if(judejimoKryptis == 1){
            if(stotelesCount>0){
                stotelesCount--;
            }else{
                judejimoKryptis=0;
            }
        }

    }
//rr

    public void vaziuoti(){
        System.out.println("Važiuoja į: "+(stotele[stotelesCount]+1));
        traukinioBusena =2;
        System.out.println("Traukinys vaziuoja !");
    }

    public void gautiKeleiviuSarasa(){
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Moteris){
                System.out.println("Sk:"+ list.indexOf(i)+" "+list.get(i));
            }else if(list.get(i) instanceof Vyras){
                System.out.println("Sk:"+ list.indexOf(i)+" "+list.get(i));
            }
        }

    }

    public void irasytiKeleiviuSarasaFailas(String sarasas1) throws IOException {
        File file= new File("src/keleiviai.csv");
        FileWriter writer =new FileWriter(file);
        writer.write(sarasas1);
        writer.flush();

    }

    public void gautiKeleiviuSarasaFailui() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Moteris) {

                sarasas= sarasas + "" + list.get(i).getVardas() + ","
                        + list.get(i).getPavarde()+","
                        + list.get(i).getMetai()+","
                        +((Moteris) list.get(i)).getLytis()+","
                        +((Moteris) list.get(i)).getKrutinesDydis()+"\n";


            } else if (list.get(i) instanceof Vyras) {

                sarasas= sarasas + "" + list.get(i).getVardas() + ","
                        + list.get(i).getPavarde()+","
                        + list.get(i).getMetai()+","
                        +((Vyras) list.get(i)).getLytis()+","
                        +((Vyras) list.get(i)).getFaloDydis()+"\n";
            }
        }
    }

    public void ilaipintiKeleivi(){
        if(traukinioBusena==1) {
            if (list.size() <= MAXVIETOS) {
                System.out.println("Keleivis: [1]-Moteris-[1]\n" +
                        "[2]-Vyras-[2]");
                while (!sc.hasNextInt()) {
                    sc.next();
                }
                int pas = sc.nextInt();
                if (pas == 1) {
                    System.out.println("keleivio Vardas:");
                    String vardas = sc.next();
                    System.out.println("keleivio Pavarde:");
                    String pavarde = sc.next();
                    System.out.println("keleivio Metai:");
                    while (!sc.hasNextInt()) {
                        sc.next();
                    }
                    int metai = sc.nextInt();
                    String lytis = "Moteris";
                    System.out.println("Krutines dydis");
                    String krutinesDydis = sc.next();

                    Moteris mot = new Moteris(vardas, pavarde, metai, lytis, krutinesDydis);
                    list.add(mot);

                } else if (pas == 2) {
                    System.out.println("keleivio Vardas:");
                    String vardas = sc.next();
                    System.out.println("keleivio Pavarde:");
                    String pavarde = sc.next();
                    System.out.println("keleivio Metai:");
                    while (!sc.hasNextInt()) {
                        sc.next();
                    }
                    int metai = sc.nextInt();
                    String lytis = "Vyras";
                    System.out.println("Falo Dydis");
                    while (!sc.hasNextInt()) {
                        sc.next();
                    }
                    int faloDydis = sc.nextInt();
                    Vyras vyr = new Vyras(vardas, pavarde, metai, lytis, faloDydis);
                    list.add(vyr);
                }
                System.out.println("keleivis ilipo!");

            } else {
                System.out.println("traukinys pilnas, negalima ilaipinti");
            }
        }else if(traukinioBusena==2){
            System.out.println("traukinys vaziuoja, negalima ilaipinti keleiviu ");
        }
    }

}
