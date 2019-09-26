class HelloWorld{

public static void main(String[]a){
	String reverse=reverseString("saurabh");
System.out.println("hElloWorld  "+ reverse);
}

static String reverseString(String myStr)
{
	if(myStr.isEmpty()){
	return myStr;
	}
	return (myStr.substring(1)+myStr.charAt(0));
}
}