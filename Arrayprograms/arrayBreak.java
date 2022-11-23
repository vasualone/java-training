public class arrayBreak {
    public static void main(String[] args) {
        int[] index = {12, 23, 34, 45, 56, 67, 78, 89, 90};

        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);

        }

        for (int j = 0; j < index.length; j++) {

            if (index[j] == 45)
                continue;
            System.out.println(index[j]);

        }
    }

}







