package Exam1;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		int loop=0;
		int n=0;
		int number[] = new int[100];
		for (int j = 101; j <= 200; j++) {
			int i=0;
			for(i=2; i < j; i++){
				if(j%i == 0){
					break;
				}else{
					continue;
				}
			}if(i > j-1){
				loop++;
				number[n]=j;
				n++;
			}
		}
		System.out.print("101-200之间有" + loop+ "个素数，分别是：");
		for (n = 0; n < loop; n++) {
			System.out.print(number[n] + ",");
		}
	}
}
