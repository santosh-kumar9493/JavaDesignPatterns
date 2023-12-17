package com.company;

import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
	// write your code here
        List<Integer> arr = List.of(3,1,7,5,4,3);
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<List<Integer>> arrli = executor.submit(new MergeSorter(arr,executor));
        System.out.print(arrli.get());
    }
}
