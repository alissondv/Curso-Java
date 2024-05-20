BufferedWriter
stream de escrita de caracteres em de arquivos

Cria/recria o arquivo: new FileWriter(path)


Acrescenta ao arquivo existente: new FileWriter(path, true)

#BufferedWriter
>mais rápido

~~~javascript 
System.out.println("Enter a folder path: ");
	String strPath = sc.nextLine();
	
	File path = new File(strPath);
	
	File[] folders = path.listFiles(File::isFile);
	System.out.println("Folders: ");
	for(File files:folders) {
		System.out.println(files);
	}
	}
~~~~