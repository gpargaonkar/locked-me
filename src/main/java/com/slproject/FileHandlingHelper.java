package com.slproject;

import java.io.File;
import java.nio.file.NotDirectoryException;

public class FileHandlingHelper {

	public void readFileNames(String path) throws NotDirectoryException {
		File a = new File(path);
		String[] fileNames = a.list();
		if(!a.exists()) {
			throw new NotDirectoryException(path+" Not a valid directory! Please try again");
		}
		System.out.println("Number of files: "+fileNames.length);
		for(int i=0; i<fileNames.length;i++) {
			System.out.println(fileNames[i]);
		}
	}
	
}
