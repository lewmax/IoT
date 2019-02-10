public class Main {

    public static void main(String[] args) {
        Printer HP = new Printer("HP", 10, 3500, "A1234", 3.5);
        Printer ACER = new Printer("Acer", 15, 5000, "B2019", 2.8, "Black and white", 1000);
        Printer PANASONIC = new Printer();
        HP.Show();
        ACER.Show();
        PANASONIC.Show();
        PANASONIC.setName("Panasonic");
        PANASONIC.setNumberOfPagesPerMinute(20);
        PANASONIC.setPrice(6125);
        PANASONIC.setModel("C9876");
        PANASONIC.setWeight(4.1);
        PANASONIC.Show();
    }

    public static class Printer {
        public String Name;
        public int NumberOfPagesPerMinute;
        public double Price;
        private String Model;
        private static double Weight;
        protected String ColorOfPrinting;
        protected int AmountOfPages;

        public Printer() {
            this.Name = null;
            this.NumberOfPagesPerMinute = 0;
            this.Price = 0;
            this.Model = null;
            this.Weight = 0;
        }

        public Printer(String Name, int NumberOfPagesPerMinute, double Price, String Model, double Weight) {
            this.Name = Name;
            this.NumberOfPagesPerMinute = NumberOfPagesPerMinute;
            this.Price = Price;
            this.Model = Model;
            this.Weight = Weight;
        }

        public Printer(String Name, int NumberOfPagesPerMinute, double Price, String Model, double Weight, String ColorOfPrinting, int AmountOfPages) {
            this.Name = Name;
            this.NumberOfPagesPerMinute = NumberOfPagesPerMinute;
            this.Price = Price;
            this.Model = Model;
            this.Weight = Weight;
            this.ColorOfPrinting = ColorOfPrinting;
            this.AmountOfPages = AmountOfPages;
        }

        public void Show() {
            System.out.println("Name is " + Name);
            System.out.println("Number Of Pages Per Minute is " + NumberOfPagesPerMinute);
            System.out.println("Price is " + Price);
            System.out.println("Model is " + Model);
            System.out.println("Weight is " + Weight + "\n");
        }
        public void setName(String newName) {
            this.Name = newName;
        }
        public void setNumberOfPagesPerMinute(int newNumberOfPagesPerMinute) {
            this.NumberOfPagesPerMinute = newNumberOfPagesPerMinute;
        }
        public void setPrice(double newPrice) {
            this.Price = newPrice;
        }
        public void setModel(String newModel) {
            this.Model = newModel;
        }
        public void setWeight(double newWeight) {
            this.Weight = newWeight;
        }
        public String getName() {
            return this.Name;
        }
        public int getNumberOfPagesPerMinute() {
            return this.NumberOfPagesPerMinute;
        }
        public double getPrice() {
            return this.Price;
        }
        public String getModel() {
            return this.Model;
        }
        public double getWeight() {
            return this.Weight;
        }
    }

}
