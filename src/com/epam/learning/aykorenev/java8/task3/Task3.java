package epam.learning.aykorenev.java8.task3;

/**
 * Created by k1per on 07.06.17.
 */
public class Task3 {
    public static void main(String[] args) {
        PersonData personData = new PersonData("Rec", "Crocodile", 3, 1_000_000, "Texas");

        double cleanIncome = calculateCleanIncome(personData, (income, subsidy, numberOfChildren) -> {
            double totalTaxes;
            if (income > 100000) {
                totalTaxes = income * 0.3;
            } else {
                totalTaxes = income * 0.2;

            }
            if (numberOfChildren > 2) {
                totalTaxes -= totalTaxes * 0.1;
            }
            totalTaxes += totalTaxes * subsidy;
            return income - totalTaxes;
        });

        System.out.println(cleanIncome);
    }

    private static double calculateCleanIncome(PersonData personData, Calculatetable calculateble) {
        String state = personData.getState();
        double subsidy = 0;
        if (state.equals("NewYork")) {
            subsidy = 0.3;
        }
        return calculateble.calculateTaxes(personData.getSalary(), subsidy, personData.getNumberOfChildren());
    }
}
