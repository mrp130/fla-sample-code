package composite;

public class Main {

	public static void main(String[] args) {
		//folder: 1
		//-> folder: 1a
		//-> folder: 1b
		//----> file: a

		Folder f1 = new Folder();
		Folder f1a = new Folder();
		Folder f1b = new Folder();
		File a = new File();
		
		f1.add(f1a);
		f1.add(f1b);
		f1b.add(a);		
	}

}
