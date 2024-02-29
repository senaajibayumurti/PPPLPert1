import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {
    int nilai01=2, nilai02=3;

    @Test
    void penjumlahanNilaiPositif() {
        Kalkulator kalkulator = new Kalkulator(nilai01,nilai02);
        int hasil = kalkulator.penjumlahan();
        assertEquals(5,hasil);
    }
    @Test
    void penjumlahanNilaiNegatif() {
        Kalkulator kalkulator = new Kalkulator(nilai01,nilai02);
        int hasil = kalkulator.penjumlahan();
        assertEquals(5,hasil);
    }
}