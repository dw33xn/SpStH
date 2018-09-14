package action;

import service.AddressImpl;
import bean.AddresslistEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kinthon on 17-3-31.
 */
public class AddressAction extends ActionSupport {

    private String name;
    private String phone;
    @Autowired
    private AddressImpl address;


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {

        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String add()
    {
        AddresslistEntity al = new AddresslistEntity();
        al.setName(getName());
        al.setPhone(getPhone());
        address.add(al);
        return SUCCESS;
    }

    public void setAddress(AddressImpl address) {
        this.address = address;
    }
}
