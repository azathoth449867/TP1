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
        assertEquals(332.96128, emp.salaireNetAvantImpot());
    }

    @org.junit.jupiter.api.Test
    void impotFederal() {
        assertEquals(63.2626432, emp.impotFederal());
    }

    @org.junit.jupiter.api.Test
    void impotProvincial() {
    }

    @org.junit.jupiter.api.Test
    void salaireNetApresImpot() {
    }

    @org.junit.jupiter.api.Test
    void joursVacances() {
    }

    @org.junit.jupiter.api.Test
    void heuresSup() {
    }
}