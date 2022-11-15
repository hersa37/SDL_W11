package LL;

public class Mahasiswa implements Comparable<Mahasiswa> {

	private int nim;
	private String name;

	public Mahasiswa(int nim, String name) {
		this.nim = nim;
		this.name = name;
	}

	public Mahasiswa(int nim) {
		this.nim = nim;
	}
	@Override
	public int compareTo(Mahasiswa mahasiswa) {
		if (nim == mahasiswa.nim) {
			return 0;
		} else if(nim > mahasiswa.nim) {
			return 1;
		} else return -1;
	}

	public String toString() {
		return nim + " " + name;
	}
}
