class tt {
String lname;
public Main(String x1, String x2)
{
super(x1);       //passing argument to parent class constructor
this.lname = x2;
}
public void display()
{
System.out.println(super.lname+" and "+lname);
}
public static void main(String[] args)
{
Main c = new Main("library name","library id");
c.display();
}
}class Library
{
String lname;
public Library(String m)
{
lname = m;
}
}
