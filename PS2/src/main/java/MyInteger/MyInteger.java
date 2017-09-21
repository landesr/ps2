package MyInteger;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {

		this.iValue = iValue;
	}
	
	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		return (getiValue()%2 == 0);
	}
	
	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		if (iValue == 0||iValue == 1||iValue==2) {
			return false;
		} else {
			for (int i = 2; i < iValue; i++) {
				if (iValue%i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	
	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	
	public static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean isEquals(int n) {
		return (this.getiValue() == n);
	}
	
	public boolean isEquals(MyInteger n) {
		return (this.getiValue() == n.getiValue());
	}

}


