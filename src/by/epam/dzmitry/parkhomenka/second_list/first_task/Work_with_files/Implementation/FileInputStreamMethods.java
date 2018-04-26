package by.epam.dzmitry.parkhomenka.second_list.first_task.Work_with_files.Implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMethods{
	public void readFile(File file) {
		FileInputStream fis = null;
		int b = 0;

		try {
			fis = new FileInputStream(file);
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
