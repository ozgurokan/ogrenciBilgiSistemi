public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String branch, String phoneNumber) {
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }

    void print() {
        System.out.println("Adı\t\t: " + this.name);
        System.out.println("Branş\t: " + this.branch);
        System.out.println("Telefon\t: " + this.phoneNumber);
    }
}
