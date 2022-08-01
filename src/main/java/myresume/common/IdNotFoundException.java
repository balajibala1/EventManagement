package myresume.common;

public class IdNotFoundException extends Exception {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public IdNotFoundException() {
    }

    public IdNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
