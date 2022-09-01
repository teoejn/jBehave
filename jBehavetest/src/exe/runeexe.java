package exe;
 
import java.util.Arrays;
import java.util.List;
 
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import steps.runsteps;


 
public class runeexe extends JUnitStories {
 
    public runeexe() {
        super();
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new runsteps());
    }
 
    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("samplestories.story");
    }
}