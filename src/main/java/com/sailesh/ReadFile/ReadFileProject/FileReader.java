/**
 * 
 */
package com.sailesh.ReadFile.ReadFileProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ShresthaS
 * This program reads the file line by line and print it on console.
 * BufferredReader is used read the file provided..
 */
public class FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//Initializing buffered reader
		BufferedReader bufferReader;
		
		//try/catch exception if file does not exit in the respective location
		try {
			bufferReader = new BufferedReader(new java.io.FileReader("readMe.text"));
			
			//Converting the line read from the bufferedReader into String...
			String string =bufferReader.readLine();
			
			//while condition to check the string null or not
			while(null!=string){
				
				//Printing the lines in console from the file
				System.out.println(string);
				string=bufferReader.readLine();
			}
			//Closing the buffered reader class after task completed
			bufferReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
