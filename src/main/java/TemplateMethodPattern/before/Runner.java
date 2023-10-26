package TemplateMethodPattern.before;

public class Runner {
    public static void main(String[] args) {
        Param param = new Param();
        ParamBuilder paramBuilder = new ParamBuilder();
        // 处理数据A
        boolean result = paramBuilder.buildA(param);
        if (!result) {
            return;
        }
        boolean inserted = doIt(param);
        if (!inserted) {
            return;
        }
        // 处理数据B
        result = paramBuilder.buildB(param);
        if (!result) {
            return;
        }
        inserted = doIt(param);
        if (!inserted) {
            return;
        }
        // 处理数据C
        result = paramBuilder.buildC(param);
        if (!result) {
            return;
        }
        inserted = doIt(param);
        if (!inserted) {
            return;
        }
        // 处理数据D
        result = paramBuilder.buildD(param);
        if (!result) {
            return;
        }
        inserted = doIt(param);
        if (!inserted) {
            return;
        }
        // 处理数据E
        result = paramBuilder.buildE(param);
        if (!result) {
            return;
        }
        inserted = doIt(param);
        if (!inserted) {
            return;
        }
    }

    public static boolean doIt(Param param) {
        return param.flag;
    }
}
