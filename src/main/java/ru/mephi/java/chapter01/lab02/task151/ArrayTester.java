package ru.mephi.java.ch02.task15;
import java.util.Random;
import java.util.ArrayList;
public class ArrayTester {
    private static MyArrayList<Integer> items1 = new MyArrayList<>();
    private static IdealArrayList<Integer> items2 = new IdealArrayList<>();

    public static void main(String[] args){
        for (int i=0; i<1000; i++){
            Random generator = new Random();
            if ( generator.nextInt()%3 == 1 ){
                if (items1.size()>0 && items2.size()>0){
                    //System.out.println("1: "+
                            items1.removeQueue();
                    //);
                    //System.out.println("2: "+
                            items2.remove(0);
                    //);
                }
            }
            else{
                int input=generator.nextInt();
                items1.addQueue(input);
                items2.add(input);
            }
        }
    }


}
