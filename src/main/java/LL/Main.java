package LL;

public class Main {

	public static void main(String[] args) {
		LinkedList<Mahasiswa> ll = new LinkedList<>();
		ll.addFirst(new Mahasiswa(215314018, "Hersa"));
		ll.addFirst(new Mahasiswa(215314019, "Echa"));
		System.out.println(ll.search(new Mahasiswa(215314018)));
	}
}
