package com.generic;

	
	import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
	public class Utilities {
		// Random String First Name
		public String getRandomFirstName() {
		
	String names[] = { "Sachin", "Amol", "Nitin", "Vaibhav", "Sumit" };
	String strname = (names[new Random().nextInt(names.length)]);
	return strname;
	}
	
	//Random Surname
	public String getRandomSurname() {
	String names[] = { "pati", "khanna", "deshpande", "jhadhav", "Bhandari" };
	String strname = (names[new Random().nextInt(names.length)]);
	return strname; } public String getRandomMobile_Number() {
	String names[] = { "99","97"};
	String strEmailormobile = (names[new Random().nextInt(names.length)]);
	return strEmailormobile; } public String getRandomEmaiId() {
	String names[] = { "@gmail.com"};
	String strEmailormobile = (names[new Random().nextInt(names.length)]);
	return strEmailormobile; } public String getRandomPassword() {
	String names[] = { "verve@123" };
	String strPassword = (names[new Random().nextInt(names.length)]);
	return strPassword; } public static String getRandomDay() {
	Random objrandom = new Random();
	int intMaxDay = 31;
	int intMinDay = 1;
	int rand_Day = objrandom.nextInt(intMaxDay - intMinDay) + intMinDay;
	String strDate=Integer.toString(rand_Day);
	return strDate; }
	/*public static int getRandomYear() {
	Random objrandom = new Random();
	int intMaxYear = 2017;
	int intMinYear = 1905;
	int rand_Year = objrandom.nextInt(intMaxYear - intMinYear) + intMinYear;
	return rand_Year; } /*public String getRandomMonths() {
	String Month_names[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aus", "Sep", "Oct", "Nov", "Dec" };
	String str_Month_Name = (Month_names[new Random().nextInt(Month_names.length)]);
	return str_Month_Name; }
	*/ public String GetBirthMonth() { String[] strValues = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; Random monthValue = new Random(); int randomMonth = monthValue.nextInt(strValues.length);
	String strGetBirthMonth;
	strGetBirthMonth = strValues[randomMonth]; return strGetBirthMonth; }
	public String getBirthYear() { int intBirthYear = ThreadLocalRandom.current().nextInt(1905, 2021);
	String strGetBirthYear;
	strGetBirthYear = String.valueOf(intBirthYear); return strGetBirthYear;
	}
	// Random String /*
	//public String getRandomGender() {
	//String names[] = { "Male", "Female" };
	//String strname = (names[new Random().nextInt(names.length)]);
	//return strname; }
	//*/
	public String getGender() { String[] strValues = { "Male", "Female" }; Random genderValue = new Random(); int randomGender = genderValue.nextInt(strValues.length);
	String strGetGender;
	strGetGender = strValues[randomGender]; return strGetGender;
	}
	
	//Random String
	public String getRandomStrings(int length){
	String strValue ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPZXCVBNMLKJHGFDSA";
	String randomString="";
	for(int index=0;index < length ;index++){
	int rnum= (int) Math.floor((Math.random()*strValue.length()));
	randomString +=strValue.substring(rnum, rnum+1);
	}
	return randomString;
	}
	
	//Random number
	public long getRandomMobile(int length){
	Random random = new Random();
	char[]digit=new char[8];
	digit[0]=(char) ((char)random.nextInt(8)+'1');
	for(int i=1;i<digit.length;i++)
	{
	digit[i]=(char)(random.nextInt(10)+'0');
	}
	return Long.parseLong(new String(digit));
	}}




