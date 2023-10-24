package homework7week;

public class Programme14_Person {

        // Instance variables
       public String firstName;
        public String lastName;
        public int age;

        // Getter for firstName
        public String getFirstName() {
            return firstName;
        }

        // Getter for lastName
        public String getLastName() {
            return lastName;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for firstName
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // Setter for lastName
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // Setter for age
        public void setAge(int age) {
            if (age >= 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }

        // Method to check if the person is a teen
        public boolean isTeen() {
            return age > 12 && age < 20;
        }

        // Method to get the full name of the person
        public String getFullName() {
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";
            } else if (firstName.isEmpty()) {
                return lastName;
            } else if (lastName.isEmpty()) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }


