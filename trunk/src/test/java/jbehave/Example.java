package jbehave;

import jbehave.steps.ExampleSteps;
import lombok.extern.slf4j.Slf4j;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;


@Slf4j
public class Example extends JUnitStories {
//public class Example  {
    private Configuration configuration;
    public Example() {
        super();
        configuration = new Configuration() {
        };



        EmbedderControls embedderControls = configuredEmbedder()
                .embedderControls();


    }


    @Override
    public Configuration configuration() {
        return configuration;
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
//        return new StoryFinder().findPaths("/opt/nisum/workspaces/git/restwebservice/trunk/build/classes/test/../../resources/test/jbehave/stories/", "stories/*.story", "");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info(codeLocationFromClass(this.getClass()).getFile());
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        log.info("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(), Arrays.asList("**/*.story"), null);
    }



}

