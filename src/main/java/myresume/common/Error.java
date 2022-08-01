package myresume.common;

public class Error {
    private String target;
    private String msg;

    public Error(String target, String msg) {
        this.target = target;
        this.msg = msg;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
