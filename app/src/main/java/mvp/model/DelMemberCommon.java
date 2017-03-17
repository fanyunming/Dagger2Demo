package mvp.model;

import org.json.JSONObject;

/**
 * Created by jok on 2017/3/17.
 */

public class DelMemberCommon extends JSONObject {

    /**
     * company_id : 1
     * member_id : 1281
     */

    private String company_id;
    private String member_id;

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }
}
