import syntaxtree.*;
import visitor.*;
public class P3
{
	public static void main(String[] arg)
	{
		try
		{
			Node root = new TACoJavaParser(System.in).Goal();
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
