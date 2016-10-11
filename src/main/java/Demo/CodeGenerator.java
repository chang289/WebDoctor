package Demo;

import org.jooq.util.GenerationTool;
import org.junit.Test;

/**
 * Created by IAN on 2016/10/10.
 */
public class CodeGenerator {

    @Test
    public void generateCode() throws Exception {
        GenerationTool.generate(GenerationTool.load(ClassLoader.getSystemClassLoader().getResourceAsStream("config/jooq.xml")));
    }

}
