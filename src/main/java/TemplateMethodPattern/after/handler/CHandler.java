package TemplateMethodPattern.after.handler;

import TemplateMethodPattern.before.Param;

public class CHandler extends AbstractHandler{
    @Override
    protected boolean build(Param param) {
        return true;
    }
}
