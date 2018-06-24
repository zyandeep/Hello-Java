class Staff {
    int code;
    String name;

    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public void getData() {
        System.out.println(code + " " + name);
    }
}

class Teacher extends Staff {
    String subject;
    String publication;

    Teacher(int code, String name, String sub, String pub) {
        super(code, name);
        this.subject = sub;
        this.publication = pub;
    }
    public void getData() {
        System.out.println("*** Teacher ***");
        System.out.println(code + " " + name);
        System.out.println(subject + " " + publication);
    }
}  

class Officer extends Staff {
    char grade;

    Officer(int code, String name, char grade) {
        super(code, name);
        this.grade = grade;
    }

    public void getData() {
        System.out.println("*** Officer ***");
        System.out.println(code + " " + name);
        System.out.println(grade);
    }
}

class Typist extends Staff {
    int speed;

    Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }  
}

class Casual extends Typist {
    double dailyWages;

    Casual(int code, String name, int speed, double dw) {
        super(code, name, speed);
        this.dailyWages = dw;
    }

    public void getData() {
        System.out.println("*** Casual Typist ***");
        System.out.println(code + " " + name);
        System.out.println(speed);
        System.out.println(dailyWages);
    } 
}

class Regular extends Typist {
    Regular(int code, String name, int speed) {
        super(code, name, speed);
    }

    public void getData() {
        System.out.println("*** Regular Typist ***");
        System.out.println(code + " " + name);
        System.out.println(speed);
    } 
}


class Ex8_20 {
    
    public static void main(String[] args) {
        Teacher t = new Teacher(123, "Jon", "English", "Mc Graw Hill");
        t.getData();
        Officer f = new Officer(220, "Chandler", 'B');
        f.getData();
        Regular r = new Regular(810, "Joey", 30);
        r.getData();
    }    
}