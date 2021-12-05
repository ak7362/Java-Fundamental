class Animal {
    String type;
    String name;
    static int age;
    int numberLeges;

    Animal() {
        this("Dog", 14, 4);
    }

    Animal(String name, int age, int numberLeges) {

        this(name, age, 4, "Mamel");
        this.name = name;
        this.numberLeges = numberLeges;
        System.out.print("Animal: " + name);
        System.out.print(" ,NumberOfLeg: " + numberLeges);
        System.out.print(" ,Age: " + age);
    }

    Animal(String name, int age, int numberLeges, String type) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.numberLeges = numberLeges;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getLeg() {
        return numberLeges;
    }

    public int getAge() {
        return age;
    }

    public static void incrementAge(int age1) {
        age = age + age1;
    }

    public String toString() {
        return this.name;
    }

}

class AnimalType {
    public static void main(String args[]) {
        Animal dog = new Animal();
        dog.setType("mamel");
        System.out.println(" Type: " + dog.getType());
        System.out.println();

        Animal cat = new Animal("Cat", 6, 4, "mamel");

        System.out.print("Animal: " + cat.getName());
        System.out.print(" ,age: " + cat.getAge());
        System.out.print(" ,Number of Leg: " + cat.getLeg());
        System.out.println(" ,Type: " + dog.getType());
        System.out.println();

        Animal cow = new Animal("Cow", 12, 4, "mamel");
        cow.incrementAge(10);
        System.out.print("Animal: " + cow.getName());
        System.out.print(" ,age: " + cow.getAge());
        System.out.print(" ,Number of Leg: " + cow.getLeg());
        System.out.println(" ,Type: " + cow.getType());
        System.out.println();

        Animal elephant = new Animal("Elephant", 16, 4, "mamel");
        cow.incrementAge(10);
        System.out.print("Animal: " + elephant.getName());
        System.out.print(" ,age: " + elephant.getAge());
        System.out.print(" ,Number of Leg: " + elephant.getLeg());
        System.out.println(" ,Type: " + elephant.getType());
        System.out.println();

        Animal Human = new Animal("Human", 21, 2, "mamel");
        cow.incrementAge(10);
        System.out.print("Animal: " + Human.getName());
        System.out.print(" ,age: " + Human.getAge());
        System.out.print(" ,Number of Leg: " + Human.getLeg());
        System.out.println(" ,Type: " + Human.getType());

    }
}