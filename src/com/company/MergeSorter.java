package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> list;
    private ExecutorService executor;
    MergeSorter(List<Integer> li, ExecutorService exec){
        this.list=li;
        this.executor=exec;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();
        if(list.size()<=1) return list;
        int mid = list.size()/2;
        for(int i=0;i<list.size();i++){
            if(i<mid)
            leftArray.add(this.list.get(i));
            else
            rightArray.add(list.get(i));
        }
        MergeSorter leftSorter = new MergeSorter(leftArray,this.executor);
        MergeSorter rightSorter =new MergeSorter(rightArray,this.executor);

        Future<List<Integer>> leftSorted = this.executor.submit(leftSorter);
        Future<List<Integer>> rightSorted = this.executor.submit(rightSorter);

        List<Integer> left1 = leftSorted.get();
        List<Integer> right1 = rightSorted.get();

        List<Integer> finalSorted = new ArrayList<>();
        int n = left1.size();
        int m = right1.size();
        int i=0,j=0;
        while(i<n && j<m){
            if(left1.get(i)<right1.get(j)){ finalSorted.add(left1.get(i));i++;}
            else {finalSorted.add(right1.get(j)); j++;}
        }
        while(i<n){
            finalSorted.add(left1.get(i));
            i++;
        }
        while(j<m){
            finalSorted.add(right1.get(j));
            j++;
        }
        return finalSorted;
    }
}
