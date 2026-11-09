package com.joysistvi.day21;

public class UserAccount {

        // Private fields (Encapsulation)
        private String firstName;
        private String middleName;
        private String lastName;
        private String address;
        private String email;
        private String password;

        // Parameterized Constructor
        public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {

            this.setFirstName(firstName);
            this.setMiddleName(middleName);
            this.setLastName(lastName);
            this.setAddress(address);
            this.setEmail(email);
            this.setPassword(password);
        }


    // First Name
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // Middle Name
        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        // Last Name
        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // Address
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        // Email with Validation
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (email == null || email.trim().isEmpty()) {
                throw new IllegalArgumentException("Email cannot be empty.");
            }

            String emailRegex =
                    "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

            if (!email.matches(emailRegex)) {
                throw new IllegalArgumentException(
                        "Invalid email format. Please try again."
                );
            }

            this.email = email;
        }

        // Password with Validation
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {

            if (password == null || password.trim().isEmpty()) {
                throw new IllegalArgumentException(
                        "Password cannot be empty."
                );
            }

            String passwordRegex =
                    "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

            if (!password.matches(passwordRegex)) {
                throw new IllegalArgumentException(
                        "Invalid password!\n" +
                                "Password must contain:\n" +
                                "- At least 8 characters\n" +
                                "- One uppercase letter\n" +
                                "- One lowercase letter\n" +
                                "- One number\n" +
                                "- One special character"
                );
            }

            this.password = password;
        }

        // toString Method
        @Override
        public String toString() {
            return "Full Name: " + firstName + " "
                    + middleName + " " + lastName
                    + "\nEmail: " + email
                    + "\nAddress: " + address;
        }
    }


