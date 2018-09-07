package service;

import bean.AddresslistEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AddressImpl implements Address {
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(AddresslistEntity al)
    {
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(al);
        tx.commit();
    }

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
}
