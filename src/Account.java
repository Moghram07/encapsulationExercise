public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor with balance initialized to 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0; // Default balance is 0
    }

    // Constructor with specified initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Setter for ID with validation using try-catch
    public void setID(String id) {
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

    // Setter for balance
    public void setBalance(int balance) {
        try {
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative");
            }
            this.balance = balance;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting Balance: " + e.getMessage());
            // Optionally handle or rethrow the exception as needed
        }
    }

    // Getter methods
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Method to deposit money into the account (credit) with try-catch
    public int credit(int amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }
            balance += amount;
        } catch (IllegalArgumentException e) {
            System.err.println("Error crediting amount: " + e.getMessage());
        }
        return balance;
    }

    // Method to withdraw money from the account (debit) with try-catch
    public int debit(int amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }
            if (balance < amount) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance -= amount;
        } catch (IllegalArgumentException e) {
            System.err.println("Error debiting amount: " + e.getMessage());
        }
        return balance;
    }

    // Method to transfer money from this account to another account with try-catch
    public int transferTo(Account destination, int amount) {
        try {
            if (destination == null) {
                throw new IllegalArgumentException("Destination account cannot be null");
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }
            if (balance < amount) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance -= amount;
            destination.credit(amount);
        } catch (IllegalArgumentException e) {
            System.err.println("Error transferring amount: " + e.getMessage());
        }
        return balance;
    }

    // toString method to represent the Account object as a String
    @Override
    public String toString() {
        return "Account{" + "id= " + id + ", name= " + name +
                ", balance= " + balance + '}';
    }
}
