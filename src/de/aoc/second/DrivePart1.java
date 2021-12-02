package de.aoc.second;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DrivePart1 {

	public static void main(String[] args) {
		int horizontal = 0;
		int depth = 0;
		List<String> command = new ArrayList<String>();
		List<Integer> width = new ArrayList<Integer>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader("D:\\privaterWorkspace\\advent_of_code\\src\\de\\aoc\\second\\Input.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitLine = line.split(" ");
				command.add(splitLine[0]);
				width.add(Integer.valueOf(splitLine[1]));
			}
			for (int index = 0; index < command.size(); index++) {
				switch (command.get(index)) {
				case "forward":
					horizontal += width.get(index);
					break;
				case "up":
					depth -= width.get(index);
					break;
				case "down":
					depth += width.get(index);
					break;
				}
			}
			System.out.println("Die Tiefe beträgt: "+depth+"; Die Weite beträgt: "+horizontal+"; Das Gesamtergebnis ist: "+(depth*horizontal));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
