/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;


import java.util.Comparator;

/**
 *
 * @author ehaque
 */
public class BinarySearch {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10,12,15,18,20,21,22,26,29,34,36,40,45,47,56,78,90};

    public static void main(String[] args) {
          System.out.println(""+binarySearch(arr, 0, arr.length - 1, 340));
          //System.out.println(""+linierSearch(arr,34));
    }

    static int binarySearch(int[] arr, int start, int end, int terget) {
        if(start>end) return -1;
        int midIndex = (start + end) / 2;
        System.out.println("Calld"+midIndex);
        if (arr[midIndex] == terget) {
            return midIndex;
        }

        if (arr[midIndex] > terget) {
            return binarySearch(arr, start, midIndex - 1, terget);
        } else if (arr[midIndex] < terget) {
            return binarySearch(arr, start + 1, end, terget);
        }
        return -1;
    }
    
    static int linierSearch(int [] arr, int terget){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Loop Called");
            if(arr[i]==terget) return i;
            
        }
        
        return 0;
    
    }
    
    static class CompareNameASC implements Comparator<Model> {
        public int compare(Model c1, Model c2) {
            return c1.getName().compareTo(c2.getName());
        }
    }
    
    static class CompareNameDESC implements Comparator<Model> {
        public int compare(Model c1, Model c2) {
            return c2.getName().compareTo(c1.getName());
        }
    }
    
    static class CompareAge implements Comparator<Model> {
        public int compare(Model c1, Model c2) {
            return c2.getAge() - (c1.getAge());
        }
    }
    
    static class Model {
        String name;
        int age;

        public Model(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        
    }

}
