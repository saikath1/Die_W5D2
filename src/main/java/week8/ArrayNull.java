package week8;

public class ArrayNull {
        public static boolean isArrayEmpty(String arr[]) {
            if(arr == null) {
                return true;
            } else if(arr.length == 0) {
                return true;
            } else {
                for(String str: arr) {
                    if(str != null) {
                        return false;
                    }
                }
                return true;
            }
        }

        public static void main(String[] args) {
            String arr[] = null;
            if(isArrayEmpty(arr)) {
                System.out.println("arr is empty.");
            } else {
                System.out.println("arr is not empty.");
            }

            String arr1[] = {};
            if(isArrayEmpty(arr1)) {
                System.out.println("arr1 is empty.");
            } else {
                System.out.println("arr1 is not empty.");
            }

            String arr2[] = {null, null, null};
            if(isArrayEmpty(arr2)) {
                System.out.println("arr2 is empty.");
            } else {
                System.out.println("arr2 is not empty.");
            }

            String arr3[] = {"apple", "banana", "cherry"};
            if(isArrayEmpty(arr3)) {
                System.out.println("arr3 is empty.");
            } else {
                System.out.println("arr3 is not empty.");
            }
        }
    }
