package uk.org.webcompere.modelassert.json.condition;

import uk.org.webcompere.modelassert.json.Condition;

import java.util.regex.Pattern;

public class Conditions {
    public static Condition isNull() {
        return NullCondition.getInstance();
    }

    public static Condition isNotNull() {
        return isNull().inverted();
    }

    public static Condition isEmpty() {
        return IsEmpty.getInstance();
    }

    public static Condition isMissing() {
        return MissingCondition.getInstance();
    }

    public static Condition matchesText(String regex) {
        return new MatchesTextCondition(Pattern.compile(regex));
    }

    public static Condition matchesText(Pattern pattern) {
        return new MatchesTextCondition(pattern);
    }
}
