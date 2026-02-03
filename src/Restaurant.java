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
                        kitchen1.showIdentity() + "\n" +
                        kitchen2.showIdentity() + "\n\n" +

                        // Functional output
                        kitchen1.generateKitchenStatus() + "\n" +
                        kitchen2.generateKitchenStatus()
        );
    }
}
