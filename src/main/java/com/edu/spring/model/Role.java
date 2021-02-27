package com.edu.spring.model;

import java.util.HashSet;
import java.util.Set;

public class Role {

    private Integer id;
    private String name;
    private Set<Permission> permissionSet=new HashSet<>();
    private Set<User> users=new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Set<Permission> permissionSet) {
        this.permissionSet = permissionSet;
    }
}
