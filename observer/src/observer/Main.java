package observer;

public class Main {

	public static void main(String[] args) {
		HeadHunter hIT = new HeadHunter();
		HeadHunter hOB = new HeadHunter();
		
		JobSeeker andi = new JobSeeker("andi");
		JobSeeker budi = new JobSeeker("budi");
		JobSeeker charlie = new JobSeeker("charlie");
		
		hIT.attach(andi);
		hIT.attach(budi);
		hIT.attach(charlie);
		
		hOB.attach(charlie);
		
		hIT.PostNewJob("frontend programmer di IT div bunis");
		hOB.PostNewJob("office boy di binus square");
		
		hIT.detach(andi);
		
		hIT.PostNewJob("Backend di binus");
	}

}
