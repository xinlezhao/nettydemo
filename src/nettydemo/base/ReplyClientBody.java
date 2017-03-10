package nettydemo.base;

/**
 * Created by xinle on 3/10/17.
 */

public class ReplyClientBody extends ReplyBody {
    private String clientInfo;

    public ReplyClientBody(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }
}