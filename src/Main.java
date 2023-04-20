public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightM = 1.87;
        double a = weightKg;
        double b = heightM;
        int imt = service.calculate(a, b);
        System.out.println(imt);

        System.out.println();
        System.out.println("вес: 65 кг, рост: 1,70");
        System.out.println(service.calculate(65, 1.70));

        System.out.println();
        System.out.println("вес: 44 кг, рост: 158");
        System.out.println(service.calculate(44, 1.58));

    }
}