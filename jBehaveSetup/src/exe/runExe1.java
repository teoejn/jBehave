package exe;
 
import java.util.Arrays;
import java.util.List;
 
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import steps.java.runsteps;


 
public class runExe1 extends JUnitStories {
 
    public runExe1() {
        super();
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new runsteps());
    }
 
    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("Samplestory.story");
    }
}