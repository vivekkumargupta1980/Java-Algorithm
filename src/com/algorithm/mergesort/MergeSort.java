package com.algorithm.mergesort;

public class MergeSort {
	int[] data = { 10, 20, 30, 40, 50 };
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(mergeSort.data, 0, mergeSort.data.length - 1);
	}
	private void mergeSort(int[] data, int left, int right) {
		if (right <= left) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(data, left, mid);
		mergeSort(data, mid + 1, right);
	}
}
