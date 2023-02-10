public class Main {
    public static void main(String[] args) {

        Course history = new Course("Tarih","1","TRH");
        Course physics = new Course("Fizik", "2","FZK");
        Course mathematics = new Course("Matematik","3","MAT");

        Teacher teacher1 = new Teacher("Ahmet Hoca","123","TRH");
        Teacher teacher2 = new Teacher("Mehmet Hoca", "456", "FZK");
        Teacher teacher3 = new Teacher("Ali Hoca","789","MAT");

        history.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        mathematics.addTeacher(teacher3);

        System.out.println();

        history.printTeacher();
        physics.printTeacher();
        mathematics.printTeacher();

        Student student1 = new Student("Veli","11",4,history,physics,mathematics);
        student1.addBulkExamNote(80,70,90,80,70,55);
        student1.isPass();

        Student student2 = new Student("Ayşe","12",3,history,physics,mathematics);
        student2.addBulkExamNote(75,82,40,20,95,58);
        student2.isPass();

        Student student3 = new Student("Ece","13",2,history,physics,mathematics);
        student3.addBulkExamNote(15,60,85,20,72,90);
        student3.isPass();

    }
}