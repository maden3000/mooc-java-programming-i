
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        int count = 0;
        String ret;
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else if(this.elements.size() == 1){
            ret = "The collection " + this.name + " has " + this.elements.size() + " element:" + '\n';
        }else{
            ret = "The collection " + this.name + " has " + this.elements.size() + " elements:" + '\n';
        }
        
        int lunghezza = this.elements.size() - 1;
       
        for (String element : this.elements) {
            if (count == lunghezza) {
                ret += element;
            } else {
                ret += element + '\n';
            }
            count++;
        }
        return ret;
    }
}
