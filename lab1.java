package ua.lviv.IoT.lab1_Java;

public class Main {

    public static void main(String[] args) {
        Printer hp = new Printer("HP", 10, 3500, "A1234", 3.5);
        Printer acer = new Printer("Acer", 15, 5000, "B2019", 2.8, "Black and white", 1000);
        Printer panasonic = new Printer();

        System.out.println(hp.toString());
        System.out.println(acer.toString());
        System.out.println(panasonic.toString());

        panasonic.setName("Panasonic");
        panasonic.setNumberOfPagesPerMinute(20);
        panasonic.setPrice(6125);
        panasonic.setModel("C9876");
        panasonic.setWeight(4.1);
        panasonic.setColorOfPrinting("Colored");
        panasonic.setAmountOfPages(2000);

        System.out.println(panasonic.toString());

        System.out.println("Static weight: " + hp.printWeight());
        System.out.println("Static weight: " + acer.printWeight());
        System.out.println("Static weight: " + panasonic.printWeight());

        System.out.println("Static method: " + Printer.printStaticWeight());
    }

    public static class Printer {
        public String name;
        public int numberOfPagesPerMinute;
        public double price;
        private String model;
        private static double weight;
        protected String colorOfPrinting;
        protected int amountOfPages;

        public Printer(String name, int numberOfPagesPerMinute, double price, String model, double weight, String colorOfPrinting, int amountOfPages) {
            this.name = name;
            this.numberOfPagesPerMinute = numberOfPagesPerMinute;
            this.price = price;
            this.model = model;
            this.weight = weight;
            this.colorOfPrinting = colorOfPrinting;
            this.amountOfPages = amountOfPages;
        }

        public Printer(String name, int numberOfPagesPerMinute, double price, String model, double weight) {
            this(name, numberOfPagesPerMinute, price, model, weight, null, 0);
        }

        public Printer() {
            this(null, 0, 0, null, 0, null, 0);
        }

        public String toString() {
            return "Printer: " + "Name: " + name + ", NumberOfPagesPerMinute: " + numberOfPagesPerMinute +
                    ", Price: " + price + ", Model: " + model + ", Weight: " + weight +
                    ", ColorOfPrinting: " + colorOfPrinting + ", AmountOfPages: " + amountOfPages;
        }

        public void resetValues(String name, int numberOfPagesPerMinute, double price, String model, double weight, String colorOfPrinting, int amountOfPages) {
            this.name = name;
            this.numberOfPagesPerMinute = numberOfPagesPerMinute;
            this.price = price;
            this.model = model;
            this.weight = weight;
            this.colorOfPrinting = colorOfPrinting;
            this.amountOfPages = amountOfPages;
        }

        public static double printStaticWeight() {
            return weight;
        }

        public double printWeight() {
            return weight;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public void setNumberOfPagesPerMinute(int newNumberOfPagesPerMinute) {
            this.numberOfPagesPerMinute = newNumberOfPagesPerMinute;
        }

        public void setPrice(double newPrice) {
            this.price = newPrice;
        }

        public void setModel(String newModel) {
            this.model = newModel;
        }

        public void setWeight(double newWeight) {
            this.weight = newWeight;
        }

        public void setColorOfPrinting(String newColorOfPrinting) {
            this.colorOfPrinting = newColorOfPrinting;
        }

        public void setAmountOfPages(int newAmountOfPages) {
            this.amountOfPages = newAmountOfPages;
        }

        public String getName() {
            return this.name;
        }

        public int getNumberOfPagesPerMinute() {
            return this.numberOfPagesPerMinute;
        }

        public double getPrice() {
            return this.price;
        }

        public String getModel() {
            return this.model;
        }

        public double getWeight() {
            return this.weight;
        }

        public String getColorOfPrinting() {
            return this.colorOfPrinting;
        }

        public double getAmountOfPages() {
            return this.amountOfPages;
        }
    }

}
