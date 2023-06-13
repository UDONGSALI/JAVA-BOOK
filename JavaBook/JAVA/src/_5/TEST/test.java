package _5.TEST;

public class test {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};

        for (int i : a            ){
            System.out.print(i + " ");
        }
        System.out.println();

        int[][] b = new int[2][];
        b[0] = new int[]{1, 3, 5};
        b[1] = new int[]{7, 9};

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}
