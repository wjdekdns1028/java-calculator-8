package calculator.domain;

import java.util.regex.Pattern;

public class InputString {
    private static final String DEFAULT_DELIMITER_REGEX = "[,:]";

    private final String normalizedBody;
    private final String delimiterRegex;

    private InputString(String normalizedBody, String delimiterRegex) {
        this.normalizedBody = normalizedBody;
        this.delimiterRegex = delimiterRegex;
    }

    public static InputString of(String raw){
        if(raw == null || raw.isEmpty()){
            return new InputString("", DEFAULT_DELIMITER_REGEX);
        }

        String normalized = raw.replace("\\n", "\n");

        if(normalized.startsWith("//")){
            int idx = normalized.indexOf("\n");
            if (idx == -1){
                throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
            }

            String customDelimiter = normalized.substring(2, idx);
            String delimiterRegex = Pattern.quote(customDelimiter);
            String body = normalized.substring(idx+1);
            return new InputString(body, delimiterRegex);
        }

        return new InputString(normalized, DEFAULT_DELIMITER_REGEX);
    }

    public Tokens toTokens(){
        if(normalizedBody.isEmpty()){
            return Tokens.of(new String[0]);
        }
        String[] parts = normalizedBody.split(delimiterRegex);
        return Tokens.of(parts);
    }
}
