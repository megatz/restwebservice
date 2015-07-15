package jbehave;

import jbehave.steps.ExampleSteps;
import lombok.extern.slf4j.Slf4j;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;


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
        return new StoryFinder().findPaths("/opt/nisum/workspaces/git/restwebservice/trunk/src/test/resources/", "stories/*.story", "");
    }



//    public static void main(String[] args) {
//        DirectoryScanner scanner = new DirectoryScanner();
//        scanner.setBasedir("/opt/nisum/workspaces/git/gs-spring-boot/complete/build/resources/test");
//        scanner.setIncludes(new String[]{"**/**/**/stories/*.story"});
//        scanner.scan();
//        System.out.println("flag");
//        System.out.println(scanner.getIncludedFiles()[0]);
//
//    }

}

