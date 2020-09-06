package com.mentoring.singleton;

public class Main {

    public static void main(String[] args) {
        UserSingleton userSingleton = UserSingleton.create();

        userSingleton.setId(1L);
        userSingleton.setName("vadim");
        userSingleton.setEmail("vadimeladii@gmail.com");

        System.out.println(userSingleton);


        UserSingleton userSingleton1 = UserSingleton.create();
        System.out.println(userSingleton1);
        userSingleton1.setName("admin");

        UserSingleton userSingleton2 = UserSingleton.create();
        System.out.println(userSingleton2);

    }
}
