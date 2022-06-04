import syntaxtree.*;
import visitor.*;
class P4
{
	public static void main(String [] args)
	{
		try
		{
			Node root = new FunkyTacoJavaParser(System.in).Goal();
			MyVisitor<Integer> obj = new MyVisitor<Integer>();
			Integer x = new Integer(0);
			root.accept(obj,x);
			x++;
			root.accept(obj,x);
      	}
      	catch (ParseException e) {
         	System.out.println(e.toString());
      } 
	}
}
