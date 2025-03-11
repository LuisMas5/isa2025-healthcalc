package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
    private final HealthCalc healthCalc = new HealthCalcImpl();

    @Test
    @DisplayName("Peso ideal para hombre de 180 cm")
    public void testIdealBodyWeightForMan() {
        assertEquals(72.5f, healthCalc.idealBodyWeight(180, 'm'), 0.1);
    }

    @Test
    @DisplayName("Peso ideal para mujer de 160 cm")
    public void testIdealBodyWeightForWoman() {
        assertEquals(56.0f, healthCalc.idealBodyWeight(160, 'w'), 0.1);
    }

    @Test
    @DisplayName("Altura negativa genera excepción")
    public void testIdealBodyWeightNegativeHeight() {
        assertThrows(HealthCalcException.class, () -> healthCalc.idealBodyWeight(-150, 'm'));
    }

    @Test
    @DisplayName("Género inválido genera excepción")
    public void testIdealBodyWeightInvalidGender() {
        assertThrows(HealthCalcException.class, () -> healthCalc.idealBodyWeight(170, 'x'));
    }

    @Test
    @DisplayName("TMB para hombre: peso 70kg, altura 175cm, edad 30 años")
    public void testBasalMetabolicRateForMan() {
        assertEquals(1695.67f, healthCalc.basalMetabolicRate(70, 175, 30, 'm'), 0.1);
    }

    @Test
    @DisplayName("TMB para mujer: peso 60kg, altura 160cm, edad 25 años")
    public void testBasalMetabolicRateForWoman() {
        assertEquals(1389.84f, healthCalc.basalMetabolicRate(60, 160, 25, 'w'), 0.1);
    }

    @Test
    @DisplayName("Edad negativa genera excepción")
    public void testBasalMetabolicRateNegativeAge() {
        assertThrows(HealthCalcException.class, () -> healthCalc.basalMetabolicRate(70, 175, -30, 'm'));
    }

    @Test
    @DisplayName("Género inválido en TMB genera excepción")
    public void testBasalMetabolicRateInvalidGender() {
        assertThrows(HealthCalcException.class, () -> healthCalc.basalMetabolicRate(70, 175, 30, 'x'));
    }
}
