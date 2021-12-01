package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Doctor surgeon:");
            surgeon mysurgeon = new surgeon();
            mysurgeon.operation();
            mysurgeon.instruments();
        System.out.println("Doctor neurosurgeon:");
            neurosurgeon myneurosurgeon = new neurosurgeon();
            myneurosurgeon.operation();
            myneurosurgeon.instruments();
        }
    }