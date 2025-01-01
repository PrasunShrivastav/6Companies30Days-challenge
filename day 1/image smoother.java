class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[] prev_row = new int[n];
        int top_corner = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 1;
                int sum = img[i][j];
                // bottom
                if ((i + 1) < m) {
                    sum += img[i + 1][j];
                    count++;
                    if ((j - 1) >= 0) {
                        sum += img[i + 1][j - 1];
                        count++;
                    }
                    if ((j + 1) < n) {
                        sum += img[i + 1][j + 1];
                        count++;

                    }
                }
                // right
                if ((j + 1) < n) {
                    sum += img[i][j + 1];
                    count++;
                }
                // top
                if (i - 1 >= 0) {
                    if (j - 1 >= 0) {
                        sum += top_corner;
                        count++;
                    }
                    sum += prev_row[j];
                    count++;
                    if (j + 1 < n) {
                        sum += prev_row[j + 1];
                        count++;
                    }
                }
                // lefyt
                if (j - 1 >= 0) {
                    sum += prev_row[j - 1];
                    count++;
                }

                if ((i - 1 >= 0) ) {
                    top_corner = prev_row[j];

                }
                prev_row[j] = img[i][j];
                img[i][j] = sum / count;
            }
        }
        return img;

    }
}