import java.util.Vector;

class DupValue {
    
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Delhi");
        v.add("Mumbai");
        v.add("Calcutta");
        v.add("Chennai");
        v.add("Delhi");

        Vector tmpVector = new Vector();
        String tmpValue;

        for (int i = 0; i < v.size(); i++) {
            tmpValue = (String) v.elementAt(i);

            if (tmpValue != null) {
                if (tmpVector.indexOf(tmpValue) == -1) {
                    tmpVector.addElement(tmpValue);
                }
            }
        }

        System.out.println(tmpVector.toString());
    }
}