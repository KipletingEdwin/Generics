//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // generics    =     enables types(classes and interfaces) to be parameters when defining:
        //                   classes, interfaces and methods
        //                   a benefit is to eliminate the need to create multiple versions
        //                   of methods or classes for various data types
        //                   Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] intDouble = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(intDouble);
        displayArray(charArray);
        displayArray(stringArray);

    }

        public static <Thing> void displayArray(Thing[] array){
            for(Thing x : array){
                System.out.println(x+" ");
            }
            System.out.println();
        }


}