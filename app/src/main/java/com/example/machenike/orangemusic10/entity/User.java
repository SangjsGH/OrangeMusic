package com.example.machenike.orangemusic10.entity;

import com.example.machenike.orangemusic10.utils.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;

@HttpResponse(parser = JsonRespondParse.class)
public class User implements Serializable{
    /**
     * result : {"msg":"登录成功！","data":{"password":"123","username":"lt"},"url":"resource/page/shopIndex.jsp"}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean implements Serializable {
        /**
         * msg : 登录成功！
         * data : {"password":"123","username":"lt"}
         * url : resource/page/shopIndex.jsp
         */

        private String msg;
        private DataBean data;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            /**
             * password : 123
             * username : lt
             */

            private String password;
            private String username;

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }
}
