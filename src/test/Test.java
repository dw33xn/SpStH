package test;

import bean.AddresslistEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        Address ail = (AddressImpl)ac.getBean("address");
        AddresslistEntity al = new AddresslistEntity();
        al.setName("kaka");
        al.setPhone("123456123");
        ail.add(al);
    }
}
