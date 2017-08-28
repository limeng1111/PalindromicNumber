package com.limeng.pn;

public class PnTest {
	
	private static int fre = 0;

	public static void main(String[] args) {
		pn(69, 3);
	}
	
	public static void pn(int num, int cnt) {
		if(isPn(num)) {
			System.out.println("cnt = "+fre+"; num = " + num );
			return ;
		} else {
			int revNum = Integer.valueOf(new StringBuffer(num+"").reverse().toString());
			if(fre >= cnt) {
				System.out.println("cnt = "+ fre +"; num = "+num);
				return ;
			} else {
				++fre;
				pn(num+revNum, cnt);
			}
		}
	}
	
	public static boolean isPn(int number) {
		String numStr = number+"".trim();
		int mid = (int) Math.floor(numStr.length()/2);
		String preStr = numStr.substring(0,mid);
		String nextStr;
		if(numStr.length()%2 == 0)
			nextStr = numStr.substring(mid);
		else 
			nextStr = numStr.substring(mid+1);
		return preStr.equals(new StringBuffer(nextStr).reverse().toString());
	}
}
