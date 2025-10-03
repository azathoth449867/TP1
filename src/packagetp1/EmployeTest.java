package packagetp1;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    Employe emp;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        emp = new Employe("Sheldon Cooper","323",12.60, 32, 4 );
    }

    @org.junit.jupiter.api.Test
    void salaireBrut() {
        assertEquals(403.20, emp.salaireBrut());
    }

    @org.junit.jupiter.api.Test
    void salaireNetAvantImpot() {
        assertEquals(332.96, emp.salaireNetAvantImpot(), 0.009);
    }

    @org.junit.jupiter.api.Test
    void impotFederal() {
        assertEquals(63.26, emp.impotFederal(), 0.009);
    }

    @org.junit.jupiter.api.Test
    void impotProvincial() {
        assertEquals(66.59,emp.impotProvincial(), 0.009);
    }

    @org.junit.jupiter.api.Test
    void salaireNetApresImpot() {
        assertEquals(203.10,emp.salaireNetApresImpot(), 0.009);
    }

    @org.junit.jupiter.api.Test
    void joursVacances() {
        assertEquals(19, emp.joursVacances());
    }

    @org.junit.jupiter.api.Test
    void heuresSup() {
        emp.heuresSup(-60);
        assertEquals(32,emp.getNbreHeuresSemaine() );
    }
}