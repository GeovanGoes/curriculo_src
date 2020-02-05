package br.com.goes.curriculo.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
	public static File multipartToFile(final MultipartFile multipartFile) {
		
		File file = null;

		if(multipartFile != null) {
			try {
				String extension = FilenameUtils.getExtension(multipartFile.getOriginalFilename());
				file = File.createTempFile("img", "." + extension);
				
				if (file.exists()) {
					multipartFile.transferTo(file);
				}
			} catch (IllegalStateException | IOException e) {
				//LOG HERE
			}
		}
		
		
		return file;
	}
}
