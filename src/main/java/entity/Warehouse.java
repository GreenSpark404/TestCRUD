package entity;

import java.util.List;

public class Warehouse {
    private int id;
    private int UserID;
    private List<Item> storageItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public List<Item> getStorageItems() {
        return storageItems;
    }

    public void setStorageItems(List<Item> storageItems) {
        this.storageItems = storageItems;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", UserID=" + UserID +
                ", storageItems=" + storageItems +
                '}';
    }
}
