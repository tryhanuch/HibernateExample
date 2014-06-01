import beans.User;
import org.hibernate.Session;

/**
 * Created by tish on 01.06.2014.
 */
public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        User user = new User();
        user.setFirstName("Alex");
        user.setLastName("Kein");
        user.setAge(25);
        user.setSalary(2500);
        session.save(user);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();



    }
}
