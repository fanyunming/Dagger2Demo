package mvp.model;

import org.json.JSONObject;

/**
 * Created by jok on 2017/3/17.
 */

public class ResultBean  extends JSONObject {

    /**
     * code : 200
     * msg : ok
     */

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
