class Tile {

    private char letter;
    private int value;

    Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public char getLetter() {
        return letter;
    }
    public int getValue() {
        return value;
    }

    public String toString() {
        return String.format("Tile: '%c', %d", this.getLetter(), getValue());
    }
    public boolean equals(Tile t) {
        return (this.letter == t.letter && this.value == t.value);
    }    
}

class Ex11_3 {

    public static void main(String[] args) {
        testTile('Z', 10);

        System.out.println(new Tile('A', 10).equals(new Tile('Z', 111)));
        System.out.println(new Tile('A', 10).equals(new Tile('A', 10)));
    }

    static void printTile(Tile t) {
        System.out.println("Tile character: " + t.getLetter());
        System.out.println("Tile value: " + t.getValue());
        System.out.println(t);
    }
    static void testTile(char letter, int value) {
        Tile t = new Tile(letter, value);
        printTile(t);
    }
}