package assignmentClassJune29;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
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
		boolean dateCHECK_before = false;
		boolean dateCHECK_after = false;

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter Credit Card Number: ");
			creditCardNum = scan.next();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input type of Card Number: " + e);
		}
		try {
			System.out.println("Enter Card Type: ");
			cardType = scan.next();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input type of Card Type: " + e);
		}
		try {
			System.out.println("Enter CVV: ");
			cvv = scan.next();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input type of CVV Number: " + e);
		}

		// CVV CHECK
		cVV = cvvCheck(cvv, cardType, creditCardNum);
		if (cVV) {
			System.out.println("CVV is valid");
		} else {
			throw new CvvException("Invalid Card");
		}

		// CREDIT CARD NUM CHECK
		// System.out.println(ccardNumCheck(creditCardNum));
		ccNUM = ccardNumCheck(creditCardNum);
		if (ccNUM) {
			System.out.println("CREDIT CARD NUMBER is valid");
		} else {
			throw new CreditCardNumException("Invalid Card");
		}

		// CREDIT CARD TYPE CHECK
		String ccType = creditCardTypeCheck(creditCardNum);
		ccTYPE = cardType.equalsIgnoreCase(ccType);
		if (ccTYPE) {
			System.out.println("CREDIT Card Type is Valid");
		} else {
			throw new CardException("Invalid Card");
		}

		// TAKING DATE INPUT AND CHECKING WITH TODAY'S DATE.

		YearMonth ym = YearMonth.now();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
		Date currentDate = new Date();
		System.out.println("Date currentDate: " + currentDate);
		String scb = dateFormat.format(currentDate);
		System.out.println("String scb: " + scb);
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
		// System.out.println("Date userEnteredDate1: "+userEnteredDate1);
		// String userEntered = dateFormat.format(userEnteredDate1);
		// System.out.println("String userEntered: "+userEntered);
		// DATE CHECK
		dateCHECK_before = currentDate.before(userEnteredDate1);
		dateCHECK_after = currentDate.after(userEnteredDate1);
		System.out.println("dateCHECK_before: " + dateCHECK_before);
		System.out.println("dateCHECK_after: " + dateCHECK_after);

		if (dateCHECK_before) {
			System.out.println("This is a Valid");
		} else if (dateCHECK_after) {
			throw new CreditCardDateException(
					"Credit Card Entered is yet to come. Please check and enter.");
		} else {
			throw new CreditCardDateException("Card Date Expired");
		}
	}

	private static String creditCardTypeCheck(String cString) throws CardException{
		int len = cString.length();
		if(cString.length()<16)
		{
			throw new CardException("Please enter valid number of digits exactly");
		}
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
			String creditCardNum) throws CvvException{
		if ((cvv.length() == 4) && cardType.equalsIgnoreCase("amex")
				&& creditCardNum.length() == 15) {
			return true;
		} else if ((cvv.length() == 3)) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean ccardNumCheck(String cardNumber) throws CreditCardNumException{
		if(cardNumber.length()<16 ||cardNumber.length()<15 )
		{
			throw new CardException("Please enter valid number of digits exactly");
		}
		int sum = 0;
		try {
			boolean alternate = false;
			for (int i = cardNumber.length() - 1; i >= 0; i--) {
				int n = Integer.parseInt(cardNumber.substring(i, i + 1));
				// throw new CreditCardNumException("Invalid Digits Entered");
				if (alternate) {
					n *= 2;
					if (n > 9) {
						n = (n % 10) + 1;
					}
				}
				sum += n;
				alternate = !alternate;
			}

		} catch (NumberFormatException e) {
			System.out
					.println("Invalid Digits Entered. Please enter integer values."
							+ e);
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
