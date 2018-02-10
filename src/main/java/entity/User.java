package entity;

import java.sql.Date;
import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private List<Item> backpack;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(List<Item> backpack) {
        this.backpack = backpack;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", backpack=" + backpack +
                '}';
    }
}
