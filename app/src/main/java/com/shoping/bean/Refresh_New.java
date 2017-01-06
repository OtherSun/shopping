package com.shoping.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/1/3 0003.
 */

public class Refresh_New {


    private  int server_time;
    private List<GoodsListBean> goods_list;

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public List<GoodsListBean> getGoods_list() {
        return goods_list;
    }

    public void setGoods_list(List<GoodsListBean> goods_list) {
        this.goods_list = goods_list;
    }

    public static class GoodsListBean {
        /**
         * normal_price : 7900
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/unknown/0/qOctU3vJsDRXMrducsO0K8wo8HkxLFtY.jpg
         * event_type : 0
         * market_price : 39900
         * goods_name : 新款大码显瘦中长款假两件格纹连衣裙
         * country :
         * goods_id : 1828435
         * short_name : 新款大码显瘦中长款假两件格纹连衣裙
         * group : {"customer_num":2,"price":5900}
         * image_url : http://omsproductionimg.yangkeduo.com/images/unknown/0/BkRlteMyGKA4BwqARaUBrxNPfpL5gSxi.jpg
         * time : 1483513813
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/unknown/0/sdOzpYin4hWbmkTjFNqwnQxXbImj4uI3.jpg
         * is_app : 0
         */

        private int normal_price;
        private String thumb_url;
        private int event_type;
        private int market_price;
        private String goods_name;
        private String country;
        private int goods_id;
        private String short_name;
        private GroupBean group;
        private String image_url;
        private int time;
        private String hd_thumb_url;
        private int is_app;

        public int getNormal_price() {
            return normal_price;
        }

        public void setNormal_price(int normal_price) {
            this.normal_price = normal_price;
        }

        public String getThumb_url() {
            return thumb_url;
        }

        public void setThumb_url(String thumb_url) {
            this.thumb_url = thumb_url;
        }

        public int getEvent_type() {
            return event_type;
        }

        public void setEvent_type(int event_type) {
            this.event_type = event_type;
        }

        public int getMarket_price() {
            return market_price;
        }

        public void setMarket_price(int market_price) {
            this.market_price = market_price;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(int goods_id) {
            this.goods_id = goods_id;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public GroupBean getGroup() {
            return group;
        }

        public void setGroup(GroupBean group) {
            this.group = group;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getHd_thumb_url() {
            return hd_thumb_url;
        }

        public void setHd_thumb_url(String hd_thumb_url) {
            this.hd_thumb_url = hd_thumb_url;
        }

        public int getIs_app() {
            return is_app;
        }

        public void setIs_app(int is_app) {
            this.is_app = is_app;
        }

        public static class GroupBean {
            /**
             * customer_num : 2
             * price : 5900
             */

            private int customer_num;
            private int price;

            public int getCustomer_num() {
                return customer_num;
            }

            public void setCustomer_num(int customer_num) {
                this.customer_num = customer_num;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }
}
