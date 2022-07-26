package registration.common;

public class AddonNotFoundException extends Exception{
    private String msg;

    public AddonNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }


    public AddonNotFoundException() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
