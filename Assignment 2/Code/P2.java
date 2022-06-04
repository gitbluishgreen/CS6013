import syntaxtree.*;
import visitor.*;
import java.util.*;
public class P2
{
	public static void main(String[] arg)
	{
		try
		{
			Node root = new BuritoJavaParser(System.in).Goal();
			Integer x = new Integer(0);
			Myvisitor<Integer> obj = new Myvisitor<Integer>();
			root.accept(obj,x);//symbol table pass
			x++;
			root.accept(obj,x);//temporary generation pass
			x++;
			root.accept(obj,x);//code generation pass
      	}
      	catch (ParseException e) {
         	System.out.println(e.toString());
      }
	}
}
