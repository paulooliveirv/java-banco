package persistent.bank;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepository {

    public User save(User operation) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(operation);
            session.getTransaction().commit();
            

            return operation;


        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
            
        }
        return null;
    }

}
