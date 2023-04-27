public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;

        int imt = service.calculate(weight, height);
        System.out.println(imt);

        System.out.println();
        System.out.println("вес: 65 кг, рост: 1,70");
        System.out.println(service.calculate(65, 1.70));

        System.out.println();
        System.out.println("вес: 44 кг, рост: 158");
        System.out.println(service.calculate(44, 1.58));

    }
}