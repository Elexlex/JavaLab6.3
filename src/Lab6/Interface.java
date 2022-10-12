package Lab6;

public interface Interface {

    int fold(int[] arr);
}
class One implements Interface{

    //calculates even elements
    public int fold(int[] arr) {
        int number = 0;
        for (int j : arr) {
            if (j % 2 == 0)
                number++;
        }
        return number;
    }
}
class Two implements Interface{

    //calculates not even elements
    public int fold(int[] arr) {
        int number = 0;
        for (int j : arr) {
            if (j % 2 != 0)
                number++;
        }
        return number;
    }
}