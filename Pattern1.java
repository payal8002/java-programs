class Pattern1{
	 public static void main(String[] args) {
        int n = 4; // Change this value if you want a different number of rows

        int[][] pattern = new int[n][n];

        int count = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    pattern[i][j] = count++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    pattern[i][j] = count++;
                }
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
