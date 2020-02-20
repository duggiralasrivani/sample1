package Task4;

public class SimpleCompound {
	 int simpleinterest(int p,int t,int r)
	{
		int si=(p*t*r)/100;
		return si;
	}
	
	 double compoundinterest(int p,int t,double r,int n)
	{
		//double r1=(r/100);
		double ci=p * Math.pow(1 + (r / n), n * t);
		//double ci1=ci-p;
		return ci;
	}
	
}

