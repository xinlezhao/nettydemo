package nettydemo.base;

/**
 * Created by xinle on 3/10/17.
 */

public class PingMsg extends BaseMsg {
    public PingMsg() {
        super();
        setType(MsgType.PING);
    }
}
