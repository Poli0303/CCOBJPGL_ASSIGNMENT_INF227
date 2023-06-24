import Locations.Boracay;
import Locations.Cabanatuan;
import Locations.Cavite;
import Locations.Isabela;
import Locations.NuevaEcija;
import Locations.Tagaytay;

interface Tourist {

    int budget = 0;

    void visit();

    void visit(Isabela Isabela);

    void visit(Cavite Cavite);

    void visit(Boracay boracay);

    void visit(Cabanatuan Cabanatuan);

    void visit(Tagaytay nationaluniversity);

    void visit(NuevaEcija NuevaEcija);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}