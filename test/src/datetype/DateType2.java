package datetype;

import java.io.PrintStream;

public class DateType2 {

	public static void main(String[] args) {
		PrintStream out = System.out;

		// Byte
		byte byte1 = 8;
		Byte byte2 = 7;
		out.println("Byte");
		out.println("byte1 + byte2 = " + (byte1 + byte2));
		out.println("byte1 + byte2 = " + byte1 + byte2);

		// short
		short short1 = 300;
		short short2 = 310;
		out.println();
		out.println("Short");
		out.println("short1 + short2 = " + (short1 + short2));

		// Integer
		int integer1 = 450;
		Integer integer2 = 550;
		out.println();
		out.println("Integer");
		out.println("integer1 + integer2 = " + (integer1 + integer2));

		// Long
		long long1 = 100;
		long long2 = 2000;
		out.println();
		out.println("Long");
		out.println("long1 + long2 = " + (long1 + long2));
		
		Long long3 = 100L;
		Long long4 = 200L;
		out.println("long3 + long4 = " + (long3 + long4));

		// Float
		Float float1 = 2.5F;
		float float2 = 3.5F;
		out.println();
		out.println("Float");
		out.println("float1 + float2 = " + (float1 + float2));
		out.println("最大值: " + Float.MAX_VALUE);
		out.println("最小值: " + Float.MIN_VALUE);

		// Double
		double double1 = 25.35;
		Double double2 = 25.45;
		out.println();
		out.println("Double");
		out.println("double1 + double2 = " + (double1 + double2));
		out.println("最大值： " + Double.MAX_VALUE);
		out.println("最大值： " + Double.MAX_EXPONENT);
		out.println("最小值： " + Double.MIN_VALUE);
		out.println("最小值： " + Double.MIN_EXPONENT);

		// Boolean
		boolean boolean1 = true;
		Boolean boolean2 = false;
		out.println();
		out.println("Boolean");
		out.println("boolean1 && boolean2 = " + (boolean1 && boolean2));
		out.println("boolean1 || boolean2 = " + (boolean1 || boolean2));
		out.println("Type = " + Boolean.TYPE);

		// Character1
		char char1 = 'f';
		Character character2 = 'h';
		out.println();
		out.println("Character");
		out.println("char1 + character2 = " + char1 + character2);
		out.println("char1 + character2 = " + (char1 + character2));

		// Byte+Integer
		out.println();
		out.println("byte1 + integer1 = " + (byte1 + integer1));
		out.println("byte2 + integer2 = " + (byte2 + integer2));
		out.println("byte1 + short1 = " + (byte1 + short1));
		out.println("byte1 + long1 = " + (byte1 + long1));
		out.println("byte1 + float1 = " + (byte1 + float1));
		out.println("byte1 + double1 = " + (byte1 + double1));
		out.println("byte1 + char1 = " + (byte1 + char1));
		out.println("byte1 + character2 = " + (byte1 + character2));

		// out.println("byte1 + boolean1 = "+(byte1+boolean1));
		// 除了bollean型，其它七种变量类型都可以相加

		out.println();
		integer1 = byte1;
		out.println("integer1 = "+integer1);
		
		integer2 = byte2.intValue();
		out.println("integer2 = "+integer2);
		
		integer2 = Integer.parseInt(""+byte2);
		out.println("integer2 = "+integer2);
		
		integer2 = Integer.parseInt(Byte.toString(byte2));
		out.println("integer2 = "+integer2);
		
		
		integer2 = byte2.intValue();
        out.println("integer2 = "+integer2);
	    integer2 = Integer.parseInt(Byte.toString(byte2));
        out.println("integer2 = "+integer2);
		integer2=Integer.parseInt(""+byte2);
        out.println("integer2 = "+integer2);
		

	}

}
