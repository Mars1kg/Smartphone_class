public class Main {
    public static void main (String[] args){
        Smartphone smartphone1 = new Smartphone();
        smartphone1.brand = "Samsung";
        smartphone1.model = "S24";
        smartphone1.display = "AMOLED";
        smartphone1.mAh = 3880;
        smartphone1.price = 62400;

        Smartphone smartphone2 = new Smartphone();
        smartphone2.brand = "Iphone";
        smartphone2.model = "15";
        smartphone2.display = "OLED";
        smartphone2.mAh = 3877;
        smartphone2.price = 73990;


        smartphone1.info();
        System.out.println();
        smartphone2.info();

    }
}