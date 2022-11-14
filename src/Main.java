public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.setMerk("Lenovo Thinkpad x260");
        myLaptop.setColor("Dark Grey");
        myLaptop.setRelease(2018);
        myLaptop.setWeight(1.8f);
        myLaptop.setCPUCore(4);
        myLaptop.setUseNvidia(false);

        System.out.println("===================================================");
        System.out.println("|               Laptop Description                |");
        System.out.println("===================================================");
        System.out.println("Merk : " + myLaptop.getMerk());
        System.out.println("Release Year : " + myLaptop.getRelease());
        System.out.println("Color : " + myLaptop.getColor());
        System.out.println("Weight : " + myLaptop.getWeight() + " Kg");
        System.out.println("Number of CPU Core : " + myLaptop.getCPUCore());
        System.out.println("Using Nvidia : " + (myLaptop.getUseNvidia() ? "Yes" : "No"));
        System.out.println("===================================================");
    }
}