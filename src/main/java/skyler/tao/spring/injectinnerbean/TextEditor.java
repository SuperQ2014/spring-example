package skyler.tao.spring.injectinnerbean;

/**
 * Created by chaoqiang on 16/6/13.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    //setter
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Indide setSpellChecker");
        this.spellChecker = spellChecker;
    }

    //getter
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
