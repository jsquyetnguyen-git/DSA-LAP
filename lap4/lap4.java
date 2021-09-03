package lap4;

public class lap4 {
	public static void main(String[] args) {
		String name[] = { "HOA", "HA", "LAN", "NOI", "MUA", "NAY" };
		int age[] = { 25, 17, 26, 19, 23, 21 };

		MyList mylist = new MyList();
		mylist.addMany(age, name);

		mylist.traverse();

		System.out.println("\nSORT BY NAME:");
		mylist.sort();
		
	}
}
