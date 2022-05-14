public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actuall = service.calculate(1000_60, true);
        long expected = 30;
        System.out.println("ОР : 30 ФР:" + actuall);

        long actual = service.calculate(1_000_000_60, true);
        long expected2 = 500;
        System.out.println("ОР : 500 ФР :" + actual);
    }
}
