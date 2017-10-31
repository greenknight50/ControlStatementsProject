package com.control.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class UserModel implements Comparable<UserModel> {

	private int userId;
	private String userName;
	private int yearOfBirth;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public UserModel(int userId, String userName, int yearOfBirth) {
		this.userId = userId;
		this.userName = userName;
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public int compareTo(UserModel object) {
		if (this.userId > object.userId) {
			return 1;
		} else if (this.userId < object.userId) {
			return -1;
		} else
			return 0;
	}

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(36);
		treeSet.add(12);
		treeSet.add(93);
		treeSet.add(5);
		System.out.println("Ceiling: " + treeSet.ceiling(20));
		System.out.println("TreeSet Values: " + treeSet);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");
		arrayList.add("All");
		arrayList.add("Subject");
		arrayList.add("Bats");
		System.out.println("Before sortig: " + arrayList);
		Collections.sort(arrayList);
		System.out.println("After sortig: " + arrayList);
		ArrayList<UserModel> treeSetMain = new ArrayList<UserModel>();
		UserModel obj1 = new UserModel(101, "Ashraf", 1985);
		UserModel obj2 = new UserModel(301, "Mohammed", 1980);
		UserModel obj3 = new UserModel(201, "Raheem", 1988);
		treeSetMain.add(obj1);
		treeSetMain.add(obj2);
		treeSetMain.add(obj3);
		Collections.sort(treeSetMain);
		System.out.println("After sorting collection by userId: ");
		/*for (int i = 0; i < treeSetMain.size(); i++) {
			UserModel tempObj = treeSetMain.get(i);
			System.out.println("userId: " + tempObj.userId + ", userName: " + tempObj.userName + ", yearOfBirth: "
					+ tempObj.yearOfBirth);
		}*/
		for (UserModel obj : treeSetMain) {
			System.out.println(
					"userId: " + obj.userId + ", userName: " + obj.userName + ", yearOfBirth: " + obj.yearOfBirth);
		}
		Collections.sort(treeSetMain, new UserNameSorting());
		System.out.println("After sorting collection by userName: ");
		for (UserModel obj : treeSetMain) {
			System.out.println(
					"userId: " + obj.userId + ", userName: " + obj.userName + ", yearOfBirth: " + obj.yearOfBirth);
		}
		YearOfBirthSorting yearOfBirthSorting = new YearOfBirthSorting();
		Collections.sort(treeSetMain, yearOfBirthSorting);
		System.out.println("After sorting collection by year of birth: ");
		for (UserModel obj : treeSetMain) {
			System.out.println(
					"userId: " + obj.userId + ", userName: " + obj.userName + ", yearOfBirth: " + obj.yearOfBirth);
		}
	}

}

class YearOfBirthSorting implements Comparator<UserModel> {
	@Override
	public int compare(UserModel o1, UserModel o2) {
		if (o1.getYearOfBirth() > o2.getYearOfBirth()) {
			return 1;
		} else if (o1.getYearOfBirth() < o2.getYearOfBirth()) {
			return -1;
		} else
			return 0;
	}
}

class UserNameSorting implements Comparator<UserModel> {

	@Override
	public int compare(UserModel o1, UserModel o2) {
		return o1.getUserName().compareTo(o2.getUserName());
	}

}
