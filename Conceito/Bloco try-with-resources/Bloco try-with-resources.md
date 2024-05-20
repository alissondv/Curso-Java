# Bloco try-with-resources
> É um bloco try que declara um ou mais recursos, e garante que esses
recursos serão fechados ao final do bloco

~~Javascript
public static void main(String[] args) {
		String path = "C:\\text.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();

			while(line !=null){
				System.out.println(line);
				line = br.readLine(); 	
			}
		}catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	

	}
~~~~