package org.example.basics.threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {
    public static void main(String[] args) {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
            System.out.println("new thread");
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"sample");

        future2.thenAccept((a)->System.out.println(a));
    }
}
