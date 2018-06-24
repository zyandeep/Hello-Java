// how to search a String from backwards
// date: 09-09-14

package myPackage;

public class StringSearch {

    String text, word;
    
    public StringSearch() 
    {
        text = "this is Java test for searching java Steing from backwards in a JAVA text";
        word = "java";
    }

    
    private void search() 
    {
        text = text.toLowerCase();
        word = word.toLowerCase();
        
        int from = text.length() - 1;
        
        while(true)
        {
            int pos = text.lastIndexOf(word, from);
            
            if(pos != -1)
            {
                System.out.println("found at " + pos + "\t" + text.substring( pos,  pos + 4 ));
                from = --pos;
            }
            
            else
                break;
        }
    }
    
    
    public static void main(String[] args)
    {
        new StringSearch().search();
    }
}
