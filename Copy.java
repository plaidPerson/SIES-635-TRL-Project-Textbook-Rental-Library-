
public class Copy
{
	private String copyID;
	private String title;
	private Patron outTo;

	public Copy(String copyID, String title)
	{
		// finish this
	}

// Generate getters and setters using Eclipse Source menu.
	//Heather generated getter and setters by clicking Source -> Generate Getters and Setters.

	public String getCopyID() {
		return copyID;
	}

	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Patron getOutTo() {
		return outTo;
	}

	public void setOutTo(Patron outTo) {
		this.outTo = outTo;
	}

	public String toString()
	{
		// finish this
		return ""; 
	}

	@Override
	public boolean equals(Object o)
	{
		// finish this: two are equals iff same copy ID

		return false;
	}

	public static void main(String[] args)
	{
		Copy c1 = new Copy("C1", "Fun with Objects");
		Patron p1 = new Patron("Eric", "P47");

		System.out.println(c1);
		System.out.println(p1);
		
		Copy c2 = FakeDB.getCopy("C2");
	}
}
