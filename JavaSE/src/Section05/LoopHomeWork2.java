package Section05;
/*2x1=2	3x1=3	4x1=4	
2x2=4	3x2=6	4x2=8	
2x3=6	3x3=9	4x3=12	
2x4=8	3x4=12	4x4=16	
2x5=10	3x5=15	4x5=20	
2x6=12	3x6=18	4x6=24	
2x7=14	3x7=21	4x7=28	
2x8=16	3x8=24	4x8=32	
2x9=18	3x9=27	4x9=36	

5x1=5	6x1=6	7x1=7	
5x2=10	6x2=12	7x2=14	
5x3=15	6x3=18	7x3=21	
5x4=20	6x4=24	7x4=28	
5x5=25	6x5=30	7x5=35	
5x6=30	6x6=36	7x6=42	
5x7=35	6x7=42	7x7=49	
5x8=40	6x8=48	7x8=56	
5x9=45	6x9=54	7x9=63	

8x1=8	9x1=9	
8x2=16	9x2=18	
8x3=24	9x3=27	
8x4=32	9x4=36	
8x5=40	9x5=45	
8x6=48	9x6=54	
8x7=56	9x7=63	
8x8=64	9x8=72	
8x9=72	9x9=81	
*/

public class LoopHomeWork2 {
	public static void main(String[] args) {
		
		for(int k = 0; k <3; k++) {
			for(int i=0; i<9; i++) {
				for(int j = 0; j<3; j++) {
					int dan = j + 2 + (k*3);
					int num = i + 1;
					if (dan > 9)
						break;
					System.out.print(dan + "x" + num + "=" + dan * num + "\t");
				}
				System.out.println(); //개행
			}
			System.out.println();
		}
	}

}
