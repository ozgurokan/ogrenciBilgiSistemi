public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Düldül Hoca", "FZK", "655");
        Teacher t3 = new Teacher("Geveze Hoca", "MAT", "225");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course matematik = new Course("Matematik", "202", "MAT");
        matematik.addTeacher(t3);



        Student s1 = new Student("Özgür Okan","19022607", "2", tarih,fizik,matematik);
        s1.addBulkExamNote(100,200,50);
        s1.isPass();
        s1.printNote();

    }
}