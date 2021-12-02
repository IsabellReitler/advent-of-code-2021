package de.aoc.first;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SonarSweepPart2 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		BufferedReader br = null;
	       try {
	       br = new BufferedReader(new FileReader("D:\\privaterWorkspace\\advent_of_code\\src\\advent_of_code\\first\\Input.txt"));
	           String line;
	        while( (line= br.readLine()) != null){
	            values.add(Integer.valueOf(line));
	        }
	        int inc = 0;
	        List<Integer> sums = new ArrayList<Integer>();
	        for(int index = 1; index < values.size()-1; index++){
	        	sums.add(values.get(index-1)+values.get(index)+values.get(index+1));
	        }
	        
	        for(int index = 1; index < sums.size(); index++) {
	            if(sums.get(index)> sums.get(index-1)){
	                inc++;
	            }
	        }
	        
	        System.out.println("Das Ergebnis ist: "+inc);
	       }catch(FileNotFoundException e){
	           e.printStackTrace();
	       } catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
