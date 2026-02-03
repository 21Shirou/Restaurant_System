public class Restaurant {
    public static void main(String[] args) {

        Chef chef1 = new Chef("Rinoa", "Japanese");
        Chef chef2 = new Chef("angel", "Indian");

        Kitchen kitchen1 = new Kitchen("Dine on sure", chef1, "sushi", "Main Dish"  );
        Kitchen kitchen2 = new Kitchen("angel eden", chef2, "curry", "Special Dish");

        System.out.println(
                // Identity methods
                chef1.show_identity() + "\n" +
                        chef2.show_identity() + "\n" +
                        kitchen1.show_identity() + "\n" +
                        kitchen2.show_identity() + "\n\n" +

                        // Functional output
                        kitchen1.generate_kitchen_status() + "\n" +
                        kitchen2.generate_kitchen_status()
        );
    }
}
