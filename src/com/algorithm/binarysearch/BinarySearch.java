package com.algorithm.binarysearch;

public class BinarySearch {
	int[] data = { 10, 20, 30, 40, 50 };
	int key = 30;

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		boolean isFound = binarySearch.binarySearch(binarySearch.data, binarySearch.key);
		if (isFound) {
			System.out.println("Key : " + binarySearch.key + " is found.");
		} else {
			System.out.println("Key : " + binarySearch.key + " is not found.");
		}
	}

	private boolean binarySearch(int[] data, int key) {
		int low = 0;
		int high = data.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key == data[mid]) {
				return true;
			}
			if (key < data[mid]) {
				high = mid - 1;
			}
			if (key > data[mid]) {
				low = mid  + 1;
			}
		}
		return false;
	}

}
