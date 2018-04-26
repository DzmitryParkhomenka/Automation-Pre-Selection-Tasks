package by.epam.dzmitry.parkhomenka.second_list.first_task.Work_with_files.Implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import by.epam.dzmitry.parkhomenka.second_list.first_task.Confection.Implementation.Confection;

public class FileOutputStreamMethods{
	public void writeFile(File file, String str) {
		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(file, true);
			fileOutputStream.write(str.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void writeSweetNamesToFile(List<Confection> present, FileOutputStreamMethods fileOutputStreamMethods, File file) {
		for (int i = 0; i < present.size(); i++) {
			fileOutputStreamMethods.writeFile(file, present.get(i).getName());
		}
	}
}
