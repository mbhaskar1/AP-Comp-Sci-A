
/**
 * Economics Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class Economics3 extends Homework3{
    public Economics3(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("Economics");
    }
    
    public void doHomework(int pages){
        setNumPages(Math.max(getNumPages() - pages, 0));
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
