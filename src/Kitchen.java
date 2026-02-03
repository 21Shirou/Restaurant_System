public class Kitchen {
        public String kitchen_name;
        public Dish kitchen_dish;  // Composition: Dish created inside
        public Chef kitchen_chef;  // Aggregation: passed in, exists independently

        public Kitchen(String kitchen_name, Chef kitchen_chef, String dish_name, String category) {
            this.kitchen_name = kitchen_name;
            this.kitchen_chef = kitchen_chef;

            // Dish is created here (composition), assigned to the Chef who prepares it
            this.kitchen_dish = new Dish(dish_name, category, kitchen_chef);
        }

        public String generateKitchenStatus() {
            return "Kitchen Name: " + kitchen_name +
                    "\nDish Info: " + kitchen_dish.getDishInfo() +
                    "\nChef Info: " + kitchen_chef.get_chef_info();
        }

        public String showIdentity() {
            return "I am the Kitchen class. I compose the Dish (cannot exist without me) and aggregate the Chef (exists independently).";
        }
    }

