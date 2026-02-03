public class Chef {
        public String chef_name;
        public String specialization;

        public Chef(String chef_name, String specialization) {
            this.chef_name = chef_name;
            this.specialization = specialization;
        }

        public String get_chef_info() {
            return chef_name + " specializes in " + specialization + " cuisine.";
        }

        public String show_identity() {
            return "I am the Chef class. I exist independently and can work in any Kitchen (aggregation).";
        }
    }

