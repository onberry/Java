package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Ola on 2016-12-11.
 */
public class test {




    class Bird{
        public void fly(){
            System.out.println("bird");
        }
    }

    class Hawk extends Bird{

    }


    void flyAll(Collection<? extends Bird> cb) {
        for (Bird bird : cb) {
            bird.fly();
        }
    }
    static void display(int num, String... values){
        System.out.println("number is "+num);
        for(String s:values){
            System.out.println(s);
        }
    }

    void method(int... varargs){
        int n[] = varargs;
    }


    public static void main(String[] args){





        for(int i = 1; i < 50; i++){
            List<Integer> li = new ArrayList<>();
            li.add(new Integer(i));
        }

       /// Collections.


        Integer [] ia = new Integer []{1,2,3};
        int[] pia = new int[ia.length];
        for (int i=0; i<ia.length; i++){
            pia[i] = ia[i];
        }
       /* int[] pia = new int[]{1,2,3};
        Integer [] ia = new Integer [pia.length];


        for (int i=0; i<pia.length; i++){
            ia[i] = (Integer)pia[i];
        }*/
        List<Integer> list1 = new ArrayList<>();
        Integer a[] = new Integer[]{1,2,3};

        list1 = Arrays.asList(a);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>();


         Integer b[] = list2.toArray(new Integer[list2.size()]);

        ArrayList<Integer> foo = new ArrayList<Integer>();

        Integer[] bar = foo.toArray(new Integer[foo.size()]);



      //  ArrayList list1 = new ArrayList();








        ArrayList<Bird> g1 = new ArrayList<>();
        g1.add(new Hawk());

      //  ArrayList<? extends Birds> g2 = new ArrayList<>();
       // g2.add(new Hawk());
        ArrayList x = new ArrayList();
        ArrayList<Bird> listwithbirds = new ArrayList<>();
        x = listwithbirds;
       // x.add(new String("Hello"));
        x.add(new Bird());
        Bird xb = (Bird) x.get(0);
    }





}
