package Section05;
/*
 
 * 
 **
 ***
 ****
 *****
 ******
 *******
 ********
 
 반복문 조건문 연습
 주말숙제 2중 for문 코드 분석하기
 
 2번
 	*
   **
  ***
 ****
 
 3번
 	*
   ***
  *****
 *******
 
 4번			i
 	*		0	456
   ***		1	 56
  *****		2	  6
 *******	3
  *****		4	
   ***		5
    *		6

5번 구구단
	2x1=2	3x1=3 4x1=4
*/
public class LoopHomeWork {
	
	public static void main(String[] args) {
		
/*		for(int i = 0; i < 7; i++) {
				for(int j = 0; j < 7; j++) {
					if (i < 4) {
						if(i + j < 3) {
							System.out.print(" ");
						} else if ( j - i > 3) {
							System.out.print(" ");
						
						} else {
							System.out.print("*");
						}
						
				
					}else	{
						if(i - j > 3) {	
							System.out.println(" ");
						} else if ( i + j > 9) {
							System.out.print(" ");
							
						}else {
							System.out.print("*");
						}
						
					}
				}
				System.out.println();		//개행
		} 
	} 
}*/
		System.out.println("   ☆");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {	
				if(i+j<3) {
					System.out.print(" ");
				}else if (j -i>3) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); //개행
		}
		System.out.println(" || Merry Christmas~*");
	}
}
	
			


