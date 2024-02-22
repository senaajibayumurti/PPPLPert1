import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void penjumlahanNilaiPositif() {
        Kalkulator kalkulator = new Kalkulator(2,3);
        int expectedHasil = kalkulator.penjumlahan();
        assertEquals(5,expectedHasil);
    }
    @Test
    void penjumlahanNilaiNegatif() {
        System.out.println("sukses niggatif");
    }
}