package TemplateMethodPattern.after;

import TemplateMethodPattern.after.handler.*;
import TemplateMethodPattern.before.Param;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Param param = new Param();
        List<AbstractHandler> handlers = Arrays.asList(
                new AHandler(),
                new BHandler(),
                new CHandler(),
                new DHandler(),
                new EHandler()
        );
        for (AbstractHandler handler : handlers) {
            if (!handler.process(param, Runner::doIt)) {
                return;
            }
        }
    }

    public static boolean doIt(Param param) {
        return param.flag;
    }
}
