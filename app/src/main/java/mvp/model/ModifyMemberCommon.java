package mvp.model;

import org.json.JSONObject;

/**
 * Created by jok on 2017/3/17.
 */

public class ModifyMemberCommon extends JSONObject {

    /**
     * company_id : 1
     * member_id : 1281
     * face_image_type : jpg
     * face_image_data : dHR0dHJydHJydA==
     */

    private String company_id;
    private String member_id;
    private String face_image_type;
    private String face_image_data;

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

    public String getFace_image_type() {
        return face_image_type;
    }

    public void setFace_image_type(String face_image_type) {
        this.face_image_type = face_image_type;
    }

    public String getFace_image_data() {
        return face_image_data;
    }

    public void setFace_image_data(String face_image_data) {
        this.face_image_data = face_image_data;
    }
}
