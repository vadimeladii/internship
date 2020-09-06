package com.mentoring.builder;

public class UserBuilder {

    private Long id;
    private String name;
    private String email;

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "UserBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
