import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

UserManager userManager=new UserManager();
userManager.kursEkle("java");
        userManager.kursSil("c");

InstructorManager instructorManager=new InstructorManager();
instructorManager.kursEkle("java");
        instructorManager.kursSil("java");
instructorManager.kursDuzenle("c");
    }
}
