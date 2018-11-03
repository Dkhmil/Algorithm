package khmil;

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

interface TextAnalyzer {
    Label processText(String text);
}

public abstract class KeyWordAnalyzer implements TextAnalyzer {
    protected abstract String[] getkeyWords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        String[] keyWords = getkeyWords();
        for (String s : keyWords) {
            if (text.contains(s)) {
                return getLabel();
            }
        }
        return Label.OK;

    }


    class SpamAnalyzer extends KeyWordAnalyzer implements TextAnalyzer {
        private String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getkeyWords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    class NegativeTextAnalyzer extends KeyWordAnalyzer implements TextAnalyzer {
        private final String[] KEYWORDS = {":(", "=(", ":|"};

        @Override
        protected String[] getkeyWords() {
            return KEYWORDS;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public Label processText(String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            }
            return Label.OK;
        }
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text)  throws ClassCastException{
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }
}