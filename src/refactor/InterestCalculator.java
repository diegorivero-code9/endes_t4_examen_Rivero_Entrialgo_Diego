package refactor;

/*
 * Refactoriza el siguiente código de forma para evitar utilizar un número mágico
 * y repetir el número cada vez que se utiliza.
 */
public class InterestCalculator {
    static final int diasano=365;
    double calculateInterest(double principal, double rate, int time) {
        // Cálculo del interés compuesto para 365 días al año
        return principal * Math.pow(1 + (rate / diasano), time * diasano);
    }
}



