package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    @Override
    public float idealBodyWeight(int height, char gender) throws HealthCalcException {
        if (height <= 0) {
            throw new HealthCalcException("La altura debe ser un valor positivo.");
        }
        if (gender != 'm' && gender != 'w') {
            throw new HealthCalcException("El género debe ser 'm' (hombre) o 'w' (mujer).");
        }

        if (gender == 'm') {
            return height - 100 - ((height - 150) / 4.0f);
        } else {
            return height - 100 - ((height - 150) / 2.5f);
        }
    }

    @Override
    public float basalMetabolicRate(float weight, int height, int age, char gender) throws HealthCalcException {
        if (weight <= 0 || height <= 0 || age <= 0) {
            throw new HealthCalcException("El peso, la altura y la edad deben ser valores positivos.");
        }
        if (gender != 'm' && gender != 'w') {
            throw new HealthCalcException("El género debe ser 'm' (hombre) o 'w' (mujer).");
        }

        float tmb;
        if (gender == 'm') {
            tmb = 88.362f + (13.397f * weight) + (4.799f * height) - (5.677f * age);
        } else {
            tmb = 447.593f + (9.247f * weight) + (3.098f * height) - (4.330f * age);
        }
        return tmb;
    }
}
