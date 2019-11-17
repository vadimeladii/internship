package com.mentoring.builder;

public class Main {

    public static void main(String[] args) {
//        User user = new User(1L, "vadim", "vadimeladii@gmail.com");
//        System.out.println(user);

        User vadim = User.UserBuilder
                .builder()
                .id(1L)
                .name("vadim")
                .email("vadimeladii@gmail.com")
                .build();

        System.out.println(vadim);

        UserBuilder userBuilder =
                UserBuilder.builder()
                        .id(1L)
                        .name("vadim")
                        .email("vadimeladii@gmail.com");

        System.out.println(userBuilder);
    }
}
