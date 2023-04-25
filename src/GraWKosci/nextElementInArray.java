package GraWKosci;

public class nextElementInArray {
    public static int start(String[] arr, int currentIndex) {

        // zwraca element strin, aby zwracał element tablicy jakiegokolwiek typu trzyba zrobić tablicę objektów?
        if (currentIndex < arr.length - 1) {
            return currentIndex++;
        } else {
            return 0;
        }
    }
}
