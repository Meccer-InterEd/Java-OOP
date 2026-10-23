public record Records(String name, int age) {

    // special type of class to be a plain data container
    // it reduces repetitive boilerplate code like getters
    // n setters,toString that u mainly write

    // it a simple class to hold data, and cant  change later

    //Records are final, after setting a value, no changing it later

    // u can only set values while creating an object only


    // to validate Records we use compact constructor


    public Records {

        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if ( age <= 0)
        {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (age < 18)
        {
            throw new IllegalArgumentException("Age cannot be less than 18");
        }


    }


}


