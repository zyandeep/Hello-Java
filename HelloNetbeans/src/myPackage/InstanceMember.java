// instance members can be accessed from an another class without instance
// date: 17-07-2014

package myPackage;

public class InstanceMember {
    
    StringBuffer name;
    int roll;

    public InstanceMember(StringBuffer name, int roll) {
        
        this.name = name;
        this.roll = roll;
        
        callTest();
    }
    
    void callTest() {
        new Test(this.name, this.roll);
        System.out.println("name: " + name + " roll no: " + roll);
    } 
    
    public static void main (String[] args) {
        
        new InstanceMember(new StringBuffer("zyandeep"), 39);
    }
}

class Test {

    public Test (StringBuffer name, int roll) {
        
        name.reverse();
        System.out.println("name: " + name + " roll no: " + ++roll);
    
    }
    
}
