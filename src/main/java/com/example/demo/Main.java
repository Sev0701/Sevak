package com.example.demo;

import com.example.demo.repository.OrderRepository;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        OrderRepository orderRepository=new OrderRepository();
        Gson g = new Gson();
        System.out.println(g.toJson(orderRepository.readAll()));
    }
}