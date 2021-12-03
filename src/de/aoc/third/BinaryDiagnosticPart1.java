package de.aoc.third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BinaryDiagnosticPart1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String gamma = "";
		String epsilon = "";
		List<String> binaries = new ArrayList<String>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\privaterWorkspace\\advent_of_code\\src\\de\\aoc\\third\\Input.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				binaries.add(line);
			}
			for(int index = 0; index<binaries.get(0).length(); index++) {
				int zeros = 0;
				int ones = 0;
				for(String s: binaries) {
					switch(s.charAt(index)) {
					case '0': zeros++; break;
					case '1': ones++; break;
					}
				}
				if(zeros>ones) {
					gamma +="0";
					epsilon +="1";
				}else {
					gamma +="1";
					epsilon +="0";
				}
			}
			int gammaInt = Integer.parseInt(gamma, 2);
			int epsilonInt = Integer.parseInt(epsilon, 2);
			System.out.print("Gamma: "+gammaInt+"; Epsilon: "+epsilonInt+"; Product: "+(gammaInt*epsilonInt));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
