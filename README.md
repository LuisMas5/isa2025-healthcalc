# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada
## Practice 1:
Tests:
### 1. **Ideal Body Weight Tests**
   - **Test Case 1**: Calculate the ideal body weight for a 180 cm tall man.
     - **Expected Result**: The ideal body weight should be 72.5 kg.
   
   - **Test Case 2**: Calculate the ideal body weight for a 160 cm woman.
     - **Expected Result**: The ideal body weight should be 56.0 kg.

   - **Test Case 3**: Check if an exception is thrown when the height is negative.
     - **Expected Result**: The function should throw an exception (`HealthCalcException`).

   - **Test Case 4**: Check if an exception is thrown when an invalid gender is provided.
     - **Expected Result**: The function should throw an exception (`HealthCalcException`).

### 2. **Basal Metabolic Rate (BMR) Tests**
   - **Test Case 5**: Calculate the BMR for a man who weighs 70 kg, is 175 cm tall, and is 30 years old.
     - **Expected Result**: The BMR should be 1695.67 kcal/day.
   
   - **Test Case 6**: Calculate the BMR for a woman who weighs 60 kg, is 160 cm tall, and is 25 years old.
     - **Expected Result**: The BMR should be 1389.84 kcal/day.

   - **Test Case 7**: Check if an exception is thrown when the age is negative.
     - **Expected Result**: The function should throw an exception (`HealthCalcException`).

   - **Test Case 8**: Check if an exception is thrown when an invalid gender is provided.
     - **Expected Result**: The function should throw an exception (`HealthCalcException`).

# Test Results

This is the screenshot of the test results using Maven:

![Test Results](results.png)

## Practice 2:
### UML diagram:
```mermaid:
flowchart TD
    A["Usuario"] --> B("Calcular Peso Ideal") & C("Calcular Tasa Metabólica Basal - TMB") & D("Manejo de Excepciones")
    B --> E{"Entradas válidas?"}
    E -- Sí --> F["Calcular peso ideal"]
    E -- No --> G["Lanzar excepción: Altura inválida"] & H["Lanzar excepción: Género inválido"]
    C --> I{"Entradas válidas?"}
    I -- Sí --> J["Calcular TMB"]
    I -- No --> K["Lanzar excepción: Peso inválido"] & L["Lanzar excepción: Altura inválida"] & M["Lanzar excepción: Edad inválida"] & N["Lanzar excepción: Género inválido"]
    D --> O["Altura negativa"] & P["Altura excesiva"] & Q["Edad negativa"] & R["Edad excesiva"] & S["Género inválido"]

