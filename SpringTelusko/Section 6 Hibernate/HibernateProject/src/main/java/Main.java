import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(Student.class);
//        cfg.configure();

        SessionFactory sessionFactory =
                new Configuration()
                        .addAnnotatedClass(Student.class)
                        .configure().buildSessionFactory();                    //cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

//        Student student = new Student(12, 62, "Temo Qurkhuli");
//        Student student=session.find(Student.class,1);

//        Transaction transaction = session.beginTransaction();

//        session.persist(student);
//        transaction.commit();
        session.close();
//        System.out.println(student);
    }
}