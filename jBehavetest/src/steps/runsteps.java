package steps;

import org.jbehave.core.annotations.Given;


public class runsteps {
    
    @Given("a number is there")
    public void numberrun() {
        System.out.println("1 "+ "\n" +"2" + "\n" + "3");
    }

}