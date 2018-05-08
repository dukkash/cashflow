package com.dukkash.cashflow.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class CashFlowApp {

    public static void main(String[] args) {
        System.out.println("Starting CashFlow App!");
        SpringApplication.run(CashFlowApp.class, args);
        System.out.println("Started CashFlow App!");
    }
}
