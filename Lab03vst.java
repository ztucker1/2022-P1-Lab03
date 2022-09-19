// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
	  int milliseconds = 10000123;
		int hours = milliseconds/3600000;
		int min = 2800/60;
		int second = milliseconds/60/60/60-6;
		int msec = milliseconds-10000000;
		System.out.println("Starting milli-seconds: " + milliseconds);
		System.out.println("Hours:                  " + hours);
		System.out.println("Minutes:                " + min);
		System.out.println("Seconds:                " +second);
		System.out.println("Milli Seconds:          " + msec);

	}
}

