import java.io.IOException;

public class Kelione extends Traukinys {



    Kelione()throws IOException {

        while (true) {
            menuInfo();
            while (!sc.hasNextInt()) {
                sc.next();
            }
            int pas = sc.nextInt();

            switch (pas) {
                case 1:
                    ilaipintiKeleivi();
                    break;
                case 2:
                    islaipintiKeleivi();
                    break;
                case 3:
                    sustoti();
                    break;
                case 4:
                    vaziuoti();
                    break;
                case 5:
                    gautiKeleiviuSarasa();
                    break;
                case 6:
                    irasytiKeleiviuSarasaFailas("");
                    gautiKeleiviuSarasaFailui();
                    irasytiKeleiviuSarasaFailas(sarasas);
                    break;
                default:
                    System.out.println("Nera tokio pasirinkimo");
                    break;
            }

        }

    }

    public void menuInfo() {
        System.out.println("[1]-Ilaipinti keleivi-[1]" +
                "\n[2]-Islaipinti keleivi-[2]" +
                "\n[3]-Sustoti-[3]" +
                "\n[4]-Vazuoti-[4]" +
                "\n[5]-Gauti vykstanciu keleiviu sarasa-[5]" +
                "\n[6]-Irasyti Sarasa i faila-[6]");
    }
}
