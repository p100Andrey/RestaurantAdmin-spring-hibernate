package myspring.dao;

import myspring.model.Blydo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlydoDaoImpl implements BlydoDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addBlydo(Blydo blydo) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(blydo);
    }

    @Override
    public void updateBlydo(Blydo blydo) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(blydo);
    }

    @Override
    public void removeBlydo(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Blydo blydo = (Blydo) session.load(Blydo.class, new Integer(id));

        if (blydo != null) {
            session.delete(blydo);
        }
    }

    @Override
    public Blydo getBlydoById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Blydo blydo = (Blydo) session.load(Blydo.class, new Integer(id));

        return blydo;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Blydo> listBlyd() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Blydo> blydoList = session.createQuery("from Blydo").list();

        return blydoList;
    }
}
