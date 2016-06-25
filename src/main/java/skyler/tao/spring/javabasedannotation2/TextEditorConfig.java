package skyler.tao.spring.javabasedannotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chaoqiang on 16/6/14.
 */
@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}
