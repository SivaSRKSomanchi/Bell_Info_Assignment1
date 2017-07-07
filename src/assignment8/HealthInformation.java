package assignment8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class HealthInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Instantiating Doctor Objects
		Doctor d1 = new Doctor(1, "Siva", "Cardiologist");
		Doctor d2 = new Doctor(2, "Rama", "Psychologist");
		Doctor d3 = new Doctor(3, "Krishna", "Neurologist");
		Doctor d4 = new Doctor(4, "SaiRam", "Gynechologist");
		// Instantiating Address Objects
		Address a1 = new Address("513", "N Mulberry", "Maryville", "MO", 64468);
		Address a2 = new Address("213", "S Filmore", "LegacyCircle", "VA",
				20170);
		Address a3 = new Address("13621", "APT #C", "ClockTower", "VA", 20166);
		Address a4 = new Address("6743", "N Walnut", "St.JO", "MO", 64478);
		Map<Hospital, Integer> hospital = new HashMap<Hospital, Integer>();
		// Instantiating Hospital Objects
		Hospital h1 = new Hospital("SSM", d1, a1);
		Hospital h6 = new Hospital("SSM", d3, a2);
		Hospital h7 = new Hospital("SSM", d2, a3);
		Hospital h2 = new Hospital("HealthCare", d2, a2);
		Hospital h3 = new Hospital("Generic", d3, a3);
		Hospital h4 = new Hospital("Apollo", d4, a4);
		Hospital h5 = new Hospital("Apollo", d1, a3);
		// Adding Hospital Objects into HashMap
		hospital.put(h1, 1);
		hospital.put(h2, 5);
		hospital.put(h4, 2);
		hospital.put(h3, 3);
		hospital.put(h5, 4);
		hospital.put(h6, 6);
		hospital.put(h7, 7);
		System.out.println("These are the available Hospitals....\n ");
		printMap(hospital); // Prints HashMap

		System.out.println("Do U want enter Hospital Details..");
		String ans = scan.next();
		while (ans.equalsIgnoreCase("yes")) {
			int i = 8;
			System.out.println("Enter Hospital Name: ");
			String hName = scan.nextLine();
			System.out.println("Enter Hospital Address 1: ");
			String hAddr1 = scan.nextLine();
			System.out.println("Enter Hospital Address 2: ");
			String hAddr2 = scan.nextLine();
			System.out.println("Enter Hospital City: ");
			String hCity = scan.nextLine();
			System.out.println("Enter Hospital State: ");
			String hState = scan.nextLine();
			System.out.println("Enter Hospital ZipCode: ");
			int hZip = scan.nextInt();
			Doctor newD = new Doctor();
			Address newAddr = new Address(hAddr1, hAddr2, hCity, hState, hZip);
			Hospital newH = new Hospital(hName, newD, newAddr);
			if (hospital.containsKey(newH)) {
				System.out.println("Hospital Already Present..");
			} else {
				hospital.put(newH, i);
			}
			i++;
		}
		System.out
				.println("Do U want enter your problem check nearBy hospital for your ZipCode: ");
		String ans1 = scan.next();
		while (ans.equalsIgnoreCase("yes")) {
			System.out.println("Enter Your Problem..");
			System.out
					.println("Cardio-Cardiologist, NervesWeekness-Neurologist, \nWomenProblems-Gynechologist, MentalDisturbance-Psychologist");
			String specialization = scan.next();
			System.out.println("Enter Your ZipCode: ");
			int zip = scan.nextInt();
			// Enter Your Problem and Zip-> This method displays nearBy
			// Hospitals required to you.
			nearBY(hospital, zip, specialization);
		}
		System.out
				.println("Do U want enter your problem check nearBy hospital for your ZipCode: ");
		String ans2 = scan.next();
		while (ans2.equalsIgnoreCase("yes")) {
			Map<String, List> hmap = new HashMap<String, List>();
			List<Hospital> list1 = new ArrayList<Hospital>();
			list1.add(h1);
			list1.add(h6);
			list1.add(h7);
			List<Hospital> list4 = new ArrayList<Hospital>();
			list4.add(h4);
			list4.add(h5);
			List<Hospital> list7 = new ArrayList<Hospital>();
			list7.add(h2);
			List<Hospital> list10 = new ArrayList<Hospital>();
			list10.add(h3);
			// Inserting into HashMap
			hmap.put(h2.getHospitalName(), list7);
			hmap.put(h1.getHospitalName(), list1);
			hmap.put(h3.getHospitalName(), list10);
			hmap.put(h4.getHospitalName(), list4);
			// Enter Hospital Name -> This method displays all the Doctor
			// Details at that hospital.
			EnterHospitalName(hmap);
		}

	}

	public static void EnterHospitalName(Map<String, List> hmap) {
		System.out.println("Enter the hospital names: ");
		Scanner scan = new Scanner(System.in);
		String hospName = scan.next();
		List<Hospital> l = null;
		for (String s : hmap.keySet()) {
			if (hospName.equalsIgnoreCase(s)) {
				l = hmap.get(s);
			}
		}
		for (Hospital h : l) {
			System.out.println("Doctor Details: ");
			System.out.println("Doctor ID: " + h.doc.docId);
			System.out.println("Doctor Name: " + h.doc.name);
			System.out
					.println("Doctor Specialization: " + h.doc.specialization);
		}

	}

	public static void nearBY(Map<Hospital, Integer> hospital, int zip,
			String specializatioin) {
		int a = zip;
		Set<Hospital> keys = hospital.keySet();
		System.out.println("KEys in::: " + keys);
		Hospital hospitalNearBy = null;
		for (Hospital h : keys) {
			if (Math.abs(zip - h.hospitalAddress.zipCode) < a) {
				a = Math.abs(zip - h.hospitalAddress.zipCode);
				hospitalNearBy = new Hospital(h.hospitalName, h.doc,
						h.hospitalAddress);
			}
		}
		System.out.println("Hospital near to entered zipcode is "
				+ hospitalNearBy);
		if (specializatioin.equalsIgnoreCase(hospitalNearBy.doc.specialization)) {
			System.out
					.println("Your Required Specialization available here in this hospital "
							+ hospitalNearBy.hospitalName
							+ "\n"
							+ hospitalNearBy.doc
							+ "\n"
							+ hospitalNearBy.hospitalAddress);
		} else {
			System.out
					.println("Required, not available near your location. Try another ZipCode.");
		}

	}

	public static void printMap(Map<Hospital, Integer> hospital) {

		Set<Hospital> keys = hospital.keySet();
		for (Hospital p : keys) {
			System.out.println(p + "==>" + hospital.get(p));
		}
		// for (Map.Entry<Hospital, Integer> entry : hospital.entrySet()) {
		// Hospital h = entry.getKey();
		// int key = entry.getValue();
		// System.out.println(key + ". " + h.hospitalName + " "
		// + h.doc.toString() + " " + h.hospitalAddress.toString());
		// }
	}
}

