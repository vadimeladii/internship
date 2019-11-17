package com.mentoring.singleton;

public class UserSingleton {

    private static UserSingleton singleInstance = null;

    private Long id;
    private String name;
    private String email;

    private UserSingleton() { }

    public static UserSingleton create() {
        if (singleInstance == null) {
            singleInstance = new UserSingleton();
        }
        return singleInstance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserSingleton{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
