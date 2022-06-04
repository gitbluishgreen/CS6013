class MoreThan4 {
public static void main(String [] a){
MT4 __local_0;
int __local_1;
int __local_2;
int __local_3;
int __local_4;
int __local_5;
int __local_6;
int __local_7;
__local_0 = new MT4();
__local_1 = 1;
__local_2 = 2;
__local_3 = 3;
__local_4 = 4;
__local_5 = 5;
__local_6 = 6;
__local_7 = __local_0.Start(__local_1,__local_2,__local_3,__local_4,__local_5,__local_6);
System.out.println(__local_7);
}
}
class MT4{
public int Start(int p1,int p2,int p3,int p4,int p5,int p6){
int __local_8;
int aux;
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
__local_8 = this.Change(p6,p5,p4,p3,p2,p1);
aux = __local_8;
return aux;
}
public int Change(int p1,int p2,int p3,int p4,int p5,int p6){
int __local_9;
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
__local_9 = 0;
return __local_9;
}
}
