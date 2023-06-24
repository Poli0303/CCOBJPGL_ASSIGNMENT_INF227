import Locations.Boracay;
import Locations.Cabanatuan;
import Locations.Cavite;
import Locations.Isabela;
import Locations.NuevaEcija;
import Locations.Tagaytay;

public class App {
    public static void main(String[] args) throws Exception {

        Isabela Isabela = new Isabela();
        Cavite Cavite = new Cavite();
        Boracay Boracay = new Boracay();
        Cabanatuan Cabanatuan = new Cabanatuan();
        Tagaytay Tagaytay = new Tagaytay();
        NuevaEcija NuevaEcija = new NuevaEcija();

        Me tourist = new Me();

        Isabela.accept(tourist);
        Cavite.accept(tourist);
        Boracay.accept(tourist);
        Cabanatuan.accept(tourist);
        Tagaytay.accept(tourist);
        NuevaEcija.accept(tourist);

    }
}