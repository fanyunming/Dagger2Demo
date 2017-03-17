package mvp.data;

import mvp.model.AddMemberCommon;
import mvp.model.CheckMemberCommon;
import mvp.model.DelMemberCommon;
import mvp.model.ModifyMemberCommon;
import mvp.model.ResultBean;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by jok on 2017/3/17.
 */

public interface HttpInterface {
    @Headers({"Content-Type:application/json","Accept:application/json","Connection:close"})//需要添加头
    @POST("api_add_member_face")
    Call<ResultBean> addMember (@Body RequestBody route) ;

    @Headers({"Content-Type:application/json","Accept:application/json","Connection:close"})//需要添加头
    @POST("api_verify_member_face")
    Call<CheckMemberCommon> checkMember (@Body RequestBody route) ;

    @Headers({"Content-Type:application/json","Accept:application/json","Connection:close"})//需要添加头
    @POST("api_update_member_face")
    Call<ModifyMemberCommon> updateMember (@Body RequestBody route) ;

    @Headers({"Content-Type:application/json","Accept:application/json","Connection:close"})//需要添加头
    @POST("api_add_member_face")
    Call<DelMemberCommon> delMember (@Body RequestBody route) ;
}
