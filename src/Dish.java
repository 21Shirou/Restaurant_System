public class Dish {
    public String dish_name;
    public String category;
    public Chef prepared_by;

    public Dish(String dishName, String category, Chef preparedBy) {
        this.dish_name = dishName;
        this.category = category;
        this.prepared_by = preparedBy;
        }
    public String getDishInfo() {
        return "Dish: " + dish_name + " | Category: " + category +
                " | Prepared by: " + prepared_by.chef_name;
        }

    public String show_identity() {
        return "I am the Dish class. I am part of the Kitchen (composition) and prepared by a Chef.";
        }
    }

