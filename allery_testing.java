package practice;

import java.security.Timestamp;

import java.sql.Date;

import java.sql.Time;

public class allery_testing {

	public static void main(String args[])

	{

		Date a = new Date(System.currentTimeMillis());

		System.out.println(a.toString());

		Time b = new Time(System.currentTimeMillis());

		System.out.println(b);

		allery_testing_class obj = new allery_testing_class("a", "b", a, 10) {

		};

		System.out.println(obj.getReported_time());

	}

}

class allery_testing_class {

	private enum gender {

		male, female

	};

	private String patient;

	private String symptom;

	private Date reported_time;

	private int sever;

	private gender sex;

	public allery_testing_class(String a, String b, Date c, int d)

	{

		this.patient = a;

		this.symptom = b;

		this.reported_time = c;

		this.sever = d;

	}

	public String getPatient() {

		return patient;

	}

	public void setPatient(String patient) {

		this.patient = patient;

	}

	public String getSymptom() {

		return symptom;

	}

	public void setSymptom(String symptom) {

		this.symptom = symptom;

	}

	public Date getReported_time() {

		return reported_time;

	}

	public void setReported_time(Date reported_time) {

		this.reported_time = reported_time;

	}

	public int getSever() {

		return sever;

	}

	public void setSever(int sever) {

		this.sever = sever;

	}

	// public

}