public class Main {
    public static void main(String[] args) {

        //TASK 1
        double annualDeposit = 0;
        int months = 0;
        while(annualDeposit < 2459000){
            months++;
            annualDeposit += 15000;
            System.out.printf("Месяц %d сумма накоплений равна %.2f рублей. \n", months, annualDeposit);
        }

        //TASK 2
        int i=0;
        while(i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(;i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //TASK 3
        int j = 1;
        double population = 12000000;
        while (j < 10) {
            j++;
            population += (population * 0.017 - population * 0.008);
            System.out.printf("Год %d, численность населения составляет %.0f человек.\n", j, population);
        }

        //TASK 4 and 5
        int monthsNew = 0;
        double deposit = 15000;

        while (deposit < 12000000) {
            monthsNew++;
            deposit += deposit * 0.07;
            if (monthsNew % 6 == 0) { // Если убрать данный if, то будет ответ к 4-му заданию.
                System.out.printf("Месяц %d, сумма накоплений составляет %.2f рублей.\n", monthsNew, deposit);
            }
        }

        System.out.printf("Чтобы накопить 12,000,000 рублей, потребуется %d месяцев.\n", monthsNew);

        //TASK 6
        double savings = 15000;
        for(int year = 1; year <= 9; year++) {
            for (int month = 1; month <= 12; month++) {
                savings *= (1 + (0.07/12));
                if (month % 6 == 0) {
                    int totalMonths = (year - 1) * 12 + month;
                    System.out.printf("Месяц %d, сумма накоплений составляет %.2f рублей.\n", totalMonths, savings);
                }
            }
        }

        //TASK 7
        int firstFriday = 2;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", day);
        }

        //TASK 8
        int currentYear = 2017;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for(int year = startYear; year <= endYear; year += 79){ //Год 2017, чтобы соответсвовать выводу в условии.
            if (year > startYear) {
                System.out.println(year);
            }
        }

    }
}
