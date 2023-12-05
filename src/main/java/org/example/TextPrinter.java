package org.example;

public class TextPrinter {

    private TextFormatter textFormatter;

    void printText(String text) {
        String formattedText = textFormatter.formatText(text);
        System.out.println(formattedText);
    }

    public TextFormatter getTextFormatter() {
        return textFormatter;
    }

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }
}
