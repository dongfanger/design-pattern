package TemplateMethodPattern.after.handler;

import TemplateMethodPattern.before.Param;

public class DHandler extends AbstractHandler{
    @Override
    protected boolean build(Param param) {
        return false;
    }
}
