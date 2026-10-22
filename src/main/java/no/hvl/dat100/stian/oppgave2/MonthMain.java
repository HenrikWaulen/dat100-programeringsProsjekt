package no.hvl.dat100.stian.oppgave2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.printf("a)");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println("\n");

        System.out.printf("b)");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println("\n");

        System.out.printf("c)\n");
        System.out.printf("%.2f Nok %n",
            MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println("\n");

        System.out.printf("d)%n");
        System.out.printf("Hytte (1000 kWh): %b%n",
            MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.printf("Primærbolig (5000 kWh): %b%n",
            MonthlyPower.exceedThreshold(power_usage_month, 5000));
        System.out.println();
  
        System.out.printf("e)\n");
        System.out.printf("%.2f Nok %n",
            MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println("\n");

        System.out.printf("f)\n");
        System.out.printf("%.2f Nok %n",
            MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.println("\n");

        System.out.printf("g)\n");
        System.out.printf("%.2f Nok %n",
            MonthlyPower.computeNorgesPrice(power_usage_month));
        System.out.println("\n");
    }    
}