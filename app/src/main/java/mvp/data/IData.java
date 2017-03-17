package mvp.data;

import mvp.model.AddMemberCommon;
import mvp.model.CheckMemberCommon;
import mvp.model.DelMemberCommon;
import mvp.model.ModifyMemberCommon;

/**
 * Created by jok on 2017/3/17.
 */

public interface IData {
    public void addMember(AddMemberCommon addMemberCommon);
    public void delMember(DelMemberCommon delMemberCommon);
    public void modifyMember(ModifyMemberCommon modifyMemberCommon);
    public void checkMember(CheckMemberCommon checkMemberCommon);
}
