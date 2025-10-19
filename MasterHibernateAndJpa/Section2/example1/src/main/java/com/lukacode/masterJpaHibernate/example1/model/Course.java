package com.lukacode.masterJpaHibernate.example1.model;

public record Course(
        String id,
        String name,
        String author
) {
//    public static Course courseBuilder(String id, String name, String author){
//        return new Course(id, name, author);
//    }
}
