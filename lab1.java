public class Main {

    public static void main(String[] args) {
        Printer HP = new Printer("HP", 10, 3500, "A1234", 3.5);
        Printer ACER = new Printer("Acer", 15, 5000, "B2019", 2.8, "Black and white", 1000);
        Printer PANASONIC = new Printer();

        System.out.println(HP.toString());
        System.out.println(ACER.toString());
        System.out.println(PANASONIC.toString());

        PANASONIC.setName("Panasonic");
        PANASONIC.setNumberOfPagesPerMinute(20);
        PANASONIC.setPrice(6125);
        PANASONIC.setModel("C9876");
        PANASONIC.setWeight(4.1);
        PANASONIC.setColorOfPrinting("Colored");
        PANASONIC.setAmountOfPages(2000);

        System.out.println(PANASONIC.toString());

        System.out.println("Static weight: " + HP.printWeight());
        System.out.println("Static weight: " + ACER.printWeight());
        System.out.println("Static weight: " + PANASONIC.printWeight());

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
            this(name, numberOfPagesPerMinute, price, model, weight);
            this.colorOfPrinting = colorOfPrinting;
            this.amountOfPages = amountOfPages;
        }

        public Printer(String name, int numberOfPagesPerMinute, double price, String model, double weight) {
            this.name = name;
            this.numberOfPagesPerMinute = numberOfPagesPerMinute;
            this.price = price;
            this.model = model;
            this.weight = weight;
        }

        public Printer() {
            this(null, 0, 0, null, 0, null, 0);
        }

        public static double printStaticWeight(){
            return weight;
        }

        public double printWeight() {
            return weight;
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
