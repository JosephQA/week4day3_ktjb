package Doggo;

public enum Places {
	one("st"), two("nd"), three("rd"), four("th"), five("th"), six("th"), seven("th"), eight("th"), nine("th"),;

	private String fld;

	Places(String string) {
		this.fld = string;
	}

	public String getField() {
		return fld;
	}
}
