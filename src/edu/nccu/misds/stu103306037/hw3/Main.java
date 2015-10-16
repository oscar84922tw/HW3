package edu.nccu.misds.stu103306037.hw3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MalformedURLException,
			IOException {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String urlStr = sc.next();
			String keyword = sc.next();
			KeywordCounter counter = new KeywordCounter(urlStr);
			System.out.println(counter.countKeyword(keyword));
		}
	sc.close();
	}
}
