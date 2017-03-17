package mvp.data;

import android.util.Log;

import com.google.gson.Gson;

import java.util.Random;

import mvp.model.AddMemberCommon;
import mvp.model.CheckMemberCommon;
import mvp.model.DelMemberCommon;
import mvp.model.ModifyMemberCommon;
import mvp.model.ResultBean;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jok on 2017/3/17.
 */

public class DataManager implements IData{
    String baseUrl = "http://119.29.150.245:8190/";//120.76.191.204

    @Override
    public void addMember(AddMemberCommon addMemberCommon) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Gson gson = new Gson();
        String route = gson.toJson(addMemberCommon);
        Log.e("test", route.toString());
        HttpInterface postRoute = retrofit.create(HttpInterface.class);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json;charset=utf-8"), route.toString());
        Call<ResultBean> call = postRoute.addMember(body);
        call.enqueue(new Callback<ResultBean>() {
            @Override
            public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                Log.e("test",""+response.body().getMsg());
//                for (AddMemberCommon d : response.body().get().getData()) {
//                    Log.e("test", "-------------");
//                    /**
//                     * 保存消息到数据库
//                     */
//                    try {
//
//                    } catch (Exception e) {
//                    }
//                }

                call.cancel();


            }

            @Override
            public void onFailure(Call<ResultBean> call, Throwable t) {
                Log.e("test", call.toString() + "    error" + t.getMessage());
            }
        });
    }

    @Override
    public void delMember(DelMemberCommon delMemberCommon) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Gson gson = new Gson();
        String route = gson.toJson(delMemberCommon);
        Log.e("test", route.toString());
        HttpInterface postRoute = retrofit.create(HttpInterface.class);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json;charset=utf-8"), route.toString());
        Call<ResultBean> call = postRoute.addMember(body);
        call.enqueue(new Callback<ResultBean>() {
            @Override
            public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                Log.e("test",""+response.body().getMsg());
//                for (AddMemberCommon d : response.body().get().getData()) {
//                    Log.e("test", "-------------");
//                    /**
//                     * 保存消息到数据库
//                     */
//                    try {
//
//                    } catch (Exception e) {
//                    }
//                }

                call.cancel();


            }

            @Override
            public void onFailure(Call<ResultBean> call, Throwable t) {
                Log.e("test", call.toString() + "    error" + t.getMessage());
            }
        });
    }

    @Override
    public void modifyMember(ModifyMemberCommon modifyMemberCommon) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Gson gson = new Gson();
        String route = gson.toJson(modifyMemberCommon);
        Log.e("test", route.toString());
        HttpInterface postRoute = retrofit.create(HttpInterface.class);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json;charset=utf-8"), route.toString());
        Call<ResultBean> call = postRoute.addMember(body);
        call.enqueue(new Callback<ResultBean>() {
            @Override
            public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                Log.e("test",""+response.body().getMsg());
//                for (AddMemberCommon d : response.body().get().getData()) {
//                    Log.e("test", "-------------");
//                    /**
//                     * 保存消息到数据库
//                     */
//                    try {
//
//                    } catch (Exception e) {
//                    }
//                }

                call.cancel();


            }

            @Override
            public void onFailure(Call<ResultBean> call, Throwable t) {
                Log.e("test", call.toString() + "    error" + t.getMessage());
            }
        });
    }

    @Override
    public void checkMember(CheckMemberCommon checkMemberCommon) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Gson gson = new Gson();
        String route = gson.toJson(checkMemberCommon);
        Log.e("test", route.toString());
        HttpInterface postRoute = retrofit.create(HttpInterface.class);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json;charset=utf-8"), route.toString());
        Call<ResultBean> call = postRoute.addMember(body);
        call.enqueue(new Callback<ResultBean>() {
            @Override
            public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                Log.e("test",""+response.body().getMsg());
//                for (AddMemberCommon d : response.body().get().getData()) {
//                    Log.e("test", "-------------");
//                    /**
//                     * 保存消息到数据库
//                     */
//                    try {
//
//                    } catch (Exception e) {
//                    }
//                }

                call.cancel();


            }

            @Override
            public void onFailure(Call<ResultBean> call, Throwable t) {
                Log.e("test", call.toString() + "    error" + t.getMessage());
            }
        });
    }
}
