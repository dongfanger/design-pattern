package TemplateMethodPattern.after.handler;

import TemplateMethodPattern.before.Param;

public class EHandler extends AbstractHandler{
    @Override
    protected boolean build(Param param) {
        return true;
    }
}
