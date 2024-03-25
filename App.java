// import java.util.function.Function;

public class App {

    // definir função
    public static double f(double x) {
        return 1/(1+x); // ex: x^2
    }

    public static double trapezoidalRule(double inf, double sup, int n) {
        double h = (sup - inf) / n;
        double integral = 0.5 * (f(inf) + f(sup)); // primeiro e último termo

        for (int i = 1; i < n; i++) {
            integral += f(inf + i * h); // somando os termos do meio
        }

        integral *= h;
        return integral;
    }

    public static void main(String[] args) {
        // definir os limites de integração
        double sup = 0.6; // limite superior
        double inf = 0; // limite inferior
        
        // calcular integral usando 4 divisões
        int n4 = 4; // número de divisões
        double integral4 = trapezoidalRule(inf, sup, n4);
        System.out.println("Valor aproximado da integral com 4 divisões: " + integral4);

        // calcular integral usando 5 divisões
        int n5 = 5; // número de divisões
        double integral5 = trapezoidalRule(inf, sup, n5);
        System.out.println("Valor aproximado da integral com 5 divisões: " + integral5);

        // calcular integral usando 6 divisões
        int n6 = 6; // número de divisões
        double integral6 = trapezoidalRule(inf, sup, n6);
        System.out.println("Valor aproximado da integral com 6 divisões: " + integral6);
    }
}
