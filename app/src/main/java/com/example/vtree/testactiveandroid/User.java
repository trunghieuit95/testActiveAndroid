package com.example.vtree.testactiveandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by hieunt on 16-Sep-16.
 */
@Table(name = "tbUser")
public class User extends Model {
    @Column(name="UID")private String ID;
    @Column(name="Name")private String Name;
    public String getID() {
        return ID;
    }

    public User setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getName() {
        return Name;
    }

    public User setName(String name) {
        this.Name = name;
        return this;
    }
}
