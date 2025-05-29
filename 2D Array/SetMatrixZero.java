class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        int i =0;
        while(i<row.size() && i<col.size()){
            int r = row.get(i);
            int c = col.get(i);
            for(int j =0;j<m;j++){
                matrix[j][c] = 0;
            }
            for(int j = 0;j<n;j++){
                matrix[r][j] = 0;
            }
            i++;
        }
    }
    
    
}