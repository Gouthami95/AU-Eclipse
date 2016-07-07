package demoProj;

public interface CalcSpec 
{
	public Integer add(Integer a,Integer b);
	public Integer sub(Integer a,Integer b);
	public long mul(Integer a,Integer b);
	public Integer div(Integer a,Integer b) throws ArithmeticException;
}
