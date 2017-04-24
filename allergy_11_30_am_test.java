package practice;

import java.sql.Date;

import java.sql.Time;

import java.util.ArrayList;

import java.util.HashMap;

public class allergy_11_30_am_test {

	public static void main(String[] args) {

		int age = 25;

		String allergy_type = "feaver";

		String allergy_severity = "medium";

		Date date = new Date(System.currentTimeMillis());

		Time time = new Time(System.currentTimeMillis());

		String person_reported = "friend";

		details d = new details(age, allergy_type, allergy_severity, date, time, person_reported);

		ArrayList<details> temp = new ArrayList<>();

		temp.add(d);

		HashMap<String, ArrayList<details>> temp2 = new HashMap<>();

		String patient = "umesh";

		Allergy al = new Allergy();

		if (al.check_if_exists(patient))

		{

			al.addData_to_new(patient, d);

			System.out.println("1");

		}

		else

		{

			al.addData_to_existing(patient, d);

			System.out.println("2");

		}

		System.out.println(al.getData().get(patient).get(0).getPerson_reported());

		if (al.check_if_exists(patient))

		{

			al.addData_to_new(patient, d);

			System.out.println("1");

		}

		else

		{

			al.addData_to_existing(patient, d);

			System.out.println("2");

		}

		System.out.println(al.getData().get(patient).get(1).getAllergy_severity());

	}

}

class Allergy {

	private String name;

	private HashMap<String, ArrayList<details>> data = new HashMap<>();

	public String getName() {

		return name;

	}

	public HashMap<String, ArrayList<details>> getData() {

		return data;

	}

	public void addData_to_new(String name, details data1) {

		// System.out.println(data1.getAge());

		ArrayList<details> temp = new ArrayList<>();

		temp.add(data1);

		data = new HashMap<>();

		data.put(name, temp);

	}

	public void addData_to_existing(String name, details data1) {

		ArrayList<details> temp = data.get(name);

		temp.add(data1);

		data.put(name, temp);

	}

	public boolean check_if_exists(String name) {

		if (data.get(name) == null)

			return true;

		else

			return false;

	}

}

class details {

	private int age;

	private String allergy_type;

	private String allergy_severity;

	private Date date;

	private Time time;

	private String person_reported;

	public details(int age, String allergy_type, String allergy_severity, Date date, Time time,

			String person_reported) {

		this.age = age;

		this.allergy_type = allergy_type;

		this.allergy_severity = allergy_severity;

		this.date = date;

		this.time = time;

		this.person_reported = person_reported;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public String getAllergy_type() {

		return allergy_type;

	}

	public void setAllergy_type(String allergy_type) {

		this.allergy_type = allergy_type;

	}

	public String getAllergy_severity() {

		return allergy_severity;

	}

	public void setAllergy_severity(String allergy_severity) {

		this.allergy_severity = allergy_severity;

	}

	public Date getDate() {

		return date;

	}

	public void setDate(Date date) {

		this.date = date;

	}

	public Time getTime() {

		return time;

	}

	public void setTime(Time time) {

		this.time = time;

	}

	public String getPerson_reported() {

		return person_reported;

	}

	public void setPerson_reported(String person_reported) {

		this.person_reported = person_reported;

	}

}