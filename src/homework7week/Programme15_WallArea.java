package homework7week;

public class Programme15_WallArea {

        // Instance variables
        public double width;
        public double height;

        // No-arg constructor
        public void Wall() {
            // Default values for width and height
            this.width = 0.0;
            this.height = 0.0;
        }

        // Parameterized constructor with validation
        public void Wall(double width, double height) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        // Getter for width
        public double getWidth() {
            return width;
        }

        // Getter for height
        public double getHeight() {
            return height;
        }

        // Setter for width with validation
        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        // Setter for height with validation
        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        // Method to calculate the area of the wall
        public double getArea() {
            return width * height;
        }
    }


