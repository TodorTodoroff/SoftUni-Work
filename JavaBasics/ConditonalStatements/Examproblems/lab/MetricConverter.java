package conditionalstatementstraining.Examproblems.lab;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        String metric1 = scanner.nextLine();
        String metric2 = scanner.nextLine();

        double mm = 1000;
        double cm = 100;


        if (metric1.equals("mm")){
            value = value / mm;

        }else if (metric1.equals("cm")){
            value = value / cm;

        }
        if (metric2.equals("mm")){
            value = value * mm;

        }else if (metric2.equals("cm")){
            value = value * cm;

        }
        System.out.printf("%.3f",value);

    }

}