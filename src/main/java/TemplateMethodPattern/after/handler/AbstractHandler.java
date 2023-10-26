package TemplateMethodPattern.after.handler;

import TemplateMethodPattern.before.Param;

import java.util.function.Function;

public abstract class AbstractHandler {
    protected abstract boolean build(Param param);

    public boolean process(Param param, Function<Param, Boolean> doIt) {
        boolean result = build(param);
        if (!result) {
            return false;
        }
        return doIt.apply(param);
    }
}
