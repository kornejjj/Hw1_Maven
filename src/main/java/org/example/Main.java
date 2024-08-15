package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user=new User("Artem", "Korniienko");
        Gson gson=new Gson().newBuilder().setPrettyPrinting().create();
        String json=gson.toJson(user);
        System.out.println(json);
    }
}