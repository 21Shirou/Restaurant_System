public class Restaurant {
    public static void main(String[] args) {

        Chef chef1 = new Chef();
        Chef chef2 = new Chef();

        Kitchen kitchen1 = new Kitchen();
        Kitchen kitchen2 = new Kitchen();

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
