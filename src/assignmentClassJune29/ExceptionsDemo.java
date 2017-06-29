package assignmentClassJune29;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class CardException extends RuntimeException {
	public CardException(String msg) {
		super(msg);
	}
}

class CvvException extends RuntimeException {
	public CvvException(String msg) {
		super(msg);
	}
}

class CreditCardNumException extends RuntimeException {
	public CreditCardNumException(String msg) {
		super(msg);
	}
}

class CreditCardDateException extends RuntimeException {
	public CreditCardDateException(String msg) {
		super(msg);
	}
}

public class ExceptionsDemo {
	@SuppressWarnings("serial")
	public static void main(String[] args) {

		String creditCardNum = "";
		String cvv = "";
		String cardType = "";
		boolean cVV = false;
		boolean ccNUM = false;
		boolean ccTYPE = false;
		boolean dateCHECK = false;
		
		Scanner scan = new Scanner(System.in);
		try{
		System.out.println("Enter Credit Card Number: ");
		creditCardNum = scan.next();
		}catch(InputMismatchException e){
			System.out.println("Invalid input type of Card Number: "+e);
		}
		try{
		System.out.println("Enter Card Type: ");
		cardType = scan.next();
		}catch(InputMismatchException e){
			System.out.println("Invalid input type of Card Type: "+e);
		}
		try{
		System.out.println("Enter CVV: ");
		cvv = scan.next();
		}catch(InputMismatchException e){
			System.out.println("Invalid input type of CVV Number: "+e);
		}

		// CVV CHECK
		cVV = cvvCheck(cvv, cardType, creditCardNum);
		if (cVV) {
			System.out.println("CVV is valid");
		} else {
			throw new CvvException("Invalid Card");
		}
		

		// CREDIT CARD NUM CHECK
		System.out.println(ccardNumCheck(creditCardNum));
		ccNUM = ccardNumCheck(creditCardNum);
		if (ccNUM) {
			System.out.println("CVV is valid");
		} else {
			throw new CreditCardNumException("Invalid Card");
		}
		

		// CREDIT CARD TYPE CHECK
		String ccType = creditCardTypeCheck(creditCardNum);
		ccTYPE = cardType.equalsIgnoreCase(ccType);
		if (ccTYPE) {
			System.out.println("Card Type is Valid");
		} else {
			throw new CardException("Invalid Card");
		}
		

		// TAKING DATE INPUT AND CHECKING WITH TODAY'S DATE.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
		Date currentDate = new Date();
		String scb = dateFormat.format(currentDate);
		dateFormat.setLenient(false);
		System.out.println("/nEnter Four Digits for year: ");
		int year = scan.nextInt();
		System.out.println("Enter two Digits for month: ");
		int month = scan.nextInt();
		System.out.println("Enter two Digits for day: ");
		int d = scan.nextInt();
		@SuppressWarnings("deprecation")
		
		Date userEnteredDate1 = new Date(year, month, d) {
		};
		// DATE CHECK
		System.out
				.println("DateCheck: " + currentDate.before(userEnteredDate1));
		dateCHECK = currentDate.before(userEnteredDate1);
		if (dateCHECK) {
			System.out.println("Card Type is Valid");
		} else {
			throw new CreditCardDateException("Invalid Card");
		}

		// String cardDate = (year+"/"+month+"/"+d);
		// String todayDate = dateFormat.format(date);
		// System.out.println(cardDate + (dateFormat.format(date)));
		// System.out.println(toda);
		// DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		// System.out
		// .println("Enter date and time in the format yyyy-MM-ddTHH:mm");
		// Date date = null;
		// System.out.println("For example, it is now "
		// + format.format(new Date()));
		//
		// while (date == null) {
		// String line = scan.nextLine();
		// try {
		// date = format.parse(line);
		// } catch (ParseException e) {
		// System.out
		// .println("Sorry, that's not valid. Please try again.");
		// }
		// }

	}

	private static String creditCardTypeCheck(String cString) {
		int len = cString.length();
		String str = "";
		if (cString.startsWith("5") && len == 16) {
			str += "MasterCard";
		} else if (cString.startsWith("4") && len == 16 && len != 13) {
			str += "VISA";
		} else if (cString.startsWith("34") || cString.startsWith("37")
				&& len == 15 && len != 16) {
			str += "AMEX";

		} else if (cString.startsWith("6011") && (len != 15 && len == 16)) {
			str += "DISCOVER";
		} else {
			str += "Unknown";
		}
		return str;
	}

	private static boolean cvvCheck(String cvv, String cardType,
			String creditCardNum) {
		if ((cvv.length() == 4) && cardType.equalsIgnoreCase("visa")
				&& creditCardNum.length() == 15) {
			return true;
		} else if ((cvv.length() == 3)) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean ccardNumCheck(String cardNumber) {
		int sum = 0;
		boolean alternate = false;
		for (int i = cardNumber.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(cardNumber.substring(i, i + 1));
			if (alternate) {
				n *= 2;
				if (n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum += n;
			alternate = !alternate;
		}
		return (sum % 10 == 0);
	}

	// public static int sumOfOddPlace(long[] array) {
	// int result = 0;
	// for (int i = 1; i < array.length; i += 2) {
	// result += array[i];
	// }
	// return result;
	// }
	// //And in sumOfDoubleEvenPlace:
	//
	// public static int sumOfDoubleEvenPlace(long[] array) {
	// int result = 0;
	// for (int i = 0; i < array.length; i += 2) {
	// result += (2 * array[i]);
	// }
	// return result;
	// }
}
