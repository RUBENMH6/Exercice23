import java.util.Scanner;

public class Exercice23 {

    public static void main(String[] args) {
        int i = 0;
        float grade = 0, sum = 0, medium;
        boolean wasTen = false;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        while (grade != -1) {
            System.out.println("Enter a grade: ");
            grade = inputValue.nextFloat();

            if (grade != -1) {
                i++;
                sum = sum + grade;
                if (grade == 10) {
                    wasTen = true;
                }
            }
        }
        medium = sum / i;
        System.out.println("Medium grade:" + medium);
        System.out.println("Any ten? " + wasTen);
    }
}
