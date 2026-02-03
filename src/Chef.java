public class Chef {
        public String chefName;
        public String specialization;

        public Chef(String chefName, String specialization) {
            this.chefName = chefName;
            this.specialization = specialization;
        }

        public String get_chef_info() {
            return chefName + " specializes in " + specialization + " cuisine.";
        }

        public String showIdentity() {
            return "I am the Chef class. I exist independently and can work in any Kitchen (aggregation).";
        }
    }