class Hospital {
	String hospitalName;
	Doctor doc;
	Address hospitalAddress;

	public Hospital(String hospitalName, Doctor doc, Address hospitalAddress) {
		super();
		this.hospitalName = hospitalName;
		this.doc = doc;
		this.hospitalAddress = hospitalAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hospitalAddress == null) ? 0 : hospitalAddress.hashCode());
		result = prime * result
				+ ((hospitalName == null) ? 0 : hospitalName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (hospitalAddress == null) {
			if (other.hospitalAddress != null)
				return false;
		} else if (!hospitalAddress.equals(other.hospitalAddress))
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		return true;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public Address getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(Address hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	@Override
	public String toString() {
		return "Hospital Name: " + hospitalName + ", Doctor Details: " + doc
				+ ", H ospitalAddress=" + hospitalAddress + "]";
	}

}

class Doctor {
	int docId;
	String name;
	String specialization;

	public Doctor() {

	}

	public Doctor(int docId, String name, String specialization) {
		super();
		this.docId = docId;
		this.name = name;
		this.specialization = specialization;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + docId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docId != other.docId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", name=" + name
				+ ", specialization=" + specialization + "]";
	}

}

class Address {
	String address1;
	String address2;
	String city;
	String state;
	int zipCode;

	public Address(String address1, String address2, String city, String state,
			int zipCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result
				+ ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}

}

// class AddandNameComparator implements Comparator<Hospital>{
//
// @Override
// public int compare(Hospital o1, Hospital o2) {
// // TODO Auto-generated method stub
//
//
// if(o1.hospitalName==o2.hospitalName)
// return 0;
// else if(o1.hospitalAddress.equals(o2.hospitalAddress))
// return 1;
// else
// return -1;
// }
//
// }