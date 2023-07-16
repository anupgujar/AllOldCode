package firstDecPackage;

public class Array1 {
	public static void main(String[] args) {
		float a[][] = new float[3][4];
		a[0][0] = 23.5f;
		a[0][1] = 204.5f;
		a[0][2] = 25.5f;
		a[1][3] = 26.5f;
		a[1][0] = 650.5f;
		a[1][1] = 60.5f;
		a[2][2] = 80.5f;
		a[2][3] = 850.5f;
		a[2][0] = 234.5f;
		int row = a.length;
		int col = a[0].length;
		System.out.println(row);
		System.out.println(col);
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				System.out.println(a[i][j]);
			}System.out.println();
		}
	}
}

