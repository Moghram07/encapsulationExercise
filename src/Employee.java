public class Employee {

        private String id;
        private String name;
        private int salary;

        // Constructor to initialize id, name, and salary
        public Employee(String id, String name, int salary) {
            try {
                setId(id);  // Using setId() with validation
                setName(name);
                setSalary(salary);
            } catch (IllegalArgumentException e) {
                System.err.println("Error creating Employee: " + e.getMessage());
                // Optionally handle or rethrow the exception as needed
            }
        }

        // Setter for id with validation using try-catch
        public void setId(String id) {
            try {
                if (id == null || id.isEmpty()) {
                    throw new IllegalArgumentException("ID cannot be null or empty");
                }
                this.id = id;
            } catch (IllegalArgumentException e) {
                System.err.println("Error setting ID: " + e.getMessage());
                // Optionally handle or rethrow the exception as needed
            }
        }

        // Setter for name with validation using try-catch
        public void setName(String name) {
            try {
                if (name == null || name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be null or empty");
                }
                this.name = name;
            } catch (IllegalArgumentException e) {
                System.err.println("Error setting Name: " + e.getMessage());
                // Optionally handle or rethrow the exception as needed
            }
        }

        // Setter for salary with validation using try-catch
        public void setSalary(int salary) {
            try {
                if (salary <= 0) {
                    throw new IllegalArgumentException("Salary must be greater than zero");
                }
                this.salary = salary;
            } catch (IllegalArgumentException e) {
                System.err.println("Error setting Salary: " + e.getMessage());
                // Optionally handle or rethrow the exception as needed
            }
        }

        // Getter methods
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        // Method to calculate annual salary
        public int getAnnualSalary() {
            return salary * 12; // Assuming salary is monthly salary
        }

        // Method to raise salary by a given percent with validation using try-catch
        public void raiseSalary(int percent) {
            try {
                if (percent <= 0) {
                    throw new IllegalArgumentException("Percent must be greater than zero");
                }
                double raiseFactor = (100 + percent) / 100.0;
                salary = (int) Math.round(salary * raiseFactor);
            } catch (IllegalArgumentException e) {
                System.err.println("Error raising salary: " + e.getMessage());
            }
        }

        // toString method to represent the Employee object as a String
        @Override
        public String toString() {
            return "Employee{" + "id= " + id +
                    ", name= " + name +
                    ", salary= " + salary + '}';
        }
    }
