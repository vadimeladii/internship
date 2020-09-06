package com.mentoring.builder;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
//        User user = new User(1L, "vadim", "vadimeladii@gmail.com");
//        System.out.println(user);

//        User vadim = User.UserBuilder
//                .builder()
//                .id(1L)
//                .name("vadim")
//                .email("vadimeladii@gmail.com")
//                .build();
//
//        System.out.println(vadim);
//
//        UserBuilder userBuilder =
//                UserBuilder.builder()
//                        .id(1L)
//                        .name("vadim")
//                        .email("vadimeladii@gmail.com");
//
//        System.out.println(userBuilder);
//
//
//        String optional =
//                Optional.of(3)
//                    .map(Object::toString)
//                    .orElse(getTest());

        String test = "test";
        test = test != null ? "default" : getTest();
//        System.out.println(optional);
    }

    private static String getTest() {
        System.out.println("method 'getTest");
        return "test";
    }
}
