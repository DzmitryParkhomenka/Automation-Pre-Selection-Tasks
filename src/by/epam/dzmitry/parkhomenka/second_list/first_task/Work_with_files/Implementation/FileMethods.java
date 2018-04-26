package by.epam.dzmitry.parkhomenka.second_list.first_task.Work_with_files.Implementation;

import java.io.File;
import java.io.FileNotFoundException;

public class FileMethods{
	public File createFile() throws FileNotFoundException {
		File file = new File("E:/SweetBox.txt");
		return file;
	}
}
