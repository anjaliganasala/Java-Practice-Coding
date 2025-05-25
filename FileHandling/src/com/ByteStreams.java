package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

	public static void main(String[] args) {
		ByteStreams bytestreams = new ByteStreams();
		bytestreams.WriteIntoFile();
		//bytestreams.readFromFile();
	}
	private static void readFromFile() {
		File file = new File("D:\\hi.txt");
		FileInputStream fis = null;
		
		try {

			fis = new FileInputStream(file);
			
			int temp;
			while ((temp = fis.read()) != -1) {
				System.out.print((char) temp + "");

			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();

			} catch (IOException e) {
				System.out.println();
			}
		}
	}
    public void WriteIntoFile() {
    	File file = new File("D:\\hi.txt");
    	File file2 = new File("D:\\output.txt");
    	FileOutputStream fos = null;
    	FileInputStream fis = null;

		try {

			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			String data = "Anjali ";
			fos.write(data.getBytes());
			int temp;
			while ((temp = fis.read()) != -1) {
                 fos.write(temp);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fos.close();

			} catch (IOException e) {
				System.out.println();
			}
		}

    }
}
